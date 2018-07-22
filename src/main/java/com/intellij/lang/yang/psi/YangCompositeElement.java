package com.intellij.lang.yang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

/**
 *
 */
public interface YangCompositeElement extends PsiElement {
    IElementType getTokenType();
}