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

public class YangIdentifierLiteralImpl extends YangCompositeElementImpl implements YangIdentifierLiteral {

  public YangIdentifierLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitIdentifierLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAddKeyword() {
    return findChildByType(YANG_ADD_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getAnyxmlKeyword() {
    return findChildByType(YANG_ANYXML_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getArgumentKeyword() {
    return findChildByType(YANG_ARGUMENT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getAugmentKeyword() {
    return findChildByType(YANG_AUGMENT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getBaseKeyword() {
    return findChildByType(YANG_BASE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getBelongsToKeyword() {
    return findChildByType(YANG_BELONGS_TO_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getBitKeyword() {
    return findChildByType(YANG_BIT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getCaseKeyword() {
    return findChildByType(YANG_CASE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getChoiceKeyword() {
    return findChildByType(YANG_CHOICE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getConfigKeyword() {
    return findChildByType(YANG_CONFIG_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getContactKeyword() {
    return findChildByType(YANG_CONTACT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getContainerKeyword() {
    return findChildByType(YANG_CONTAINER_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getCurrentKeyword() {
    return findChildByType(YANG_CURRENT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDefaultKeyword() {
    return findChildByType(YANG_DEFAULT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDeleteKeyword() {
    return findChildByType(YANG_DELETE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDeprecatedKeyword() {
    return findChildByType(YANG_DEPRECATED_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDescriptionKeyword() {
    return findChildByType(YANG_DESCRIPTION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDeviateKeyword() {
    return findChildByType(YANG_DEVIATE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getDeviationKeyword() {
    return findChildByType(YANG_DEVIATION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getEnumKeyword() {
    return findChildByType(YANG_ENUM_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getErrorAppTagKeyword() {
    return findChildByType(YANG_ERROR_APP_TAG_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getErrorMessageKeyword() {
    return findChildByType(YANG_ERROR_MESSAGE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getExtensionKeyword() {
    return findChildByType(YANG_EXTENSION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getFalseKeyword() {
    return findChildByType(YANG_FALSE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getFeatureKeyword() {
    return findChildByType(YANG_FEATURE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getFractionDigitsKeyword() {
    return findChildByType(YANG_FRACTION_DIGITS_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getGroupingKeyword() {
    return findChildByType(YANG_GROUPING_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(YANG_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getIdentityKeyword() {
    return findChildByType(YANG_IDENTITY_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getIfFeatureKeyword() {
    return findChildByType(YANG_IF_FEATURE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getImportKeyword() {
    return findChildByType(YANG_IMPORT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getIncludeKeyword() {
    return findChildByType(YANG_INCLUDE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getInputKeyword() {
    return findChildByType(YANG_INPUT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getKeyKeyword() {
    return findChildByType(YANG_KEY_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getLeafrefType() {
    return findChildByType(YANG_LEAFREF_TYPE);
  }

  @Override
  @Nullable
  public PsiElement getLeafKeyword() {
    return findChildByType(YANG_LEAF_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getLeafListKeyword() {
    return findChildByType(YANG_LEAF_LIST_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getLengthKeyword() {
    return findChildByType(YANG_LENGTH_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getListKeyword() {
    return findChildByType(YANG_LIST_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMandatoryKeyword() {
    return findChildByType(YANG_MANDATORY_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMaxElementsKeyword() {
    return findChildByType(YANG_MAX_ELEMENTS_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMaxKeyword() {
    return findChildByType(YANG_MAX_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMinElementsKeyword() {
    return findChildByType(YANG_MIN_ELEMENTS_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMinKeyword() {
    return findChildByType(YANG_MIN_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getModuleKeyword() {
    return findChildByType(YANG_MODULE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getMustKeyword() {
    return findChildByType(YANG_MUST_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getNamespaceKeyword() {
    return findChildByType(YANG_NAMESPACE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getNotificationKeyword() {
    return findChildByType(YANG_NOTIFICATION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getNotSupportedKeyword() {
    return findChildByType(YANG_NOT_SUPPORTED_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getObsoleteKeyword() {
    return findChildByType(YANG_OBSOLETE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getOrderedByKeyword() {
    return findChildByType(YANG_ORDERED_BY_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getOrganizationKeyword() {
    return findChildByType(YANG_ORGANIZATION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getOutputKeyword() {
    return findChildByType(YANG_OUTPUT_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getPathKeyword() {
    return findChildByType(YANG_PATH_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getPatternKeyword() {
    return findChildByType(YANG_PATTERN_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getPositionKeyword() {
    return findChildByType(YANG_POSITION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getPrefixKeyword() {
    return findChildByType(YANG_PREFIX_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getPresenceKeyword() {
    return findChildByType(YANG_PRESENCE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRangeKeyword() {
    return findChildByType(YANG_RANGE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getReferenceKeyword() {
    return findChildByType(YANG_REFERENCE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRefineKeyword() {
    return findChildByType(YANG_REFINE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getReplaceKeyword() {
    return findChildByType(YANG_REPLACE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRequireInstanceKeyword() {
    return findChildByType(YANG_REQUIRE_INSTANCE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRevisionDateKeyword() {
    return findChildByType(YANG_REVISION_DATE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRevisionKeyword() {
    return findChildByType(YANG_REVISION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getRpcKeyword() {
    return findChildByType(YANG_RPC_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getStatusKeyword() {
    return findChildByType(YANG_STATUS_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getSubmoduleKeyword() {
    return findChildByType(YANG_SUBMODULE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getSystemKeyword() {
    return findChildByType(YANG_SYSTEM_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getTrueKeyword() {
    return findChildByType(YANG_TRUE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getTypedefKeyword() {
    return findChildByType(YANG_TYPEDEF_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getTypeKeyword() {
    return findChildByType(YANG_TYPE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getUnboundedKeyword() {
    return findChildByType(YANG_UNBOUNDED_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getUniqueKeyword() {
    return findChildByType(YANG_UNIQUE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getUnitsKeyword() {
    return findChildByType(YANG_UNITS_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getUserKeyword() {
    return findChildByType(YANG_USER_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getUsesKeyword() {
    return findChildByType(YANG_USES_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getValueKeyword() {
    return findChildByType(YANG_VALUE_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getWhenKeyword() {
    return findChildByType(YANG_WHEN_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getYangVersionKeyword() {
    return findChildByType(YANG_YANG_VERSION_KEYWORD);
  }

  @Override
  @Nullable
  public PsiElement getYinElementKeyword() {
    return findChildByType(YANG_YIN_ELEMENT_KEYWORD);
  }

}
