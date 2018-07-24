// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRpcStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  List<YangStmtsep> getStmtsepList();

  @NotNull
  YangString getString();

  @Nullable
  PsiElement getLeftBrace();

  @Nullable
  PsiElement getRightBrace();

  @NotNull
  PsiElement getRpcKeyword();

  @Nullable
  PsiElement getSemicolon();

}
