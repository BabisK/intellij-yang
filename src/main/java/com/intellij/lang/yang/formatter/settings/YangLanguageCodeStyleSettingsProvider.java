/*
 * Copyright 2013-2016 Sergey Ignatov, Alexander Zolotov, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.lang.yang.formatter.settings;

import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.application.options.SmartIndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.lang.yang.YangLanguage;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.jetbrains.annotations.NotNull;

public class YangLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {
    private static final String DEFAULT_CODE_SAMPLE =
            "module acme-foo {\n" +
            "     namespace \"http://acme.example.com/foo\";\n" +
            "     prefix \"acfoo\";\n" +
            "\n" +
            "\n" +
            "     list interface {\n" +
            "         key \"name\";\n" +
            "         leaf name {\n" +
            "             type string;\n" +
            "         }\n" +
            "\n" +
            "         leaf mtu {\n" +
            "             type uint32;\n" +
            "             description \"The MTU of the interface.\";\n" +
            "         }\n" +
            "     }\n" +
            " }";

    @NotNull
    @Override
    public Language getLanguage() {
        return YangLanguage.INSTANCE;
    }

    @NotNull
    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        return DEFAULT_CODE_SAMPLE;
    }

    @Override
    public IndentOptionsEditor getIndentOptionsEditor() {
        return new SmartIndentOptionsEditor();
    }

    @Override
    public CommonCodeStyleSettings getDefaultCommonSettings() {
        CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings(getLanguage());
        CommonCodeStyleSettings.IndentOptions indentOptions = defaultSettings.initIndentOptions();
        indentOptions.INDENT_SIZE = 2;
        indentOptions.CONTINUATION_INDENT_SIZE = 4;
        indentOptions.TAB_SIZE = 2;
        indentOptions.USE_TAB_CHARACTER = true;

        defaultSettings.BLOCK_COMMENT_AT_FIRST_COLUMN = false;
        defaultSettings.LINE_COMMENT_AT_FIRST_COLUMN = false;
        return defaultSettings;
    }
}