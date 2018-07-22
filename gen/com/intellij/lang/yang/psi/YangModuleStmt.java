// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangModuleStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  YangString getString();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getModuleKeyword();

  @NotNull
  PsiElement getRightBrace();

}
