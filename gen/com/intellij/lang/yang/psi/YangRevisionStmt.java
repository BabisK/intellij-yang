// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRevisionStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  YangDateArgStr getDateArgStr();

  @Nullable
  YangStmtsep getStmtsep();

  @Nullable
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRevisionKeyword();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
