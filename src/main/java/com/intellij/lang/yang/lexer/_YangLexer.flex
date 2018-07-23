package com.intellij.lang.yang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.lang.yang.psi.YangTypes.*;

%%

%{
  public _YangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _YangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
DOUBLE_QUOTED_STRING=\"([^\\\"])*\"?
SINGLE_QUOTED_STRING='([^\\'\r\n]|\\[^\r\n])*'?
IDENTIFIER=[.a-zA-Z_0-9\-/][a-zA-Z0-9_\-.:]*

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  " "                         { return YANG_SEP; }
  "{"                         { return YANG_LEFT_BRACE; }
  "}"                         { return YANG_RIGHT_BRACE; }
  ";"                         { return YANG_SEMICOLON; }
  "+"                         { return YANG_PLUS; }
  "anyxml"                    { return YANG_ANYXML_KEYWORD; }
  "argument"                  { return YANG_ARGUMENT_KEYWORD; }
  "augment"                   { return YANG_AUGMENT_KEYWORD; }
  "base"                      { return YANG_BASE_KEYWORD; }
  "belongs-to"                { return YANG_BELONGS_TO_KEYWORD; }
  "bit"                       { return YANG_BIT_KEYWORD; }
  "case"                      { return YANG_CASE_KEYWORD; }
  "choice"                    { return YANG_CHOICE_KEYWORD; }
  "config"                    { return YANG_CONFIG_KEYWORD; }
  "contact"                   { return YANG_CONTACT_KEYWORD; }
  "container"                 { return YANG_CONTAINER_KEYWORD; }
  "default"                   { return YANG_DEFAULT_KEYWORD; }
  "description"               { return YANG_DESCRIPTION_KEYWORD; }
  "enum"                      { return YANG_ENUM_KEYWORD; }
  "error-app-tag"             { return YANG_ERROR_APP_TAG_KEYWORD; }
  "error-message"             { return YANG_ERROR_MESSAGE_KEYWORD; }
  "extension"                 { return YANG_EXTENSION_KEYWORD; }
  "deviation"                 { return YANG_DEVIATION_KEYWORD; }
  "deviate"                   { return YANG_DEVIATE_KEYWORD; }
  "feature"                   { return YANG_FEATURE_KEYWORD; }
  "fraction-digits"           { return YANG_FRACTION_DIGITS_KEYWORD; }
  "grouping"                  { return YANG_GROUPING_KEYWORD; }
  "identity"                  { return YANG_IDENTITY_KEYWORD; }
  "if-feature"                { return YANG_IF_FEATURE_KEYWORD; }
  "import"                    { return YANG_IMPORT_KEYWORD; }
  "include"                   { return YANG_INCLUDE_KEYWORD; }
  "input"                     { return YANG_INPUT_KEYWORD; }
  "key"                       { return YANG_KEY_KEYWORD; }
  "leaf"                      { return YANG_LEAF_KEYWORD; }
  "leaf-list"                 { return YANG_LEAF_LIST_KEYWORD; }
  "length"                    { return YANG_LENGTH_KEYWORD; }
  "list"                      { return YANG_LIST_KEYWORD; }
  "mandatory"                 { return YANG_MANDATORY_KEYWORD; }
  "max-elements"              { return YANG_MAX_ELEMENTS_KEYWORD; }
  "min-elements"              { return YANG_MIN_ELEMENTS_KEYWORD; }
  "module"                    { return YANG_MODULE_KEYWORD; }
  "must"                      { return YANG_MUST_KEYWORD; }
  "namespace"                 { return YANG_NAMESPACE_KEYWORD; }
  "notification"              { return YANG_NOTIFICATION_KEYWORD; }
  "ordered-by"                { return YANG_ORDERED_BY_KEYWORD; }
  "organization"              { return YANG_ORGANIZATION_KEYWORD; }
  "output"                    { return YANG_OUTPUT_KEYWORD; }
  "path"                      { return YANG_PATH_KEYWORD; }
  "pattern"                   { return YANG_PATTERN_KEYWORD; }
  "position"                  { return YANG_POSITION_KEYWORD; }
  "prefix"                    { return YANG_PREFIX_KEYWORD; }
  "presence"                  { return YANG_PRESENCE_KEYWORD; }
  "range"                     { return YANG_RANGE_KEYWORD; }
  "reference"                 { return YANG_REFERENCE_KEYWORD; }
  "refine"                    { return YANG_REFINE_KEYWORD; }
  "require-instance"          { return YANG_REQUIRE_INSTANCE_KEYWORD; }
  "revision"                  { return YANG_REVISION_KEYWORD; }
  "revision-date"             { return YANG_REVISION_DATE_KEYWORD; }
  "rpc"                       { return YANG_RPC_KEYWORD; }
  "status"                    { return YANG_STATUS_KEYWORD; }
  "submodule"                 { return YANG_SUBMODULE_KEYWORD; }
  "type"                      { return YANG_TYPE_KEYWORD; }
  "typedef"                   { return YANG_TYPEDEF_KEYWORD; }
  "unique"                    { return YANG_UNIQUE_KEYWORD; }
  "units"                     { return YANG_UNITS_KEYWORD; }
  "uses"                      { return YANG_USES_KEYWORD; }
  "value"                     { return YANG_VALUE_KEYWORD; }
  "when"                      { return YANG_WHEN_KEYWORD; }
  "yang-version"              { return YANG_YANG_VERSION_KEYWORD; }
  "yin-element"               { return YANG_YIN_ELEMENT_KEYWORD; }
  "add"                       { return YANG_ADD_KEYWORD; }
  "current"                   { return YANG_CURRENT_KEYWORD; }
  "delete"                    { return YANG_DELETE_KEYWORD; }
  "deprecated"                { return YANG_DEPRECATED_KEYWORD; }
  "false"                     { return YANG_FALSE_KEYWORD; }
  "max"                       { return YANG_MAX_KEYWORD; }
  "min"                       { return YANG_MIN_KEYWORD; }
  "not-supported"             { return YANG_NOT_SUPPORTED_KEYWORD; }
  "obsolete"                  { return YANG_OBSOLETE_KEYWORD; }
  "replace"                   { return YANG_REPLACE_KEYWORD; }
  "system"                    { return YANG_SYSTEM_KEYWORD; }
  "true"                      { return YANG_TRUE_KEYWORD; }
  "unbounded"                 { return YANG_UNBOUNDED_KEYWORD; }
  "user"                      { return YANG_USER_KEYWORD; }

  {LINE_COMENT}               { return YANG_LINE_COMENT; }
  {BLOCK_COMMENT}             { return YANG_BLOCK_COMMENT; }
  {DOUBLE_QUOTED_STRING}      { return YANG_DOUBLE_QUOTED_STRING; }
  {SINGLE_QUOTED_STRING}      { return YANG_SINGLE_QUOTED_STRING; }
  {IDENTIFIER}                { return YANG_IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
