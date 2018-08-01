package com.intellij.lang.yang.folding;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.CustomFoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.lang.folding.NamedFoldingDescriptor;
import com.intellij.lang.yang.psi.YangFile;
import com.intellij.lang.yang.psi.YangStatement;
import com.intellij.lang.yang.psi.YangTokenTypeSets;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class YangFoldingBuilder extends CustomFoldingBuilder implements DumbAware {
    private static final Logger LOG = Logger.getInstance(YangFoldingBuilder.class);

    private static final String SMILEY = "<~>";

    @Override
    protected void buildLanguageFoldRegions(@NotNull final List<FoldingDescriptor> descriptors,
                                            @NotNull final PsiElement root,
                                            @NotNull final Document document,
                                            final boolean quick) {
        if (!(root instanceof YangFile)) return;

        final YangFile file = (YangFile) root;
        for (YangStatement stmt : PsiTreeUtil.findChildrenOfType(file, YangStatement.class)) {
            if (stmt.getTextRange().getLength() > 1) {
                StringBuilder sb = new StringBuilder();
                String tmp = stmt.getNode().getText();
                int endIndex = tmp.indexOf("{");
                if (endIndex != -1) {
                    sb.append(tmp.substring(0, endIndex));
                    sb.append("{...}");
                } else {
                    sb.append("...");
                }
                descriptors.add(new NamedFoldingDescriptor(stmt.getNode(), stmt.getTextRange(), null, sb.toString()));
            }
        }

        if (!quick) {
            Set<PsiElement> processedComments = ContainerUtil.newHashSet();
            PsiTreeUtil.processElements(file, element -> {
                ASTNode node = element.getNode();
                IElementType type = node.getElementType();
                TextRange range = element.getTextRange();
                if (type == YangTokenTypeSets.BLOCK_COMMENT && range.getLength() > 2) {
                    descriptors.add(new NamedFoldingDescriptor(node, range, null, "/*...*/"));
                }
                if (type == YangTokenTypeSets.LINE_COMMENT) {
                    addCommentFolds(element, processedComments, descriptors);
                }
                return true;
            });
        }                          // 4. Comments and comment sequences
    }

    @Override
    protected String getLanguagePlaceholderText(@NotNull final ASTNode node, @NotNull final TextRange range) {
        final IElementType elementType = node.getElementType();

        if (elementType == YangTokenTypeSets.BLOCK_COMMENT) return "/*...*/";      // 4.2. Multiline comments
        if (elementType == YangTokenTypeSets.LINE_COMMENT) return "//...";  // 4.3. Consequent single line doc comments

        return "...";
    }

    @Override
    protected boolean isRegionCollapsedByDefault(@NotNull final ASTNode node) {
        return false;
    }

    private static void addCommentFolds(@NotNull PsiElement comment,
                                        @NotNull Set<PsiElement> processedComments,
                                        @NotNull List<FoldingDescriptor> result) {
        if (processedComments.contains(comment)) return;

        PsiElement end = null;
        for (PsiElement current = comment.getNextSibling(); current != null; current = current.getNextSibling()) {
            ASTNode node = current.getNode();
            if (node == null) break;
            IElementType elementType = node.getElementType();
            if (elementType == YangTokenTypeSets.LINE_COMMENT) {
                end = current;
                processedComments.add(current);
                continue;
            }
            if (elementType == TokenType.WHITE_SPACE) continue;
            break;
        }

        if (end != null) {
            int startOffset = comment.getTextRange().getStartOffset();
            int endOffset = end.getTextRange().getEndOffset();
            result.add(new NamedFoldingDescriptor(comment, startOffset, endOffset, null, "/.../"));
        }
    }
}
