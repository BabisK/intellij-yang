// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangUsesAugmentStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  YangDescendantSchemaNodeid getDescendantSchemaNodeid();

  @NotNull
  List<YangStmtsep> getStmtsepList();

  @NotNull
  PsiElement getAugmentKeyword();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRightBrace();

}
