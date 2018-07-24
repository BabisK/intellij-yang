// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviateReplaceStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  PsiElement getDeviateKeyword();

  @Nullable
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getReplaceKeyword();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
