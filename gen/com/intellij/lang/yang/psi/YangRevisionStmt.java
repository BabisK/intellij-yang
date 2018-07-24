// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRevisionStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @Nullable
  YangStmtsep getStmtsep();

  @NotNull
  YangString getString();

  @Nullable
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRevisionKeyword();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
