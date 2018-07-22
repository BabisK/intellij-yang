package com.intellij.lang.yang.formatter;

import com.intellij.formatting.Block;
import com.intellij.formatting.Spacing;
import com.intellij.lang.ASTNode;

import com.intellij.lang.yang.psi.YangStatement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

import static com.intellij.lang.yang.psi.YangTypes.*;

/**
 *
 */
public class YangSpacingProcessor {
    private final ASTNode myNode;
    private final CommonCodeStyleSettings mySettings;
    TokenSet BLOCKS = TokenSet.create(
            YANG_STATEMENT
    );
    TokenSet COMMENTS = TokenSet.create(
            //
    );
    public YangSpacingProcessor(ASTNode node, CommonCodeStyleSettings settings) {
        this.mySettings = settings;
        this.myNode = node;
    }
    public Spacing getSpacing(final Block child1, final Block child2) {
        if (!(child1 instanceof AbstractBlock) || !(child2 instanceof AbstractBlock)) {
            return null;
        }
        final IElementType elementType = myNode.getElementType();
        final IElementType parentType = myNode.getTreeParent() == null ? null : myNode.getTreeParent().getElementType();
        final ASTNode node1 = ((AbstractBlock)child1).getNode();
        final IElementType type1 = node1.getElementType();
        final ASTNode node2 = ((AbstractBlock)child2).getNode();
        final IElementType type2 = node2.getElementType();

        if (!COMMENTS.contains(type2) && isStatement(child1) && isStatement(child2)
                && !(node1.getTreeNext() instanceof PsiErrorElement) && !(node1.getLastChildNode() instanceof PsiErrorElement)) {
            return addLineBreak();
        }

        return Spacing.createSpacing(0, 1, 0, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
    }
    private Spacing addLineBreak() {
        return Spacing.createSpacing(0, 0, 1, false, mySettings.KEEP_BLANK_LINES_IN_CODE);
    }

    private boolean isStatement(final Block b) {
        return (((AbstractBlock)b).getNode().getPsi() instanceof YangStatement);
    }
}
