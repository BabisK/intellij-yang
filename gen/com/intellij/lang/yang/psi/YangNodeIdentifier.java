// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangNodeIdentifier extends YangCompositeElement {

  @Nullable
  YangPrefix getPrefix();

  @Nullable
  PsiElement getColon();

  @NotNull
  PsiElement getIdentifier();

}
