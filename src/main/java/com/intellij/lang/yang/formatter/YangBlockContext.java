package com.intellij.lang.yang.formatter;

import com.intellij.formatting.FormattingMode;
import com.intellij.lang.yang.YangLanguage;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;

/**
 *
 */
public class YangBlockContext {
    private final CodeStyleSettings mySettings;
    private final FormattingMode myMode;
    private final CommonCodeStyleSettings myYangSettings;

    public YangBlockContext(CodeStyleSettings settings, FormattingMode mode) {
        mySettings = settings;
        myMode = mode;
        myYangSettings = settings.getCommonSettings(YangLanguage.INSTANCE);
    }

    public CodeStyleSettings getSettings() {
        return mySettings;
    }

    public CommonCodeStyleSettings getYangSettings() {
        return myYangSettings;
    }

    public FormattingMode getMode() {
        return myMode;
    }
}
