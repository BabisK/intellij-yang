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

public class YangDeviateReplaceStmtImpl extends YangStatementImpl implements YangDeviateReplaceStmt {

  public YangDeviateReplaceStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitDeviateReplaceStmt(this);
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
  public PsiElement getDeviateKeyword() {
    return findNotNullChildByType(YANG_DEVIATE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getLeftBrace() {
    return findChildByType(YANG_LEFT_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getReplaceKeyword() {
    return findNotNullChildByType(YANG_REPLACE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRightBrace() {
    return findChildByType(YANG_RIGHT_BRACE);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(YANG_SEMICOLON);
  }

}
