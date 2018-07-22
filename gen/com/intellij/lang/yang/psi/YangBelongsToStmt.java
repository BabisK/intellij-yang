// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangBelongsToStmt extends YangStatement {

  @NotNull
  YangPrefixStmt getPrefixStmt();

  @NotNull
  YangString getString();

  @NotNull
  PsiElement getBelongsToKeyword();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRightBrace();

}
