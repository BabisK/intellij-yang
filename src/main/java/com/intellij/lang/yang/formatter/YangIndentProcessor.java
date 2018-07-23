package com.intellij.lang.yang.formatter;

import com.intellij.formatting.FormattingMode;
import com.intellij.formatting.Indent;
import com.intellij.lang.ASTNode;
import com.intellij.lang.yang.YangParserDefinition;
import com.intellij.lang.yang.psi.YangStatement;
import com.intellij.lang.yang.util.UsefulPsiTreeUtil;
import com.intellij.psi.PsiElement;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.yang.psi.YangTypes.*;

/**
 *
 */
public class YangIndentProcessor {
    private final CommonCodeStyleSettings settings;

    public YangIndentProcessor(CommonCodeStyleSettings settings) {
        this.settings = settings;
    }

    public Indent getChildIndent(final ASTNode node, final FormattingMode mode) {
        final IElementType elementType = node.getElementType();
        final PsiElement psi = node.getPsi();
        final ASTNode prevSibling = UsefulPsiTreeUtil.getPrevSiblingSkipWhiteSpacesAndComments(node);
        final IElementType prevSiblingType = prevSibling == null ? null : prevSibling.getElementType();
        final ASTNode parent = node.getTreeParent();
        final IElementType parentType = parent != null ? parent.getElementType() : null;
        final ASTNode superParent = parent == null ? null : parent.getTreeParent();
        final IElementType superParentType = superParent == null ? null : superParent.getElementType();

        final int braceStyle = settings.BRACE_STYLE;

        if (parent == null || parent.getTreeParent() == null) {
            return Indent.getNoneIndent();
        }

        if (elementType == YANG_MODULE_STMT | elementType == YANG_SUBMODULE_STMT) {
            return Indent.getNoneIndent();
        }

        if (elementType == YANG_LEFT_BRACE || elementType == YANG_RIGHT_BRACE) {
            switch (braceStyle) {
                case CommonCodeStyleSettings.END_OF_LINE:
                case CommonCodeStyleSettings.NEXT_LINE:
                case CommonCodeStyleSettings.NEXT_LINE_IF_WRAPPED:
                    return Indent.getNoneIndent();
                case CommonCodeStyleSettings.NEXT_LINE_SHIFTED:
                case CommonCodeStyleSettings.NEXT_LINE_SHIFTED2:
                    return Indent.getNormalIndent();
                default:
                    return Indent.getNoneIndent();
            }
        }

        if (psi instanceof YangStatement) {
            return Indent.getNormalIndent();
        }

        if (YangParserDefinition.COMMENTS.contains(elementType)) {
            return Indent.getNormalIndent();
        }

        return Indent.getNoneIndent();
    }
}
