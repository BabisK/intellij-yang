// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviateNotSupportedStmt extends YangStatement {

  @Nullable
  YangIdentifierStmt getIdentifierStmt();

  @NotNull
  YangString getString();

  @NotNull
  PsiElement getDeviateKeyword();

  @Nullable
  PsiElement getLeftBrace();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
