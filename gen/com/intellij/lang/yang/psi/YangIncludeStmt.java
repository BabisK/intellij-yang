// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangIncludeStmt extends YangStatement {

  @NotNull
  YangIdentifierArg getIdentifierArg();

  @Nullable
  YangRevisionDateStmt getRevisionDateStmt();

  @NotNull
  PsiElement getIncludeKeyword();

  @Nullable
  PsiElement getLeftBrace();

  @Nullable
  PsiElement getRightBrace();

  @Nullable
  PsiElement getSemicolon();

}
