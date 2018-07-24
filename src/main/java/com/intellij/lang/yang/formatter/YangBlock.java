package com.intellij.lang.yang.formatter;

import com.intellij.formatting.*;
import com.intellij.formatting.templateLanguages.BlockWithParent;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.formatter.FormatterUtil;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static com.intellij.lang.yang.psi.YangTypes.*;

/**
 *
 */
public class YangBlock extends AbstractBlock implements BlockWithParent {
    private static final Logger LOG = Logger.getInstance(YangBlock.class);

    public static final TokenSet ALL_BRACES = TokenSet.create(YANG_LEFT_BRACE, YANG_RIGHT_BRACE);
    public static final TokenSet OPEN_BRACES = TokenSet.create(YANG_LEFT_BRACE);

    private final Indent myIndent;

    private BlockWithParent myParent;
    private Wrap myChildWrap;

    private final CodeStyleSettings mySettings;
    private final YangBlockContext myContext;
    private final YangIndentProcessor myIndentProcessor;
    private final YangSpacingProcessor mySpacingProcessor;
    private final YangWrappingProcessor myWrappingProcessor;
    private final YangAlignmentProcessor myAlignmentProcessor;

    public YangBlock(ASTNode node,
                     Wrap wrap,
                     Alignment alignment,
                     CodeStyleSettings settings,
                     YangBlockContext context) {
        super(node, wrap, alignment);
        mySettings = settings;
        myContext = context;
        myIndentProcessor = new YangIndentProcessor(context.getYangSettings());
        mySpacingProcessor = new YangSpacingProcessor(node, context.getYangSettings());
        myWrappingProcessor = new YangWrappingProcessor(node, context.getYangSettings());
        myAlignmentProcessor = new YangAlignmentProcessor(node, context.getYangSettings());
        myIndent = myIndentProcessor.getChildIndent(myNode, context.getMode());
    }

    @Override
    public ASTNode getNode() {
        return myNode;
    }

    @NotNull
    @Override
    public TextRange getTextRange() {
        return myNode.getTextRange();
    }

    @Nullable
    @Override
    public Wrap getWrap() {
        return myWrap;
    }

    @Nullable
    @Override
    public Indent getIndent() {
        return myIndent;
    }

    @Nullable
    @Override
    public Alignment getAlignment() {
        return myAlignment;
    }

    @Override
    protected List<Block> buildChildren() {
        if (isLeaf()) {
            return EMPTY;
        }
        final ArrayList<Block> tlChildren = new ArrayList<>();
        LOG.debug("");
        LOG.debug("");
        LOG.debug("******************************************************");
        LOG.debug("parent===" + this.myNode.getText() + "===");
        int childNum= 0;
        for (ASTNode childNode = getNode().getFirstChildNode(); childNode != null; childNode = childNode.getTreeNext()) {
            if (FormatterUtil.containsWhiteSpacesOnly(childNode)) continue;
            final YangBlock childBlock =
                    new YangBlock(childNode, createChildWrap(childNode), createChildAlignment(childNode), mySettings, myContext);
            childBlock.setParent(this);
            tlChildren.add(childBlock);
            LOG.debug("  " + ++childNum + ":" + childNode.getElementType() + ":" + childNode.getText() + "$" + childBlock.getIndent().getType().toString());
        }
        return tlChildren;
    }

    public Wrap createChildWrap(ASTNode child) {
        return myWrappingProcessor.createChildWrap(child, Wrap.createWrap(WrapType.NONE, false), myChildWrap);
    }

    @Nullable
    protected Alignment createChildAlignment(ASTNode child) {
        return myAlignmentProcessor.createChildAlignment();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return mySpacingProcessor.getSpacing(child1, child2);
    }

    @NotNull
    @Override
    public ChildAttributes getChildAttributes(int newChildIndex) {
        if (myNode.getPsi() instanceof PsiFile) {
            return new ChildAttributes(Indent.getNoneIndent(), null);
        }
        return new ChildAttributes(Indent.getNormalIndent(), null);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

    @Override
    public BlockWithParent getParent() {
        return myParent;
    }

    @Override
    public void setParent(BlockWithParent newParent) {
        myParent = newParent;
    }
}
