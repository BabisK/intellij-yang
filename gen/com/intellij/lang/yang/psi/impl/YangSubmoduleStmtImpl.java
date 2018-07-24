// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.yang.psi.YangTypes.*;
import com.intellij.lang.yang.psi.*;

public class YangSubmoduleStmtImpl extends YangStatementImpl implements YangSubmoduleStmt {

  public YangSubmoduleStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitSubmoduleStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatement.class);
  }

  @Override
  @NotNull
  public YangIdentifierArg getIdentifierArg() {
    return findNotNullChildByClass(YangIdentifierArg.class);
  }

  @Override
  @NotNull
  public List<YangStmtsep> getStmtsepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStmtsep.class);
  }

  @Override
  @NotNull
  public YangSubmoduleHeaderStmts getSubmoduleHeaderStmts() {
    return findNotNullChildByClass(YangSubmoduleHeaderStmts.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftBrace() {
    return findNotNullChildByType(YANG_LEFT_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightBrace() {
    return findNotNullChildByType(YANG_RIGHT_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getSubmoduleKeyword() {
    return findNotNullChildByType(YANG_SUBMODULE_KEYWORD);
  }

}
