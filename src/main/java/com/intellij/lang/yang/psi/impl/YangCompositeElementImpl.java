package com.intellij.lang.yang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.yang.psi.YangCompositeElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class YangCompositeElementImpl extends ASTWrapperPsiElement implements YangCompositeElement {
    public YangCompositeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    public IElementType getTokenType() {
        return getNode().getElementType();
    }
}
