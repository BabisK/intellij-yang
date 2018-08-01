package com.intellij.lang.yang.folding;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;

@State(name = "YangCodeFoldingSettings", storages = @Storage("editor.codeinsight.xml"))
public class YangCodeFoldingSettings implements PersistentStateComponent<YangCodeFoldingSettings> {
  private boolean myCollapseParts = true;
  private boolean myCollapseGenericParams;

  public static YangCodeFoldingSettings getInstance() {
    return ServiceManager.getService(YangCodeFoldingSettings.class);
  }

  @Override
  public YangCodeFoldingSettings getState() {
    return this;
  }

  @Override
  public void loadState(@NotNull final YangCodeFoldingSettings state) {
    XmlSerializerUtil.copyBean(state, this);
  }

  public boolean isCollapseGenericParameters() {
    return myCollapseGenericParams;
  }

  public void setCollapseGenericParameters(final boolean collapseGenericParams) {
    myCollapseGenericParams = collapseGenericParams;
  }

  public boolean isCollapseParts() {
    return myCollapseParts;
  }

  public void setCollapseParts(final boolean collapseParts) {
    myCollapseParts = collapseParts;
  }
}
