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

package com.intellij.lang.yang.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.lang.yang.YangLanguage;
import com.intellij.lang.yang.psi.YangFile;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.formatter.DocumentBasedFormattingModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.intellij.lang.yang.psi.YangTypes.*;

public class YangFormattingModelBuilder implements FormattingModelBuilderEx {
    private static final Logger LOG = Logger.getInstance("#com.intellij.lang.yang.YangFormattingModelBuilder");


    static SpacingBuilder createSpacingBuilder(@NotNull CodeStyleSettings settings) {
        final CommonCodeStyleSettings commonSettings = settings.getCommonSettings(YangLanguage.INSTANCE);

        return new SpacingBuilder(settings, YangLanguage.INSTANCE)
                .withinPair(YANG_LEFT_BRACE, YANG_RIGHT_BRACE).spaceIf(commonSettings.SPACE_WITHIN_BRACES, true);
    }

    @NotNull
    @Override
    public FormattingModel createModel(@NotNull PsiElement element, @NotNull CodeStyleSettings settings) {
        return createModel(element, settings, FormattingMode.REFORMAT);
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }

    @NotNull
    @Override
    public FormattingModel createModel(@NotNull PsiElement element, @NotNull CodeStyleSettings settings, @NotNull FormattingMode mode) {
        final PsiFile psiFile = element.getContainingFile();
        final ASTNode rootNode = psiFile instanceof YangFile ? psiFile.getNode() : element.getNode();
        final YangBlockContext context = new YangBlockContext(settings, mode);
        Block rootBlock = new YangBlock(rootNode, null, null, settings, context);
        return new DocumentBasedFormattingModel(
                rootBlock,
                element.getProject(),
                settings,
                psiFile.getFileType(),
                psiFile
        );
    }

    @Nullable
    @Override
    public CommonCodeStyleSettings.IndentOptions getIndentOptionsToUse(@NotNull PsiFile file, @NotNull FormatTextRanges ranges, @NotNull CodeStyleSettings settings) {
        return null;
    }
}