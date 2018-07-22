// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangArgumentStmt extends YangStatement {

  @NotNull
  YangString getString();

  @Nullable
  YangUnknownStatement2 getUnknownStatement2();

  @Nullable
  YangYinElementStmt getYinElementStmt();

  @NotNull
  PsiElement getArgumentKeyword();

  @Nullable
  PsiElement getLeftBrace();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
