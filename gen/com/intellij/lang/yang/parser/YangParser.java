// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.intellij.lang.yang.psi.YangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return yang(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(YANG_ANYXML_STMT, YANG_ARGUMENT_STMT, YANG_AUGMENT_STMT, YANG_BASE_STMT,
      YANG_BELONGS_TO_STMT, YANG_BIT_STMT, YANG_CASE_STMT, YANG_CHOICE_STMT,
      YANG_CONFIG_STMT, YANG_CONTACT_STMT, YANG_CONTAINER_STMT, YANG_DEFAULT_STMT,
      YANG_DESCRIPTION_STMT, YANG_DEVIATE_ADD_STMT, YANG_DEVIATE_DELETE_STMT, YANG_DEVIATE_NOT_SUPPORTED_STMT,
      YANG_DEVIATE_REPLACE_STMT, YANG_DEVIATION_STMT, YANG_ENUM_STMT, YANG_ERROR_APP_TAG_STMT,
      YANG_ERROR_MESSAGE_STMT, YANG_EXTENSION_STMT, YANG_FEATURE_STMT, YANG_FRACTION_DIGITS_STMT,
      YANG_GROUPING_STMT, YANG_IDENTITY_STMT, YANG_IF_FEATURE_STMT, YANG_IMPORT_STMT,
      YANG_INCLUDE_STMT, YANG_INPUT_STMT, YANG_KEY_STMT, YANG_LEAF_LIST_STMT,
      YANG_LEAF_STMT, YANG_LENGTH_STMT, YANG_LIST_STMT, YANG_MANDATORY_STMT,
      YANG_MAX_ELEMENTS_STMT, YANG_MIN_ELEMENTS_STMT, YANG_MODULE_STMT, YANG_MUST_STMT,
      YANG_NAMESPACE_STMT, YANG_NOTIFICATION_STMT, YANG_ORDERED_BY_STMT, YANG_ORGANIZATION_STMT,
      YANG_OUTPUT_STMT, YANG_PATH_STMT, YANG_PATTERN_STMT, YANG_POSITION_STMT,
      YANG_PREFIX_STMT, YANG_PRESENCE_STMT, YANG_RANGE_STMT, YANG_REFERENCE_STMT,
      YANG_REFINE_STMT, YANG_REQUIRE_INSTANCE_STMT, YANG_REVISION_DATE_STMT, YANG_REVISION_STMT,
      YANG_RPC_STMT, YANG_SHORT_CASE_STMT, YANG_STATEMENT, YANG_STATUS_STMT,
      YANG_SUBMODULE_STMT, YANG_TYPEDEF_STMT, YANG_TYPE_STMT, YANG_UNIQUE_STMT,
      YANG_UNITS_STMT, YANG_UNKNOWN_STATEMENT, YANG_UNKNOWN_STATEMENT_2, YANG_USES_AUGMENT_STMT,
      YANG_USES_STMT, YANG_VALUE_STMT, YANG_WHEN_STMT, YANG_YANG_VERSION_STMT,
      YANG_YIN_ELEMENT_STMT),
  };

  /* ********************************************************** */
  // deviate_replace_stmt
  //   | deviate_delete_stmt
  //   | deviate_add_stmt
  //   | deviate_not_supported_stmt
  //   | deviation_stmt
  //   | notification_stmt
  //   | output_stmt
  //   | input_stmt
  //   | rpc_stmt
  //   | when_stmt
  //   | augment_stmt
  //   | uses_augment_stmt
  //   | refine_stmt
  //   | uses_stmt
  //   | anyxml_stmt
  //   | case_stmt
  //   | short_case_stmt
  //   | choice_stmt
  //   | unique_stmt
  //   | key_stmt
  //   | list_stmt
  //   | leaf_list_stmt
  //   | leaf_stmt
  //   | container_stmt
  //   | grouping_stmt
  //   | value_stmt
  //   | max_elements_stmt
  //   | min_elements_stmt
  //   | error_app_tag_stmt
  //   | error_message_stmt
  //   | must_stmt
  //   | ordered_by_stmt
  //   | presence_stmt
  //   | mandatory_stmt
  //   | config_stmt
  //   | status_stmt
  //   | position_stmt
  //   | bit_stmt
  //   | require_instance_stmt
  //   | path_stmt
  //   | enum_stmt
  //   | default_stmt
  //   | pattern_stmt
  //   | length_stmt
  //   | fraction_digits_stmt
  //   | range_stmt
  //   | type_stmt
  //   | typedef_stmt
  //   | if_feature_stmt
  //   | feature_stmt
  //   | base_stmt
  //   | identity_stmt
  //   | yin_element_stmt
  //   | argument_stmt
  //   | extension_stmt
  //   | revision_date_stmt
  //   | revision_stmt
  //   | units_stmt
  //   | reference_stmt
  //   | description_stmt
  //   | contact_stmt
  //   | organization_stmt
  //   | belongs_to_stmt
  //   | prefix_stmt
  //   | namespace_stmt
  //   | include_stmt
  //   | import_stmt
  //   | yang_version_stmt
  //   | unknown_statement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, YANG_STATEMENT, "<statement>");
    r = deviate_replace_stmt(b, l + 1);
    if (!r) r = deviate_delete_stmt(b, l + 1);
    if (!r) r = deviate_add_stmt(b, l + 1);
    if (!r) r = deviate_not_supported_stmt(b, l + 1);
    if (!r) r = deviation_stmt(b, l + 1);
    if (!r) r = notification_stmt(b, l + 1);
    if (!r) r = output_stmt(b, l + 1);
    if (!r) r = input_stmt(b, l + 1);
    if (!r) r = rpc_stmt(b, l + 1);
    if (!r) r = when_stmt(b, l + 1);
    if (!r) r = augment_stmt(b, l + 1);
    if (!r) r = uses_augment_stmt(b, l + 1);
    if (!r) r = refine_stmt(b, l + 1);
    if (!r) r = uses_stmt(b, l + 1);
    if (!r) r = anyxml_stmt(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    if (!r) r = short_case_stmt(b, l + 1);
    if (!r) r = choice_stmt(b, l + 1);
    if (!r) r = unique_stmt(b, l + 1);
    if (!r) r = key_stmt(b, l + 1);
    if (!r) r = list_stmt(b, l + 1);
    if (!r) r = leaf_list_stmt(b, l + 1);
    if (!r) r = leaf_stmt(b, l + 1);
    if (!r) r = container_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = value_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = error_app_tag_stmt(b, l + 1);
    if (!r) r = error_message_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = ordered_by_stmt(b, l + 1);
    if (!r) r = presence_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = position_stmt(b, l + 1);
    if (!r) r = bit_stmt(b, l + 1);
    if (!r) r = require_instance_stmt(b, l + 1);
    if (!r) r = path_stmt(b, l + 1);
    if (!r) r = enum_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = pattern_stmt(b, l + 1);
    if (!r) r = length_stmt(b, l + 1);
    if (!r) r = fraction_digits_stmt(b, l + 1);
    if (!r) r = range_stmt(b, l + 1);
    if (!r) r = type_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = feature_stmt(b, l + 1);
    if (!r) r = base_stmt(b, l + 1);
    if (!r) r = identity_stmt(b, l + 1);
    if (!r) r = yin_element_stmt(b, l + 1);
    if (!r) r = argument_stmt(b, l + 1);
    if (!r) r = extension_stmt(b, l + 1);
    if (!r) r = revision_date_stmt(b, l + 1);
    if (!r) r = revision_stmt(b, l + 1);
    if (!r) r = units_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = contact_stmt(b, l + 1);
    if (!r) r = organization_stmt(b, l + 1);
    if (!r) r = belongs_to_stmt(b, l + 1);
    if (!r) r = prefix_stmt(b, l + 1);
    if (!r) r = namespace_stmt(b, l + 1);
    if (!r) r = include_stmt(b, l + 1);
    if (!r) r = import_stmt(b, l + 1);
    if (!r) r = yang_version_stmt(b, l + 1);
    if (!r) r = unknown_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(';' | '{' |'}')
  static boolean StatementRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !StatementRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | '{' |'}'
  private static boolean StatementRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover_0")) return false;
    boolean r;
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = consumeToken(b, YANG_LEFT_BRACE);
    if (!r) r = consumeToken(b, YANG_RIGHT_BRACE);
    return r;
  }

  /* ********************************************************** */
  // Statement (';'|&'}')
  static boolean StatementWithSemi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementWithSemi")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = Statement(b, l + 1);
    p = r; // pin = 1
    r = r && StatementWithSemi_1(b, l + 1);
    exit_section_(b, l, m, r, p, YangParser::StatementRecover);
    return r || p;
  }

  // ';'|&'}'
  private static boolean StatementWithSemi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementWithSemi_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = StatementWithSemi_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean StatementWithSemi_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementWithSemi_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StatementWithSemi*
  static boolean Statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StatementWithSemi(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Statements", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('/' node_identifier)+
  public static boolean absolute_schema_nodeid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "absolute_schema_nodeid")) return false;
    if (!nextTokenIs(b, YANG_SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = absolute_schema_nodeid_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!absolute_schema_nodeid_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "absolute_schema_nodeid", c)) break;
    }
    exit_section_(b, m, YANG_ABSOLUTE_SCHEMA_NODEID, r);
    return r;
  }

  // '/' node_identifier
  private static boolean absolute_schema_nodeid_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "absolute_schema_nodeid_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SLASH);
    r = r && node_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'anyxml' string (';' | '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean anyxml_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt")) return false;
    if (!nextTokenIs(b, YANG_ANYXML_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ANYXML_KEYWORD);
    r = r && string(b, l + 1);
    r = r && anyxml_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_ANYXML_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean anyxml_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = anyxml_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean anyxml_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && anyxml_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean anyxml_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!anyxml_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "anyxml_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean anyxml_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = anyxml_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean anyxml_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyxml_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'argument' string (';' | '{'  (unknown_statement2)? (yin_element_stmt)? '}')
  public static boolean argument_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt")) return false;
    if (!nextTokenIs(b, YANG_ARGUMENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ARGUMENT_KEYWORD);
    r = r && string(b, l + 1);
    r = r && argument_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_ARGUMENT_STMT, r);
    return r;
  }

  // ';' | '{'  (unknown_statement2)? (yin_element_stmt)? '}'
  private static boolean argument_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = argument_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  (unknown_statement2)? (yin_element_stmt)? '}'
  private static boolean argument_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && argument_stmt_2_1_1(b, l + 1);
    r = r && argument_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (unknown_statement2)?
  private static boolean argument_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2_1_1")) return false;
    argument_stmt_2_1_1_0(b, l + 1);
    return true;
  }

  // (unknown_statement2)
  private static boolean argument_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unknown_statement2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (yin_element_stmt)?
  private static boolean argument_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2_1_2")) return false;
    argument_stmt_2_1_2_0(b, l + 1);
    return true;
  }

  // (yin_element_stmt)
  private static boolean argument_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = yin_element_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'augment' absolute_schema_nodeid '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep)* '}'
  public static boolean augment_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "augment_stmt")) return false;
    if (!nextTokenIs(b, YANG_AUGMENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_AUGMENT_KEYWORD);
    r = r && absolute_schema_nodeid(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && augment_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_AUGMENT_STMT, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep)*
  private static boolean augment_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "augment_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!augment_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "augment_stmt_4", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep
  private static boolean augment_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "augment_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = augment_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt
  private static boolean augment_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "augment_stmt_4_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'base' identifier_ref_arg stmtend
  public static boolean base_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_stmt")) return false;
    if (!nextTokenIs(b, YANG_BASE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_BASE_KEYWORD);
    r = r && identifier_ref_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_BASE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'belongs-to' identifier_arg '{'  prefix_stmt  '}'
  public static boolean belongs_to_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "belongs_to_stmt")) return false;
    if (!nextTokenIs(b, YANG_BELONGS_TO_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_BELONGS_TO_KEYWORD);
    r = r && identifier_arg(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && prefix_stmt(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_BELONGS_TO_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'bit' string (';' | '{' stmtsep ((position_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean bit_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt")) return false;
    if (!nextTokenIs(b, YANG_BIT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_BIT_KEYWORD);
    r = r && string(b, l + 1);
    r = r && bit_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_BIT_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((position_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean bit_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = bit_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((position_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean bit_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && bit_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((position_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean bit_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bit_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bit_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (position_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean bit_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bit_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // position_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean bit_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = position_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (bit_stmt stmtsep)+
  public static boolean bits_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bits_specification")) return false;
    if (!nextTokenIs(b, YANG_BIT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bits_specification_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!bits_specification_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bits_specification", c)) break;
    }
    exit_section_(b, m, YANG_BITS_SPECIFICATION, r);
    return r;
  }

  // bit_stmt stmtsep
  private static boolean bits_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bits_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bit_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmts | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt) stmtsep )*
  static boolean body_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_stmts")) return false;
    while (true) {
      int c = current_position_(b);
      if (!body_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_stmts", c)) break;
    }
    return true;
  }

  // (extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmts | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt) stmtsep
  private static boolean body_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = body_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmts | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt
  private static boolean body_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_stmts_0_0")) return false;
    boolean r;
    r = extension_stmt(b, l + 1);
    if (!r) r = feature_stmt(b, l + 1);
    if (!r) r = identity_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    if (!r) r = augment_stmt(b, l + 1);
    if (!r) r = rpc_stmt(b, l + 1);
    if (!r) r = notification_stmt(b, l + 1);
    if (!r) r = deviation_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'case' string (';' | '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts) stmtsep)* '}')
  public static boolean case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt")) return false;
    if (!nextTokenIs(b, YANG_CASE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_CASE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && case_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_CASE_STMT, r);
    return r;
  }

  // ';' | '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean case_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = case_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean case_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && case_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts) stmtsep)*
  private static boolean case_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts) stmtsep
  private static boolean case_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts
  private static boolean case_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'choice' string (';' | '{'  stmtsep ((when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt) stmtsep)* '}')
  public static boolean choice_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt")) return false;
    if (!nextTokenIs(b, YANG_CHOICE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_CHOICE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && choice_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_CHOICE_STMT, r);
    return r;
  }

  // ';' | '{'  stmtsep ((when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt) stmtsep)* '}'
  private static boolean choice_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = choice_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  stmtsep ((when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt) stmtsep)* '}'
  private static boolean choice_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && choice_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt) stmtsep)*
  private static boolean choice_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choice_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt) stmtsep
  private static boolean choice_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt
  private static boolean choice_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = short_case_stmt(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean config_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "config_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_CONFIG_ARG, "<config arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'config' config_arg stmtend
  public static boolean config_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "config_stmt")) return false;
    if (!nextTokenIs(b, YANG_CONFIG_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_CONFIG_KEYWORD);
    r = r && config_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_CONFIG_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'contact' string stmtend
  public static boolean contact_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contact_stmt")) return false;
    if (!nextTokenIs(b, YANG_CONTACT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_CONTACT_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_CONTACT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'container' string (';' | '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}')
  public static boolean container_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt")) return false;
    if (!nextTokenIs(b, YANG_CONTAINER_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_CONTAINER_KEYWORD);
    r = r && string(b, l + 1);
    r = r && container_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_CONTAINER_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean container_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = container_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean container_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && container_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)*
  private static boolean container_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!container_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "container_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep
  private static boolean container_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = container_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean container_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = presence_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | choice_stmt | anyxml_stmt | uses_stmt
  static boolean data_def_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_def_stmts")) return false;
    boolean r;
    r = container_stmt(b, l + 1);
    if (!r) r = leaf_stmt(b, l + 1);
    if (!r) r = leaf_list_stmt(b, l + 1);
    if (!r) r = list_stmt(b, l + 1);
    if (!r) r = choice_stmt(b, l + 1);
    if (!r) r = anyxml_stmt(b, l + 1);
    if (!r) r = uses_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DATE_ARG
  public static boolean date_arg_str(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "date_arg_str")) return false;
    if (!nextTokenIs(b, YANG_DATE_ARG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_DATE_ARG);
    exit_section_(b, m, YANG_DATE_ARG_STR, r);
    return r;
  }

  /* ********************************************************** */
  // (fraction_digits_stmt stmtsep | range_stmt stmtsep)+
  public static boolean decimal64_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal64_specification")) return false;
    if (!nextTokenIs(b, "<decimal 64 specification>", YANG_FRACTION_DIGITS_KEYWORD, YANG_RANGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_DECIMAL_64_SPECIFICATION, "<decimal 64 specification>");
    r = decimal64_specification_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decimal64_specification_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decimal64_specification", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fraction_digits_stmt stmtsep | range_stmt stmtsep
  private static boolean decimal64_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal64_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal64_specification_0_0(b, l + 1);
    if (!r) r = decimal64_specification_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fraction_digits_stmt stmtsep
  private static boolean decimal64_specification_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal64_specification_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fraction_digits_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // range_stmt stmtsep
  private static boolean decimal64_specification_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal64_specification_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'default' string stmtend
  public static boolean default_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEFAULT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_DEFAULT_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_DEFAULT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // node_identifier absolute_schema_nodeid*
  public static boolean descendant_schema_nodeid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "descendant_schema_nodeid")) return false;
    if (!nextTokenIs(b, YANG_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_identifier(b, l + 1);
    r = r && descendant_schema_nodeid_1(b, l + 1);
    exit_section_(b, m, YANG_DESCENDANT_SCHEMA_NODEID, r);
    return r;
  }

  // absolute_schema_nodeid*
  private static boolean descendant_schema_nodeid_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "descendant_schema_nodeid_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!absolute_schema_nodeid(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "descendant_schema_nodeid_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'description' string stmtend
  public static boolean description_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description_stmt")) return false;
    if (!nextTokenIs(b, YANG_DESCRIPTION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_DESCRIPTION_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_DESCRIPTION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'deviate' 'add' (';' | '{' (units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* '}')
  public static boolean deviate_add_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_add_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEVIATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_DEVIATE_KEYWORD, YANG_ADD_KEYWORD);
    r = r && deviate_add_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_DEVIATE_ADD_STMT, r);
    return r;
  }

  // ';' | '{' (units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* '}'
  private static boolean deviate_add_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_add_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = deviate_add_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* '}'
  private static boolean deviate_add_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_add_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && deviate_add_stmt_2_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  private static boolean deviate_add_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_add_stmt_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!deviate_add_stmt_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deviate_add_stmt_2_1_1", c)) break;
    }
    return true;
  }

  // units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt
  private static boolean deviate_add_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_add_stmt_2_1_1_0")) return false;
    boolean r;
    r = units_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = unique_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'deviate' 'delete' (';' | '{' (units_stmt | must_stmt | unique_stmt | default_stmt )* '}')
  public static boolean deviate_delete_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_delete_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEVIATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_DEVIATE_KEYWORD, YANG_DELETE_KEYWORD);
    r = r && deviate_delete_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_DEVIATE_DELETE_STMT, r);
    return r;
  }

  // ';' | '{' (units_stmt | must_stmt | unique_stmt | default_stmt )* '}'
  private static boolean deviate_delete_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_delete_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = deviate_delete_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (units_stmt | must_stmt | unique_stmt | default_stmt )* '}'
  private static boolean deviate_delete_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_delete_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && deviate_delete_stmt_2_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (units_stmt | must_stmt | unique_stmt | default_stmt )*
  private static boolean deviate_delete_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_delete_stmt_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!deviate_delete_stmt_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deviate_delete_stmt_2_1_1", c)) break;
    }
    return true;
  }

  // units_stmt | must_stmt | unique_stmt | default_stmt
  private static boolean deviate_delete_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_delete_stmt_2_1_1_0")) return false;
    boolean r;
    r = units_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = unique_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'deviate' 'not-supported' (';' | '{' stmtsep '}')
  public static boolean deviate_not_supported_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_not_supported_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEVIATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_DEVIATE_KEYWORD, YANG_NOT_SUPPORTED_KEYWORD);
    r = r && deviate_not_supported_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_DEVIATE_NOT_SUPPORTED_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep '}'
  private static boolean deviate_not_supported_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_not_supported_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = deviate_not_supported_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep '}'
  private static boolean deviate_not_supported_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_not_supported_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'deviate' 'replace' (';' | '{' (type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* '}')
  public static boolean deviate_replace_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_replace_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEVIATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_DEVIATE_KEYWORD, YANG_REPLACE_KEYWORD);
    r = r && deviate_replace_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_DEVIATE_REPLACE_STMT, r);
    return r;
  }

  // ';' | '{' (type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* '}'
  private static boolean deviate_replace_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_replace_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = deviate_replace_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* '}'
  private static boolean deviate_replace_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_replace_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && deviate_replace_stmt_2_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )*
  private static boolean deviate_replace_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_replace_stmt_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!deviate_replace_stmt_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deviate_replace_stmt_2_1_1", c)) break;
    }
    return true;
  }

  // type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt
  private static boolean deviate_replace_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviate_replace_stmt_2_1_1_0")) return false;
    boolean r;
    r = type_stmt(b, l + 1);
    if (!r) r = units_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'deviation' absolute_schema_nodeid '{' stmtsep (description_stmt stmtsep | reference_stmt stmtsep | (deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+)) '}'
  public static boolean deviation_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt")) return false;
    if (!nextTokenIs(b, YANG_DEVIATION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_DEVIATION_KEYWORD);
    r = r && absolute_schema_nodeid(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && deviation_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_DEVIATION_STMT, r);
    return r;
  }

  // description_stmt stmtsep | reference_stmt stmtsep | (deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+)
  private static boolean deviation_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deviation_stmt_4_0(b, l + 1);
    if (!r) r = deviation_stmt_4_1(b, l + 1);
    if (!r) r = deviation_stmt_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // description_stmt stmtsep
  private static boolean deviation_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = description_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // reference_stmt stmtsep
  private static boolean deviation_stmt_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reference_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+
  private static boolean deviation_stmt_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deviate_not_supported_stmt(b, l + 1);
    if (!r) r = deviation_stmt_4_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+
  private static boolean deviation_stmt_4_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deviation_stmt_4_2_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!deviation_stmt_4_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deviation_stmt_4_2_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt
  private static boolean deviation_stmt_4_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deviation_stmt_4_2_1_0")) return false;
    boolean r;
    r = deviate_add_stmt(b, l + 1);
    if (!r) r = deviate_replace_stmt(b, l + 1);
    if (!r) r = deviate_delete_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (enum_stmt)+
  public static boolean enum_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_specification")) return false;
    if (!nextTokenIs(b, YANG_ENUM_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_specification_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!enum_specification_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_specification", c)) break;
    }
    exit_section_(b, m, YANG_ENUM_SPECIFICATION, r);
    return r;
  }

  // (enum_stmt)
  private static boolean enum_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' string (';' | '{' (value_stmt | status_stmt | description_stmt | reference_stmt )* '}')
  public static boolean enum_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_stmt")) return false;
    if (!nextTokenIs(b, YANG_ENUM_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ENUM_KEYWORD);
    r = r && string(b, l + 1);
    r = r && enum_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_ENUM_STMT, r);
    return r;
  }

  // ';' | '{' (value_stmt | status_stmt | description_stmt | reference_stmt )* '}'
  private static boolean enum_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = enum_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (value_stmt | status_stmt | description_stmt | reference_stmt )* '}'
  private static boolean enum_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && enum_stmt_2_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (value_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean enum_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_stmt_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_stmt_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_stmt_2_1_1", c)) break;
    }
    return true;
  }

  // value_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean enum_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_stmt_2_1_1_0")) return false;
    boolean r;
    r = value_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'error-app-tag' string stmtend
  public static boolean error_app_tag_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_app_tag_stmt")) return false;
    if (!nextTokenIs(b, YANG_ERROR_APP_TAG_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ERROR_APP_TAG_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_ERROR_APP_TAG_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'error-message' string stmtend
  public static boolean error_message_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_message_stmt")) return false;
    if (!nextTokenIs(b, YANG_ERROR_MESSAGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ERROR_MESSAGE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_ERROR_MESSAGE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'extension' string (';' | '{' stmtsep ((argument_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean extension_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt")) return false;
    if (!nextTokenIs(b, YANG_EXTENSION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_EXTENSION_KEYWORD);
    r = r && string(b, l + 1);
    r = r && extension_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_EXTENSION_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((argument_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean extension_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = extension_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((argument_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean extension_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && extension_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((argument_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean extension_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extension_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extension_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (argument_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean extension_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extension_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean extension_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = argument_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'feature' string (';' | '{'  stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean feature_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt")) return false;
    if (!nextTokenIs(b, YANG_FEATURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_FEATURE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && feature_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_FEATURE_STMT, r);
    return r;
  }

  // ';' | '{'  stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean feature_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = feature_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean feature_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && feature_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((if_feature_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean feature_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!feature_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feature_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (if_feature_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean feature_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_feature_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean feature_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'fraction-digits' string stmtend
  public static boolean fraction_digits_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fraction_digits_stmt")) return false;
    if (!nextTokenIs(b, YANG_FRACTION_DIGITS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_FRACTION_DIGITS_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_FRACTION_DIGITS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'grouping' string (';' | '{' stmtsep ((status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}')
  public static boolean grouping_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt")) return false;
    if (!nextTokenIs(b, YANG_GROUPING_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_GROUPING_KEYWORD);
    r = r && string(b, l + 1);
    r = r && grouping_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_GROUPING_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean grouping_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = grouping_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  private static boolean grouping_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && grouping_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)*
  private static boolean grouping_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!grouping_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grouping_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep
  private static boolean grouping_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grouping_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean grouping_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouping_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_arg")) return false;
    if (!nextTokenIs(b, YANG_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_IDENTIFIER);
    exit_section_(b, m, YANG_IDENTIFIER_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //   | LEAFREF_TYPE
  //   | ANYXML_KEYWORD
  //   | ARGUMENT_KEYWORD
  //   | AUGMENT_KEYWORD
  //   | BASE_KEYWORD
  //   | BELONGS_TO_KEYWORD
  //   | BIT_KEYWORD
  //   | CASE_KEYWORD
  //   | CHOICE_KEYWORD
  //   | CONFIG_KEYWORD
  //   | CONTACT_KEYWORD
  //   | CONTAINER_KEYWORD
  //   | DEFAULT_KEYWORD
  //   | DESCRIPTION_KEYWORD
  //   | ENUM_KEYWORD
  //   | ERROR_APP_TAG_KEYWORD
  //   | ERROR_MESSAGE_KEYWORD
  //   | EXTENSION_KEYWORD
  //   | DEVIATION_KEYWORD
  //   | DEVIATE_KEYWORD
  //   | FEATURE_KEYWORD
  //   | FRACTION_DIGITS_KEYWORD
  //   | GROUPING_KEYWORD
  //   | IDENTITY_KEYWORD
  //   | IF_FEATURE_KEYWORD
  //   | IMPORT_KEYWORD
  //   | INCLUDE_KEYWORD
  //   | INPUT_KEYWORD
  //   | KEY_KEYWORD
  //   | LEAF_KEYWORD
  //   | LEAF_LIST_KEYWORD
  //   | LENGTH_KEYWORD
  //   | LIST_KEYWORD
  //   | MANDATORY_KEYWORD
  //   | MAX_ELEMENTS_KEYWORD
  //   | MIN_ELEMENTS_KEYWORD
  //   | MODULE_KEYWORD
  //   | MUST_KEYWORD
  //   | NAMESPACE_KEYWORD
  //   | NOTIFICATION_KEYWORD
  //   | ORDERED_BY_KEYWORD
  //   | ORGANIZATION_KEYWORD
  //   | OUTPUT_KEYWORD
  //   | PATH_KEYWORD
  //   | PATTERN_KEYWORD
  //   | POSITION_KEYWORD
  //   | PREFIX_KEYWORD
  //   | PRESENCE_KEYWORD
  //   | RANGE_KEYWORD
  //   | REFERENCE_KEYWORD
  //   | REFINE_KEYWORD
  //   | REQUIRE_INSTANCE_KEYWORD
  //   | REVISION_KEYWORD
  //   | REVISION_DATE_KEYWORD
  //   | RPC_KEYWORD
  //   | STATUS_KEYWORD
  //   | SUBMODULE_KEYWORD
  //   | TYPE_KEYWORD
  //   | TYPEDEF_KEYWORD
  //   | UNIQUE_KEYWORD
  //   | UNITS_KEYWORD
  //   | USES_KEYWORD
  //   | VALUE_KEYWORD
  //   | WHEN_KEYWORD
  //   | YANG_VERSION_KEYWORD
  //   | YIN_ELEMENT_KEYWORD
  //   | ADD_KEYWORD
  //   | CURRENT_KEYWORD
  //   | DELETE_KEYWORD
  //   | DEPRECATED_KEYWORD
  //   | FALSE_KEYWORD
  //   | MAX_KEYWORD
  //   | MIN_KEYWORD
  //   | NOT_SUPPORTED_KEYWORD
  //   | OBSOLETE_KEYWORD
  //   | REPLACE_KEYWORD
  //   | SYSTEM_KEYWORD
  //   | TRUE_KEYWORD
  //   | UNBOUNDED_KEYWORD
  //   | USER_KEYWORD
  public static boolean identifier_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_IDENTIFIER_LITERAL, "<identifier literal>");
    r = consumeToken(b, YANG_IDENTIFIER);
    if (!r) r = consumeToken(b, YANG_LEAFREF_TYPE);
    if (!r) r = consumeToken(b, YANG_ANYXML_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ARGUMENT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_AUGMENT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_BASE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_BELONGS_TO_KEYWORD);
    if (!r) r = consumeToken(b, YANG_BIT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CASE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CHOICE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CONFIG_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CONTACT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CONTAINER_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DEFAULT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DESCRIPTION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ENUM_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ERROR_APP_TAG_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ERROR_MESSAGE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_EXTENSION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DEVIATION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DEVIATE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_FEATURE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_FRACTION_DIGITS_KEYWORD);
    if (!r) r = consumeToken(b, YANG_GROUPING_KEYWORD);
    if (!r) r = consumeToken(b, YANG_IDENTITY_KEYWORD);
    if (!r) r = consumeToken(b, YANG_IF_FEATURE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_IMPORT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_INCLUDE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_INPUT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_KEY_KEYWORD);
    if (!r) r = consumeToken(b, YANG_LEAF_KEYWORD);
    if (!r) r = consumeToken(b, YANG_LEAF_LIST_KEYWORD);
    if (!r) r = consumeToken(b, YANG_LENGTH_KEYWORD);
    if (!r) r = consumeToken(b, YANG_LIST_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MANDATORY_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MAX_ELEMENTS_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MIN_ELEMENTS_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MODULE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MUST_KEYWORD);
    if (!r) r = consumeToken(b, YANG_NAMESPACE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_NOTIFICATION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ORDERED_BY_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ORGANIZATION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_OUTPUT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_PATH_KEYWORD);
    if (!r) r = consumeToken(b, YANG_PATTERN_KEYWORD);
    if (!r) r = consumeToken(b, YANG_POSITION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_PREFIX_KEYWORD);
    if (!r) r = consumeToken(b, YANG_PRESENCE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_RANGE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REFERENCE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REFINE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REVISION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REVISION_DATE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_RPC_KEYWORD);
    if (!r) r = consumeToken(b, YANG_STATUS_KEYWORD);
    if (!r) r = consumeToken(b, YANG_SUBMODULE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_TYPE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_TYPEDEF_KEYWORD);
    if (!r) r = consumeToken(b, YANG_UNIQUE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_UNITS_KEYWORD);
    if (!r) r = consumeToken(b, YANG_USES_KEYWORD);
    if (!r) r = consumeToken(b, YANG_VALUE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_WHEN_KEYWORD);
    if (!r) r = consumeToken(b, YANG_YANG_VERSION_KEYWORD);
    if (!r) r = consumeToken(b, YANG_YIN_ELEMENT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_ADD_KEYWORD);
    if (!r) r = consumeToken(b, YANG_CURRENT_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DELETE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_DEPRECATED_KEYWORD);
    if (!r) r = consumeToken(b, YANG_FALSE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MAX_KEYWORD);
    if (!r) r = consumeToken(b, YANG_MIN_KEYWORD);
    if (!r) r = consumeToken(b, YANG_NOT_SUPPORTED_KEYWORD);
    if (!r) r = consumeToken(b, YANG_OBSOLETE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_REPLACE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_SYSTEM_KEYWORD);
    if (!r) r = consumeToken(b, YANG_TRUE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_UNBOUNDED_KEYWORD);
    if (!r) r = consumeToken(b, YANG_USER_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [prefix ':'] identifier_literal
  public static boolean identifier_ref_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_ref_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_IDENTIFIER_REF_ARG, "<identifier ref arg>");
    r = identifier_ref_arg_0(b, l + 1);
    r = r && identifier_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [prefix ':']
  private static boolean identifier_ref_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_ref_arg_0")) return false;
    identifier_ref_arg_0_0(b, l + 1);
    return true;
  }

  // prefix ':'
  private static boolean identifier_ref_arg_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_ref_arg_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    r = r && consumeToken(b, YANG_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'identity' string (';' | '{' stmtsep ((base_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean identity_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt")) return false;
    if (!nextTokenIs(b, YANG_IDENTITY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_IDENTITY_KEYWORD);
    r = r && string(b, l + 1);
    r = r && identity_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_IDENTITY_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((base_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean identity_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = identity_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((base_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean identity_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && identity_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((base_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean identity_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identity_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identity_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (base_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean identity_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identity_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // base_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean identity_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identity_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = base_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // base_stmt
  public static boolean identityref_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityref_specification")) return false;
    if (!nextTokenIs(b, YANG_BASE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_stmt(b, l + 1);
    exit_section_(b, m, YANG_IDENTITYREF_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'if-feature' identifier_ref_arg stmtend
  public static boolean if_feature_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_feature_stmt")) return false;
    if (!nextTokenIs(b, YANG_IF_FEATURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_IF_FEATURE_KEYWORD);
    r = r && identifier_ref_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_IF_FEATURE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' identifier_arg '{' prefix_stmt  (revision_date_stmt )? '}'
  public static boolean import_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt")) return false;
    if (!nextTokenIs(b, YANG_IMPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_IMPORT_KEYWORD);
    r = r && identifier_arg(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && prefix_stmt(b, l + 1);
    r = r && import_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_IMPORT_STMT, r);
    return r;
  }

  // (revision_date_stmt )?
  private static boolean import_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_4")) return false;
    import_stmt_4_0(b, l + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean import_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = revision_date_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' identifier_arg (';' | '{'  (revision_date_stmt )? '}')
  public static boolean include_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt")) return false;
    if (!nextTokenIs(b, YANG_INCLUDE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_INCLUDE_KEYWORD);
    r = r && identifier_arg(b, l + 1);
    r = r && include_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_INCLUDE_STMT, r);
    return r;
  }

  // ';' | '{'  (revision_date_stmt )? '}'
  private static boolean include_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = include_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  (revision_date_stmt )? '}'
  private static boolean include_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && include_stmt_2_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (revision_date_stmt )?
  private static boolean include_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2_1_1")) return false;
    include_stmt_2_1_1_0(b, l + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean include_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = revision_date_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'input' '{' stmtsep ((typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  public static boolean input_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_stmt")) return false;
    if (!nextTokenIs(b, YANG_INPUT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_INPUT_KEYWORD, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && input_stmt_3(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_INPUT_STMT, r);
    return r;
  }

  // ((typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)*
  private static boolean input_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!input_stmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_stmt_3", c)) break;
    }
    return true;
  }

  // (typedef_stmt | grouping_stmt | data_def_stmts) stmtsep
  private static boolean input_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_stmt_3_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean input_stmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_stmt_3_0_0")) return false;
    boolean r;
    r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // require_instance_stmt stmtsep
  public static boolean instance_identifier_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_identifier_specification")) return false;
    if (!nextTokenIs(b, YANG_REQUIRE_INSTANCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = require_instance_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, YANG_INSTANCE_IDENTIFIER_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'key' string stmtend
  public static boolean key_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_stmt")) return false;
    if (!nextTokenIs(b, YANG_KEY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_KEY_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_KEY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'leaf-list' string '{'  stmtsep ((when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep)* '}'
  public static boolean leaf_list_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_list_stmt")) return false;
    if (!nextTokenIs(b, YANG_LEAF_LIST_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEAF_LIST_KEYWORD);
    r = r && string(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && leaf_list_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_LEAF_LIST_STMT, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep)*
  private static boolean leaf_list_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_list_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!leaf_list_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "leaf_list_stmt_4", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep
  private static boolean leaf_list_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_list_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = leaf_list_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean leaf_list_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_list_stmt_4_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = type_stmt(b, l + 1);
    if (!r) r = units_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    if (!r) r = ordered_by_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'leaf' string '{' stmtsep ((when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep)* '}'
  public static boolean leaf_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_stmt")) return false;
    if (!nextTokenIs(b, YANG_LEAF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEAF_KEYWORD);
    r = r && string(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && leaf_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_LEAF_STMT, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep)*
  private static boolean leaf_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!leaf_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "leaf_stmt_4", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt ) stmtsep
  private static boolean leaf_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = leaf_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean leaf_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leaf_stmt_4_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = type_stmt(b, l + 1);
    if (!r) r = units_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // path_stmt
  public static boolean leafref_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leafref_specification")) return false;
    if (!nextTokenIs(b, YANG_PATH_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_stmt(b, l + 1);
    exit_section_(b, m, YANG_LEAFREF_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'length' string (';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean length_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt")) return false;
    if (!nextTokenIs(b, YANG_LENGTH_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LENGTH_KEYWORD);
    r = r && string(b, l + 1);
    r = r && length_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_LENGTH_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean length_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = length_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean length_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && length_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean length_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!length_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "length_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean length_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = length_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean length_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = error_message_stmt(b, l + 1);
    if (!r) r = error_app_tag_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (import_stmt | include_stmt )*
  static boolean linkage_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkage_stmts")) return false;
    while (true) {
      int c = current_position_(b);
      if (!linkage_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "linkage_stmts", c)) break;
    }
    return true;
  }

  // import_stmt | include_stmt
  private static boolean linkage_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkage_stmts_0")) return false;
    boolean r;
    r = import_stmt(b, l + 1);
    if (!r) r = include_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'list' string '{'  stmtsep ((when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep )* '}'
  public static boolean list_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_stmt")) return false;
    if (!nextTokenIs(b, YANG_LIST_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LIST_KEYWORD);
    r = r && string(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && list_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_LIST_STMT, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep )*
  private static boolean list_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_stmt_4", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts) stmtsep
  private static boolean list_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean list_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_stmt_4_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = must_stmt(b, l + 1);
    if (!r) r = key_stmt(b, l + 1);
    if (!r) r = unique_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    if (!r) r = ordered_by_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'true'|'false'
  public static boolean mandatory_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mandatory_arg")) return false;
    if (!nextTokenIs(b, "<mandatory arg>", YANG_FALSE_KEYWORD, YANG_TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_MANDATORY_ARG, "<mandatory arg>");
    r = consumeToken(b, YANG_TRUE_KEYWORD);
    if (!r) r = consumeToken(b, YANG_FALSE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'mandatory' mandatory_arg stmtend
  public static boolean mandatory_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mandatory_stmt")) return false;
    if (!nextTokenIs(b, YANG_MANDATORY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_MANDATORY_KEYWORD);
    r = r && mandatory_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_MANDATORY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'max-elements' max_value_arg stmtend
  public static boolean max_elements_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "max_elements_stmt")) return false;
    if (!nextTokenIs(b, YANG_MAX_ELEMENTS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_MAX_ELEMENTS_KEYWORD);
    r = r && max_value_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_MAX_ELEMENTS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean max_value_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "max_value_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_MAX_VALUE_ARG, "<max value arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (organization_stmt | contact_stmt | description_stmt | reference_stmt )*
  static boolean meta_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meta_stmts")) return false;
    while (true) {
      int c = current_position_(b);
      if (!meta_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "meta_stmts", c)) break;
    }
    return true;
  }

  // organization_stmt | contact_stmt | description_stmt | reference_stmt
  private static boolean meta_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meta_stmts_0")) return false;
    boolean r;
    r = organization_stmt(b, l + 1);
    if (!r) r = contact_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'min-elements' min_value_arg stmtend
  public static boolean min_elements_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "min_elements_stmt")) return false;
    if (!nextTokenIs(b, YANG_MIN_ELEMENTS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_MIN_ELEMENTS_KEYWORD);
    r = r && min_value_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_MIN_ELEMENTS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean min_value_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "min_value_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_MIN_VALUE_ARG, "<min value arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (yang_version_stmt | namespace_stmt | prefix_stmt)+
  static boolean module_header_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_header_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_header_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!module_header_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_header_stmts", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // yang_version_stmt | namespace_stmt | prefix_stmt
  private static boolean module_header_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_header_stmts_0")) return false;
    boolean r;
    r = yang_version_stmt(b, l + 1);
    if (!r) r = namespace_stmt(b, l + 1);
    if (!r) r = prefix_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'module' identifier_arg '{' module_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts '}'
  public static boolean module_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_stmt")) return false;
    if (!nextTokenIs(b, YANG_MODULE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_MODULE_KEYWORD);
    r = r && identifier_arg(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && module_header_stmts(b, l + 1);
    r = r && linkage_stmts(b, l + 1);
    r = r && meta_stmts(b, l + 1);
    r = r && revision_stmts(b, l + 1);
    r = r && body_stmts(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_MODULE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'must' string (';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean must_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt")) return false;
    if (!nextTokenIs(b, YANG_MUST_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_MUST_KEYWORD);
    r = r && string(b, l + 1);
    r = r && must_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_MUST_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean must_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = must_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean must_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && must_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean must_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!must_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "must_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean must_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = must_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean must_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "must_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = error_message_stmt(b, l + 1);
    if (!r) r = error_app_tag_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'namespace' string_literal stmtend
  public static boolean namespace_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_stmt")) return false;
    if (!nextTokenIs(b, YANG_NAMESPACE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_NAMESPACE_KEYWORD);
    r = r && string_literal(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_NAMESPACE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // [prefix ":"] IDENTIFIER
  public static boolean node_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_identifier")) return false;
    if (!nextTokenIs(b, YANG_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_identifier_0(b, l + 1);
    r = r && consumeToken(b, YANG_IDENTIFIER);
    exit_section_(b, m, YANG_NODE_IDENTIFIER, r);
    return r;
  }

  // [prefix ":"]
  private static boolean node_identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_identifier_0")) return false;
    node_identifier_0_0(b, l + 1);
    return true;
  }

  // prefix ":"
  private static boolean node_identifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_identifier_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    r = r && consumeToken(b, YANG_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'notification' string (';' | '{' stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts ) stmtsep)* '}')
  public static boolean notification_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt")) return false;
    if (!nextTokenIs(b, YANG_NOTIFICATION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_NOTIFICATION_KEYWORD);
    r = r && string(b, l + 1);
    r = r && notification_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_NOTIFICATION_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts ) stmtsep)* '}'
  private static boolean notification_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = notification_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts ) stmtsep)* '}'
  private static boolean notification_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && notification_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts ) stmtsep)*
  private static boolean notification_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!notification_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "notification_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts ) stmtsep
  private static boolean notification_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = notification_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean notification_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notification_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // range_stmt
  public static boolean numerical_restrictions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numerical_restrictions")) return false;
    if (!nextTokenIs(b, YANG_RANGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_stmt(b, l + 1);
    exit_section_(b, m, YANG_NUMERICAL_RESTRICTIONS, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean ordered_by_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_by_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_ORDERED_BY_ARG, "<ordered by arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'ordered-by' ordered_by_arg stmtend
  public static boolean ordered_by_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_by_stmt")) return false;
    if (!nextTokenIs(b, YANG_ORDERED_BY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ORDERED_BY_KEYWORD);
    r = r && ordered_by_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_ORDERED_BY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'organization' string stmtend
  public static boolean organization_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "organization_stmt")) return false;
    if (!nextTokenIs(b, YANG_ORGANIZATION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_ORGANIZATION_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_ORGANIZATION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'output' '{' stmtsep ((typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)* '}'
  public static boolean output_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_stmt")) return false;
    if (!nextTokenIs(b, YANG_OUTPUT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, YANG_OUTPUT_KEYWORD, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && output_stmt_3(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_OUTPUT_STMT, r);
    return r;
  }

  // ((typedef_stmt | grouping_stmt | data_def_stmts) stmtsep)*
  private static boolean output_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!output_stmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "output_stmt_3", c)) break;
    }
    return true;
  }

  // (typedef_stmt | grouping_stmt | data_def_stmts) stmtsep
  private static boolean output_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = output_stmt_3_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typedef_stmt | grouping_stmt | data_def_stmts
  private static boolean output_stmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_stmt_3_0_0")) return false;
    boolean r;
    r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'path' string stmtend
  public static boolean path_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_stmt")) return false;
    if (!nextTokenIs(b, YANG_PATH_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_PATH_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_PATH_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'pattern' string (';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean pattern_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt")) return false;
    if (!nextTokenIs(b, YANG_PATTERN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_PATTERN_KEYWORD);
    r = r && string(b, l + 1);
    r = r && pattern_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_PATTERN_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean pattern_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = pattern_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean pattern_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && pattern_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean pattern_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pattern_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pattern_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean pattern_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean pattern_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = error_message_stmt(b, l + 1);
    if (!r) r = error_app_tag_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'position' string stmtend
  public static boolean position_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "position_stmt")) return false;
    if (!nextTokenIs(b, YANG_POSITION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_POSITION_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_POSITION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, YANG_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_IDENTIFIER);
    exit_section_(b, m, YANG_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // 'prefix' string stmtend
  public static boolean prefix_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_stmt")) return false;
    if (!nextTokenIs(b, YANG_PREFIX_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_PREFIX_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_PREFIX_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'presence' string stmtend
  public static boolean presence_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "presence_stmt")) return false;
    if (!nextTokenIs(b, YANG_PRESENCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_PRESENCE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_PRESENCE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'range' string (';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean range_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt")) return false;
    if (!nextTokenIs(b, YANG_RANGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_RANGE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && range_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_RANGE_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean range_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = range_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean range_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && range_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean range_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!range_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "range_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean range_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean range_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = error_message_stmt(b, l + 1);
    if (!r) r = error_app_tag_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'reference' string stmtend
  public static boolean reference_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_stmt")) return false;
    if (!nextTokenIs(b, YANG_REFERENCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_REFERENCE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_REFERENCE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // ((must_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_anyxml_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_anyxml_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_ANYXML_STMTS, "<refine anyxml stmts>");
    r = refine_anyxml_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_anyxml_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_anyxml_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (must_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_anyxml_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_anyxml_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_anyxml_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // must_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_anyxml_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_anyxml_stmts_0_0")) return false;
    boolean r;
    r = must_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_case_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_case_stmts")) return false;
    if (!nextTokenIs(b, "<refine case stmts>", YANG_DESCRIPTION_KEYWORD, YANG_REFERENCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_CASE_STMTS, "<refine case stmts>");
    r = refine_case_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_case_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_case_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (description_stmt | reference_stmt) stmtsep
  private static boolean refine_case_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_case_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_case_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // description_stmt | reference_stmt
  private static boolean refine_case_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_case_stmts_0_0")) return false;
    boolean r;
    r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep )+
  public static boolean refine_choice_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_choice_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_CHOICE_STMTS, "<refine choice stmts>");
    r = refine_choice_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_choice_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_choice_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_choice_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_choice_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_choice_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_choice_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_choice_stmts_0_0")) return false;
    boolean r;
    r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((must_stmt | presence_stmt | config_stmt | description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_container_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_container_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_CONTAINER_STMTS, "<refine container stmts>");
    r = refine_container_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_container_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_container_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (must_stmt | presence_stmt | config_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_container_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_container_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_container_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // must_stmt | presence_stmt | config_stmt | description_stmt | reference_stmt
  private static boolean refine_container_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_container_stmts_0_0")) return false;
    boolean r;
    r = must_stmt(b, l + 1);
    if (!r) r = presence_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_leaf_list_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_list_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_LEAF_LIST_STMTS, "<refine leaf list stmts>");
    r = refine_leaf_list_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_leaf_list_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_leaf_list_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_leaf_list_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_list_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_leaf_list_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt
  private static boolean refine_leaf_list_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_list_stmts_0_0")) return false;
    boolean r;
    r = must_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((must_stmt | default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_leaf_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_LEAF_STMTS, "<refine leaf stmts>");
    r = refine_leaf_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_leaf_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_leaf_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (must_stmt | default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_leaf_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_leaf_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // must_stmt | default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_leaf_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_leaf_stmts_0_0")) return false;
    boolean r;
    r = must_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = mandatory_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt) stmtsep)+
  public static boolean refine_list_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_list_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_LIST_STMTS, "<refine list stmts>");
    r = refine_list_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!refine_list_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "refine_list_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean refine_list_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_list_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refine_list_stmts_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt
  private static boolean refine_list_stmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_list_stmts_0_0")) return false;
    boolean r;
    r = must_stmt(b, l + 1);
    if (!r) r = config_stmt(b, l + 1);
    if (!r) r = min_elements_stmt(b, l + 1);
    if (!r) r = max_elements_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts
  public static boolean refine_pom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_pom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REFINE_POM, "<refine pom>");
    r = refine_container_stmts(b, l + 1);
    if (!r) r = refine_leaf_stmts(b, l + 1);
    if (!r) r = refine_leaf_list_stmts(b, l + 1);
    if (!r) r = refine_list_stmts(b, l + 1);
    if (!r) r = refine_choice_stmts(b, l + 1);
    if (!r) r = refine_case_stmts(b, l + 1);
    if (!r) r = refine_anyxml_stmts(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'refine' string (';' | '{' stmtsep refine_pom '}')
  public static boolean refine_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_stmt")) return false;
    if (!nextTokenIs(b, YANG_REFINE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_REFINE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && refine_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_REFINE_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep refine_pom '}'
  private static boolean refine_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = refine_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep refine_pom '}'
  private static boolean refine_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refine_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && refine_pom(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean require_instance_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_instance_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_REQUIRE_INSTANCE_ARG, "<require instance arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'require-instance' require_instance_arg stmtend
  public static boolean require_instance_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_instance_stmt")) return false;
    if (!nextTokenIs(b, YANG_REQUIRE_INSTANCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_REQUIRE_INSTANCE_KEYWORD);
    r = r && require_instance_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_REQUIRE_INSTANCE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'revision-date' date_arg_str stmtend
  public static boolean revision_date_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_date_stmt")) return false;
    if (!nextTokenIs(b, YANG_REVISION_DATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_REVISION_DATE_KEYWORD);
    r = r && date_arg_str(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_REVISION_DATE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'revision' date_arg_str (';' | '{'  (stmtsep)? (description_stmt)? (reference_stmt)? '}')
  public static boolean revision_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt")) return false;
    if (!nextTokenIs(b, YANG_REVISION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_REVISION_KEYWORD);
    r = r && date_arg_str(b, l + 1);
    r = r && revision_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_REVISION_STMT, r);
    return r;
  }

  // ';' | '{'  (stmtsep)? (description_stmt)? (reference_stmt)? '}'
  private static boolean revision_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = revision_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  (stmtsep)? (description_stmt)? (reference_stmt)? '}'
  private static boolean revision_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && revision_stmt_2_1_1(b, l + 1);
    r = r && revision_stmt_2_1_2(b, l + 1);
    r = r && revision_stmt_2_1_3(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (stmtsep)?
  private static boolean revision_stmt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_1")) return false;
    revision_stmt_2_1_1_0(b, l + 1);
    return true;
  }

  // (stmtsep)
  private static boolean revision_stmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (description_stmt)?
  private static boolean revision_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_2")) return false;
    revision_stmt_2_1_2_0(b, l + 1);
    return true;
  }

  // (description_stmt)
  private static boolean revision_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = description_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (reference_stmt)?
  private static boolean revision_stmt_2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_3")) return false;
    revision_stmt_2_1_3_0(b, l + 1);
    return true;
  }

  // (reference_stmt)
  private static boolean revision_stmt_2_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmt_2_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reference_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (revision_stmt stmtsep)*
  static boolean revision_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmts")) return false;
    while (true) {
      int c = current_position_(b);
      if (!revision_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "revision_stmts", c)) break;
    }
    return true;
  }

  // revision_stmt stmtsep
  private static boolean revision_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "revision_stmts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = revision_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'rpc' string (';' | '{' stmtsep ((if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt) stmtsep)* '}')
  public static boolean rpc_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt")) return false;
    if (!nextTokenIs(b, YANG_RPC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_RPC_KEYWORD);
    r = r && string(b, l + 1);
    r = r && rpc_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_RPC_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt) stmtsep)* '}'
  private static boolean rpc_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = rpc_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt) stmtsep)* '}'
  private static boolean rpc_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && rpc_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt) stmtsep)*
  private static boolean rpc_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rpc_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rpc_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt) stmtsep
  private static boolean rpc_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rpc_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt
  private static boolean rpc_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rpc_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = typedef_stmt(b, l + 1);
    if (!r) r = grouping_stmt(b, l + 1);
    if (!r) r = input_stmt(b, l + 1);
    if (!r) r = output_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | anyxml_stmt
  public static boolean short_case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "short_case_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, YANG_SHORT_CASE_STMT, "<short case stmt>");
    r = container_stmt(b, l + 1);
    if (!r) r = leaf_stmt(b, l + 1);
    if (!r) r = leaf_list_stmt(b, l + 1);
    if (!r) r = list_stmt(b, l + 1);
    if (!r) r = anyxml_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean status_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "status_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_STATUS_ARG, "<status arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'status' status_arg stmtend
  public static boolean status_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "status_stmt")) return false;
    if (!nextTokenIs(b, YANG_STATUS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_STATUS_KEYWORD);
    r = r && status_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_STATUS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // ';' | ('{' unknown_statement? '}')
  public static boolean stmtend(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmtend")) return false;
    if (!nextTokenIs(b, "<stmtend>", YANG_LEFT_BRACE, YANG_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_STMTEND, "<stmtend>");
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = stmtend_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' unknown_statement? '}'
  private static boolean stmtend_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmtend_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtend_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // unknown_statement?
  private static boolean stmtend_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmtend_1_1")) return false;
    unknown_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // unknown_statement*
  public static boolean stmtsep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmtsep")) return false;
    Marker m = enter_section_(b, l, _NONE_, YANG_STMTSEP, "<stmtsep>");
    while (true) {
      int c = current_position_(b);
      if (!unknown_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmtsep", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // UNQUOTED_STRING | string_literal
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_STRING, "<string>");
    r = consumeToken(b, YANG_UNQUOTED_STRING);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier_literal | SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_STRING_LITERAL, "<string literal>");
    r = identifier_literal(b, l + 1);
    if (!r) r = consumeToken(b, YANG_SINGLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, YANG_DOUBLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (length_stmt stmtsep | pattern_stmt stmtsep)+
  public static boolean string_restrictions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_restrictions")) return false;
    if (!nextTokenIs(b, "<string restrictions>", YANG_LENGTH_KEYWORD, YANG_PATTERN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_STRING_RESTRICTIONS, "<string restrictions>");
    r = string_restrictions_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!string_restrictions_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_restrictions", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // length_stmt stmtsep | pattern_stmt stmtsep
  private static boolean string_restrictions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_restrictions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_restrictions_0_0(b, l + 1);
    if (!r) r = string_restrictions_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // length_stmt stmtsep
  private static boolean string_restrictions_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_restrictions_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = length_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pattern_stmt stmtsep
  private static boolean string_restrictions_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_restrictions_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (yang_version_stmt | belongs_to_stmt)+
  public static boolean submodule_header_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "submodule_header_stmts")) return false;
    if (!nextTokenIs(b, "<submodule header stmts>", YANG_BELONGS_TO_KEYWORD, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_SUBMODULE_HEADER_STMTS, "<submodule header stmts>");
    r = submodule_header_stmts_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!submodule_header_stmts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "submodule_header_stmts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // yang_version_stmt | belongs_to_stmt
  private static boolean submodule_header_stmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "submodule_header_stmts_0")) return false;
    boolean r;
    r = yang_version_stmt(b, l + 1);
    if (!r) r = belongs_to_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'submodule' identifier_arg '{' submodule_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts '}'
  public static boolean submodule_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "submodule_stmt")) return false;
    if (!nextTokenIs(b, YANG_SUBMODULE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SUBMODULE_KEYWORD);
    r = r && identifier_arg(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && submodule_header_stmts(b, l + 1);
    r = r && linkage_stmts(b, l + 1);
    r = r && meta_stmts(b, l + 1);
    r = r && revision_stmts(b, l + 1);
    r = r && body_stmts(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_SUBMODULE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // numerical_restrictions | leafref_specification | enum_specification | decimal64_specification | string_restrictions | identityref_specification | instance_identifier_specification | bits_specification | union_specification
  public static boolean type_body_stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_body_stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_TYPE_BODY_STMTS, "<type body stmts>");
    r = numerical_restrictions(b, l + 1);
    if (!r) r = leafref_specification(b, l + 1);
    if (!r) r = enum_specification(b, l + 1);
    if (!r) r = decimal64_specification(b, l + 1);
    if (!r) r = string_restrictions(b, l + 1);
    if (!r) r = identityref_specification(b, l + 1);
    if (!r) r = instance_identifier_specification(b, l + 1);
    if (!r) r = bits_specification(b, l + 1);
    if (!r) r = union_specification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'type' identifier_ref_arg (';' | '{'  type_body_stmts '}')
  public static boolean type_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_stmt")) return false;
    if (!nextTokenIs(b, YANG_TYPE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_TYPE_KEYWORD);
    r = r && identifier_ref_arg(b, l + 1);
    r = r && type_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_TYPE_STMT, r);
    return r;
  }

  // ';' | '{'  type_body_stmts '}'
  private static boolean type_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = type_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  type_body_stmts '}'
  private static boolean type_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && type_body_stmts(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'typedef' string '{'  stmtsep ((type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)* '}'
  public static boolean typedef_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_stmt")) return false;
    if (!nextTokenIs(b, YANG_TYPEDEF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_TYPEDEF_KEYWORD);
    r = r && string(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && typedef_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_TYPEDEF_STMT, r);
    return r;
  }

  // ((type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt) stmtsep)*
  private static boolean typedef_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typedef_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typedef_stmt_4", c)) break;
    }
    return true;
  }

  // (type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt) stmtsep
  private static boolean typedef_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedef_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean typedef_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_stmt_4_0_0")) return false;
    boolean r;
    r = type_stmt(b, l + 1);
    if (!r) r = units_stmt(b, l + 1);
    if (!r) r = default_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (type_stmt stmtsep)+
  public static boolean union_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_specification")) return false;
    if (!nextTokenIs(b, YANG_TYPE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = union_specification_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!union_specification_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_specification", c)) break;
    }
    exit_section_(b, m, YANG_UNION_SPECIFICATION, r);
    return r;
  }

  // type_stmt stmtsep
  private static boolean union_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_stmt(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'unique' string stmtend
  public static boolean unique_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unique_stmt")) return false;
    if (!nextTokenIs(b, YANG_UNIQUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_UNIQUE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_UNIQUE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'units' string stmtend
  public static boolean units_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "units_stmt")) return false;
    if (!nextTokenIs(b, YANG_UNITS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_UNITS_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_UNITS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // prefix ':' identifier_literal string? (';' | '{' unknown_statement2* '}')
  public static boolean unknown_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement")) return false;
    if (!nextTokenIs(b, YANG_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    r = r && consumeToken(b, YANG_COLON);
    r = r && identifier_literal(b, l + 1);
    r = r && unknown_statement_3(b, l + 1);
    r = r && unknown_statement_4(b, l + 1);
    exit_section_(b, m, YANG_UNKNOWN_STATEMENT, r);
    return r;
  }

  // string?
  private static boolean unknown_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement_3")) return false;
    string(b, l + 1);
    return true;
  }

  // ';' | '{' unknown_statement2* '}'
  private static boolean unknown_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = unknown_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' unknown_statement2* '}'
  private static boolean unknown_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && unknown_statement_4_1_1(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // unknown_statement2*
  private static boolean unknown_statement_4_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement_4_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unknown_statement2(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unknown_statement_4_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Statement
  public static boolean unknown_statement2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknown_statement2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, YANG_UNKNOWN_STATEMENT_2, "<unknown statement 2>");
    r = Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'augment' descendant_schema_nodeid '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep)* '}'
  public static boolean uses_augment_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_augment_stmt")) return false;
    if (!nextTokenIs(b, YANG_AUGMENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_AUGMENT_KEYWORD);
    r = r && descendant_schema_nodeid(b, l + 1);
    r = r && consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && uses_augment_stmt_4(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, YANG_USES_AUGMENT_STMT, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep)*
  private static boolean uses_augment_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_augment_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!uses_augment_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "uses_augment_stmt_4", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt) stmtsep
  private static boolean uses_augment_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_augment_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = uses_augment_stmt_4_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmts | case_stmt
  private static boolean uses_augment_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_augment_stmt_4_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = data_def_stmts(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'uses' identifier_ref_arg (';' | '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt) stmtsep)* '}')
  public static boolean uses_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt")) return false;
    if (!nextTokenIs(b, YANG_USES_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_USES_KEYWORD);
    r = r && identifier_ref_arg(b, l + 1);
    r = r && uses_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_USES_STMT, r);
    return r;
  }

  // ';' | '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt) stmtsep)* '}'
  private static boolean uses_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = uses_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'  stmtsep ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt) stmtsep)* '}'
  private static boolean uses_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && uses_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt) stmtsep)*
  private static boolean uses_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!uses_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "uses_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt) stmtsep
  private static boolean uses_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = uses_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt
  private static boolean uses_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = when_stmt(b, l + 1);
    if (!r) r = if_feature_stmt(b, l + 1);
    if (!r) r = status_stmt(b, l + 1);
    if (!r) r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    if (!r) r = refine_stmt(b, l + 1);
    if (!r) r = uses_augment_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'value' string stmtend
  public static boolean value_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_stmt")) return false;
    if (!nextTokenIs(b, YANG_VALUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_VALUE_KEYWORD);
    r = r && string(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_VALUE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'when' string (';' | '{' stmtsep ((description_stmt | reference_stmt) stmtsep)* '}')
  public static boolean when_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt")) return false;
    if (!nextTokenIs(b, YANG_WHEN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_WHEN_KEYWORD);
    r = r && string(b, l + 1);
    r = r && when_stmt_2(b, l + 1);
    exit_section_(b, m, YANG_WHEN_STMT, r);
    return r;
  }

  // ';' | '{' stmtsep ((description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean when_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_SEMICOLON);
    if (!r) r = when_stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' stmtsep ((description_stmt | reference_stmt) stmtsep)* '}'
  private static boolean when_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_LEFT_BRACE);
    r = r && stmtsep(b, l + 1);
    r = r && when_stmt_2_1_2(b, l + 1);
    r = r && consumeToken(b, YANG_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((description_stmt | reference_stmt) stmtsep)*
  private static boolean when_stmt_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!when_stmt_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "when_stmt_2_1_2", c)) break;
    }
    return true;
  }

  // (description_stmt | reference_stmt) stmtsep
  private static boolean when_stmt_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = when_stmt_2_1_2_0_0(b, l + 1);
    r = r && stmtsep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // description_stmt | reference_stmt
  private static boolean when_stmt_2_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt_2_1_2_0_0")) return false;
    boolean r;
    r = description_stmt(b, l + 1);
    if (!r) r = reference_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // module_stmt | submodule_stmt
  static boolean yang(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yang")) return false;
    if (!nextTokenIs(b, "", YANG_MODULE_KEYWORD, YANG_SUBMODULE_KEYWORD)) return false;
    boolean r;
    r = module_stmt(b, l + 1);
    if (!r) r = submodule_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "1" | "1.1"
  public static boolean yang_version_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yang_version_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_YANG_VERSION_ARG, "<yang version arg>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "1.1");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'yang-version' yang_version_arg stmtend
  public static boolean yang_version_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yang_version_stmt")) return false;
    if (!nextTokenIs(b, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_YANG_VERSION_KEYWORD);
    r = r && yang_version_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_YANG_VERSION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean yin_element_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yin_element_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YANG_YIN_ELEMENT_ARG, "<yin element arg>");
    r = string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'yin-element' yin_element_arg stmtend
  public static boolean yin_element_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yin_element_stmt")) return false;
    if (!nextTokenIs(b, YANG_YIN_ELEMENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YANG_YIN_ELEMENT_KEYWORD);
    r = r && yin_element_arg(b, l + 1);
    r = r && stmtend(b, l + 1);
    exit_section_(b, m, YANG_YIN_ELEMENT_STMT, r);
    return r;
  }

}
