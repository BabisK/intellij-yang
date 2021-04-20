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

public class YangIdentifierRefArgImpl extends YangCompositeElementImpl implements YangIdentifierRefArg {

  public YangIdentifierRefArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitIdentifierRefArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangIdentifierLiteral getIdentifierLiteral() {
    return findNotNullChildByClass(YangIdentifierLiteral.class);
  }

  @Override
  @Nullable
  public YangPrefix getPrefix() {
    return findChildByClass(YangPrefix.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(YANG_COLON);
  }

}
