package com.intellij.lang.yang.folding;

import com.intellij.application.options.editor.CodeFoldingOptionsProvider;
import com.intellij.lang.yang.YangBundle;
import com.intellij.openapi.options.BeanConfigurable;

public class YangCodeFoldingOptionsProvider extends BeanConfigurable<YangCodeFoldingSettings> implements CodeFoldingOptionsProvider {
  public YangCodeFoldingOptionsProvider() {
    super(YangCodeFoldingSettings.getInstance());
    YangCodeFoldingSettings settings = getInstance();
    checkBox(YangBundle.message("checkbox.collapse.parts"), settings::isCollapseParts, settings::setCollapseParts);
    checkBox(YangBundle.message("checkbox.collapse.generic.parameters"), settings::isCollapseGenericParameters, settings::setCollapseGenericParameters);
  }
}
