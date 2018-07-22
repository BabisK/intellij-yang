// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangUnknownStatement2 extends YangCompositeElement {

  @Nullable
  YangPrefix getPrefix();

  @Nullable
  YangString getString();

  @NotNull
  List<YangUnknownStatement2> getUnknownStatement2List();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getLeftBrace();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
