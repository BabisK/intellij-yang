package com.intellij.lang.yang.formatter;

import com.intellij.formatting.Wrap;
import com.intellij.lang.ASTNode;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.tree.IElementType;
import static com.intellij.lang.yang.psi.YangTypes.*;
/**
 *
 */
public class YangWrappingProcessor {
    private final ASTNode myNode;
    private final CommonCodeStyleSettings mySettings;

    public YangWrappingProcessor(ASTNode node, CommonCodeStyleSettings settings) {
        myNode = node;
        mySettings = settings;
    }

    public Wrap createChildWrap(ASTNode child, Wrap defaultWrap, Wrap childWrap) {
        final IElementType childType = child.getElementType();
        final IElementType elementType = myNode.getElementType();
        if (childType == YANG_SEMICOLON) return defaultWrap;

//        //
//        // Function definition/call
//        //
//        if (elementType == ARGUMENT_LIST) {
//            if (child instanceof PsiErrorElement) {
//                myNode.putUserData(DART_ARGUMENT_LIST_WRAP_KEY, null);
//            }
//
//            if (mySettings.CALL_PARAMETERS_WRAP != CommonCodeStyleSettings.DO_NOT_WRAP) {
//                if (!mySettings.PREFER_PARAMETERS_WRAP && childWrap != null) {
//                    // Not used; PREFER_PARAMETERS_WRAP cannot be changed in the UI.
//                    return Wrap.createChildWrap(childWrap, WrappingUtil.getWrapType(mySettings.CALL_PARAMETERS_WRAP), true);
//                }
//                Wrap wrap;
//                // First, do persistent object management.
//                if (myNode.getFirstChildNode() == child && childType != NAMED_ARGUMENT) {
//                    ASTNode[] childs = myNode.getChildren(DartIndentProcessor.EXPRESSIONS);
//                    if (childs.length >= 7) { // Approximation; dart_style uses dynamic programming with cost-based analysis to choose.
//                        wrap = Wrap.createWrap(WrapType.ALWAYS, true);
//                    }
//                    else {
//                        wrap = Wrap.createWrap(WrapType.NORMAL, true); // NORMAL,CHOP_DOWN_IF_LONG
//                    }
//                    if (myNode.getLastChildNode() != child) {
//                        myNode.putUserData(DART_ARGUMENT_LIST_WRAP_KEY, wrap);
//                    }
//                }
//                else {
//                    if (childType == NAMED_ARGUMENT) {
//                        ASTNode[] named = myNode.getChildren(NAMED_ARGUMENTS);
//                        wrap = myNode.getUserData(DART_ARGUMENT_LIST_WRAP_KEY);
//                        if (child == named[0]) {
//                            if (named.length > 1) {
//                                ASTNode[] childs = myNode.getChildren(DartIndentProcessor.EXPRESSIONS);
//                                Wrap namedWrap;
//                                if (childs.length >= 7 || named.length > 4) { // Another approximation.
//                                    namedWrap = Wrap.createWrap(WrapType.ALWAYS, true);
//                                }
//                                else {
//                                    namedWrap = Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//                                }
//                                myNode.putUserData(DART_ARGUMENT_LIST_WRAP_KEY, namedWrap);
//                            }
//                        }
//                    }
//                    else {
//                        wrap = myNode.getUserData(DART_ARGUMENT_LIST_WRAP_KEY);
//                    }
//                    if (myNode.getLastChildNode() == child) {
//                        myNode.putUserData(DART_ARGUMENT_LIST_WRAP_KEY, null);
//                    }
//                }
//                // Second, decide what object to return.
//                if (childType == MULTI_LINE_COMMENT || childType == FUNCTION_EXPRESSION) {
//                    return Wrap.createWrap(WrapType.NONE, false);
//                }
//                return wrap != null ? wrap : Wrap.createWrap(WrappingUtil.getWrapType(mySettings.CALL_PARAMETERS_WRAP), false);
//            }
//        }
//
//        if (elementType == FORMAL_PARAMETER_LIST) {
//            if (mySettings.METHOD_PARAMETERS_WRAP != CommonCodeStyleSettings.DO_NOT_WRAP) {
//                if (myNode.getFirstChildNode() == child) {
//                    return createWrap(mySettings.METHOD_PARAMETERS_LPAREN_ON_NEXT_LINE);
//                }
//                if (childType == RPAREN) {
//                    return createWrap(mySettings.METHOD_PARAMETERS_RPAREN_ON_NEXT_LINE);
//                }
//                return Wrap.createWrap(WrappingUtil.getWrapType(mySettings.METHOD_PARAMETERS_WRAP), true);
//            }
//        }
//
//        if (elementType == INITIALIZERS) {
//            if (childType != COLON && isNotFirstInitializer(child)) {
//                return Wrap.createWrap(WrapType.ALWAYS, true);
//            }
//            if (childType == COLON && !DartSpacingProcessor.hasMultipleInitializers(child)) {
//                return Wrap.createWrap(WrapType.NORMAL, true);
//            }
//        }
//
//        // Lists in schematic s-expr notation:
//        // (LIST_LITERAL_EXPRESSION '[ (EXPRESSION_LIST expr ', expr) '])
//        if (elementType == EXPRESSION_LIST) {
//            Wrap wrap;
//            // First, do persistent object management.
//            if (myNode.getFirstChildNode() == child) {
//                wrap = Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//                if (myNode.getLastChildNode() != child) {
//                    myNode.putUserData(DART_EXPRESSION_LIST_WRAP_KEY, wrap);
//                }
//            }
//            else {
//                wrap = myNode.getUserData(DART_EXPRESSION_LIST_WRAP_KEY);
//            }
//            // Second, decide what object to return.
//            if (childType == MULTI_LINE_COMMENT || childType == CONST) {
//                return Wrap.createWrap(WrapType.NONE, false);
//            }
//            return wrap != null ? wrap : Wrap.createWrap(WrapType.NORMAL, true);
//        }
//        else if (elementType == LIST_LITERAL_EXPRESSION && childType == RBRACKET) {
//            ASTNode exprList = FormatterUtil.getPreviousNonWhitespaceSibling(child);
//            Wrap wrap = null;
//            if (exprList != null && exprList.getElementType() == EXPRESSION_LIST) {
//                wrap = exprList.getUserData(DART_EXPRESSION_LIST_WRAP_KEY);
//                exprList.putUserData(DART_EXPRESSION_LIST_WRAP_KEY, null);
//            }
//            return wrap != null ? wrap : Wrap.createWrap(WrapType.NORMAL, true);
//        }
//
//        // Maps in schematic s-expr notation:
//        // (MAP_LITERAL_EXPRESSION '{ (MAP_LITERAL_ENTRY expr ': expr) ', (MAP_LITERAL_ENTRY expr ': expr) '})
//        if (elementType == MAP_LITERAL_EXPRESSION) {
//            // First, do persistent object management.
//            Wrap wrap = sharedWrap(child, DART_EXPRESSION_LIST_WRAP_KEY);
//            // Second, decide what object to return.
//            if (childType == LBRACE || childType == LBRACKET) {
//                return Wrap.createWrap(WrapType.NONE, false);
//            }
//            if (childType == MULTI_LINE_COMMENT || childType == CONST) {
//                return Wrap.createWrap(WrapType.NONE, false);
//            }
//            return wrap != null ? wrap : Wrap.createWrap(WrapType.NORMAL, true);
//        }
//
//        //
//        // Wrap after arrows.
//        //
//        if (elementType == FUNCTION_BODY) {
//            if (FormatterUtil.isPrecededBy(child, EXPRESSION_BODY_DEF)) {
//                return createWrap(true);
//            }
//        }
//        if (childType == CALL_EXPRESSION) {
//            if (FormatterUtil.isPrecededBy(child, EXPRESSION_BODY_DEF)) {
//                return createWrap(true);
//            }
//            if (mySettings.CALL_PARAMETERS_WRAP != CommonCodeStyleSettings.DO_NOT_WRAP) {
//                if (childType == RPAREN) {
//                    return createWrap(mySettings.CALL_PARAMETERS_RPAREN_ON_NEXT_LINE);
//                }
//            }
//        }
//
//        //
//        // If
//        //
//        if (elementType == IF_STATEMENT) {
//            if (childType == ELSE) {
//                return createWrap(mySettings.ELSE_ON_NEW_LINE);
//            }
//            else if (!BLOCKS.contains(childType) && child == child.getTreeParent().getLastChildNode()) {
//                return createWrap(true);
//            }
//        }
//
//        //
//        //Binary expressions
//        //
//        if (BINARY_EXPRESSIONS.contains(elementType) && mySettings.BINARY_OPERATION_WRAP != CommonCodeStyleSettings.DO_NOT_WRAP) {
//            if ((mySettings.BINARY_OPERATION_SIGN_ON_NEXT_LINE && BINARY_OPERATORS.contains(childType)) ||
//                    (!mySettings.BINARY_OPERATION_SIGN_ON_NEXT_LINE && isRightOperand(child))) {
//                return Wrap.createWrap(WrappingUtil.getWrapType(mySettings.BINARY_OPERATION_WRAP), true);
//            }
//        }
//
//        //
//        // Assignment
//        //
//        if (elementType == ASSIGN_EXPRESSION && mySettings.ASSIGNMENT_WRAP != CommonCodeStyleSettings.DO_NOT_WRAP) {
//            if (childType != ASSIGNMENT_OPERATOR) {
//                if (FormatterUtil.isPrecededBy(child, ASSIGNMENT_OPERATOR) &&
//                        mySettings.PLACE_ASSIGNMENT_SIGN_ON_NEXT_LINE) {
//                    return Wrap.createWrap(WrapType.NONE, true);
//                }
//                return Wrap.createWrap(WrappingUtil.getWrapType(mySettings.ASSIGNMENT_WRAP), true);
//            }
//            else if (mySettings.PLACE_ASSIGNMENT_SIGN_ON_NEXT_LINE) {
//                return Wrap.createWrap(WrapType.NORMAL, true);
//            }
//        }
//
//        //
//        // Ternary expressions
//        //
//        if (elementType == TERNARY_EXPRESSION) {
//            if (myNode.getFirstChildNode() != child) {
//                if (mySettings.TERNARY_OPERATION_SIGNS_ON_NEXT_LINE) {
//                    if (childType == QUEST) {
//                        final Wrap wrap = Wrap.createWrap(WrappingUtil.getWrapType(mySettings.TERNARY_OPERATION_WRAP), true);
//                        myNode.putUserData(DART_TERNARY_EXPRESSION_WRAP_KEY, wrap);
//                        return wrap;
//                    }
//
//                    if (childType == COLON) {
//                        final Wrap wrap = myNode.getUserData(DART_TERNARY_EXPRESSION_WRAP_KEY);
//                        myNode.putUserData(DART_TERNARY_EXPRESSION_WRAP_KEY, null);
//                        return wrap != null ? wrap : Wrap.createWrap(WrappingUtil.getWrapType(mySettings.TERNARY_OPERATION_WRAP), true);
//                    }
//                }
//                else if (childType != QUEST && childType != COLON) {
//                    return Wrap.createWrap(WrappingUtil.getWrapType(mySettings.TERNARY_OPERATION_WRAP), true);
//                }
//            }
//            return Wrap.createWrap(WrapType.NONE, true);
//        }
//
//        if (childType == HIDE_COMBINATOR || childType == SHOW_COMBINATOR) {
//            return createWrap(true);
//        }
//
//        if (childType == VAR_DECLARATION_LIST && elementType != FOR_LOOP_PARTS) {
//            if (varDeclListContainsVarInit(child)) {
//                return Wrap.createWrap(WrapType.ALWAYS, true);
//            }
//            else {
//                return Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//            }
//        }
//        if (childType == VAR_DECLARATION_LIST_PART) {
//            ASTNode parent = getParent();
//            if (parent != null && parent.getElementType() == FOR_LOOP_PARTS) {
//                return Wrap.createWrap(WrapType.NORMAL, true);
//            }
//            else {
//                if (varDeclListContainsVarInit(myNode)) {
//                    return Wrap.createWrap(WrapType.ALWAYS, true);
//                }
//                else {
//                    return Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//                }
//            }
//        }
//
//        if (elementType == CLASS_DEFINITION) {
//            if (childType == SUPERCLASS || childType == INTERFACES || childType == MIXINS) {
//                return Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//            }
//        }
//        if (elementType == MIXIN_APPLICATION && childType == MIXINS) {
//            return Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//        }
//        if (elementType == ENUM_DEFINITION) {
//            if (childType == ENUM_CONSTANT_DECLARATION) {
//                return Wrap.createWrap(WrapType.CHOP_DOWN_IF_LONG, true);
//            }
//        }
//        if (elementType == TYPE_LIST) {
//            if (childType == TYPE) {
//                Wrap wrap = sharedWrap(child, DART_TYPE_LIST_WRAP_KEY);
//                if (childType == MULTI_LINE_COMMENT) {
//                    return Wrap.createWrap(WrapType.NONE, false);
//                }
//                return wrap == null ? Wrap.createWrap(WrapType.NORMAL, true) : wrap;
//            }
//        }
//
//        if (elementType == REFERENCE_EXPRESSION && (childType == DOT || childType == QUEST_DOT)) {
//            return Wrap.createWrap(WrapType.NORMAL, true); // NORMAL,CHOP_DOWN_IF_LONG
//        }

        return defaultWrap;
    }
}
