/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.analysis;

import org.sableccsupport.scclexer.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAGrammar(AGrammar node);
    void caseAHelpers(AHelpers node);
    void caseAHelperDef(AHelperDef node);
    void caseAStates(AStates node);
    void caseATokens(ATokens node);
    void caseATokenDef(ATokenDef node);
    void caseAStateList(AStateList node);
    void caseAStateListTail(AStateListTail node);
    void caseATransition(ATransition node);
    void caseAIgnTokens(AIgnTokens node);
    void caseARegExp(ARegExp node);
    void caseAConcat(AConcat node);
    void caseAUnExp(AUnExp node);
    void caseACharBasic(ACharBasic node);
    void caseASetBasic(ASetBasic node);
    void caseAStringBasic(AStringBasic node);
    void caseAIdBasic(AIdBasic node);
    void caseARegExpBasic(ARegExpBasic node);
    void caseACharChar(ACharChar node);
    void caseADecChar(ADecChar node);
    void caseAHexChar(AHexChar node);
    void caseAOperationSet(AOperationSet node);
    void caseAIntervalSet(AIntervalSet node);
    void caseAStarUnOp(AStarUnOp node);
    void caseAQMarkUnOp(AQMarkUnOp node);
    void caseAPlusUnOp(APlusUnOp node);
    void caseAPlusBinOp(APlusBinOp node);
    void caseAMinusBinOp(AMinusBinOp node);
    void caseAProductions(AProductions node);
    void caseAProd(AProd node);
    void caseAAlt(AAlt node);
    void caseAAltTransform(AAltTransform node);
    void caseANewTerm(ANewTerm node);
    void caseAListTerm(AListTerm node);
    void caseASimpleTerm(ASimpleTerm node);
    void caseANullTerm(ANullTerm node);
    void caseANewListTerm(ANewListTerm node);
    void caseASimpleListTerm(ASimpleListTerm node);
    void caseAProdName(AProdName node);
    void caseAElem(AElem node);
    void caseATokenSpecifier(ATokenSpecifier node);
    void caseAProductionSpecifier(AProductionSpecifier node);
    void caseAAst(AAst node);
    void caseAAstProd(AAstProd node);
    void caseAAstAlt(AAstAlt node);

    void caseTPkgId(TPkgId node);
    void caseTPackage(TPackage node);
    void caseTStates(TStates node);
    void caseTHelpers(THelpers node);
    void caseTTokens(TTokens node);
    void caseTIgnored(TIgnored node);
    void caseTProductions(TProductions node);
    void caseTAbstract(TAbstract node);
    void caseTSyntax(TSyntax node);
    void caseTTree(TTree node);
    void caseTNew(TNew node);
    void caseTNull(TNull node);
    void caseTTokenSpecifier(TTokenSpecifier node);
    void caseTProductionSpecifier(TProductionSpecifier node);
    void caseTDot(TDot node);
    void caseTDDot(TDDot node);
    void caseTSemicolon(TSemicolon node);
    void caseTEqual(TEqual node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTQMark(TQMark node);
    void caseTStar(TStar node);
    void caseTBar(TBar node);
    void caseTComma(TComma node);
    void caseTSlash(TSlash node);
    void caseTArrow(TArrow node);
    void caseTColon(TColon node);
    void caseTId(TId node);
    void caseTChar(TChar node);
    void caseTDecChar(TDecChar node);
    void caseTHexChar(THexChar node);
    void caseTString(TString node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
