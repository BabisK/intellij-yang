// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviateAddStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

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
