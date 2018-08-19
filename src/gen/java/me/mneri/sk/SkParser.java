// Generated from src/main/antlr/Sk.g by ANTLR 4.7.1
package me.mneri.sk;

    import me.mneri.lambda.λ;

    import static me.mneri.lambda.Lambdas.*;
    import static me.mneri.lambda.Redex.β;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMBK=1, COMBS=2, LPAR=3, RPAR=4, WHITESP=5;
	public static final int
		RULE_expr = 0, RULE_func = 1;
	public static final String[] ruleNames = {
		"expr", "func"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMBK", "COMBS", "LPAR", "RPAR", "WHITESP"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sk.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public λ lambda;
		public ExprContext e;
		public FuncContext f;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((ExprContext)_localctx).lambda =  I;
			}
			_ctx.stop = _input.LT(-1);
			setState(13);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e = _prevctx;
					_localctx.e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(7);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(8);
					((ExprContext)_localctx).f = func();
					((ExprContext)_localctx).lambda =  β(((ExprContext)_localctx).e.lambda, ((ExprContext)_localctx).f.lambda);
					}
					} 
				}
				setState(15);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public λ lambda;
		public ExprContext e;
		public TerminalNode COMBS() { return getToken(SkParser.COMBS, 0); }
		public TerminalNode COMBK() { return getToken(SkParser.COMBK, 0); }
		public TerminalNode LPAR() { return getToken(SkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SkParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMBS:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(COMBS);
				((FuncContext)_localctx).lambda =  S;
				}
				break;
			case COMBK:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(COMBK);
				((FuncContext)_localctx).lambda =  K;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(LPAR);
				setState(21);
				((FuncContext)_localctx).e = expr(0);
				setState(22);
				match(RPAR);
				((FuncContext)_localctx).lambda =  ((FuncContext)_localctx).e.lambda;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\36\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\2\3\2\4\2\4\2\2\2\36\2\6\3\2"+
		"\2\2\4\33\3\2\2\2\6\7\b\2\1\2\7\b\b\2\1\2\b\17\3\2\2\2\t\n\f\4\2\2\n\13"+
		"\5\4\3\2\13\f\b\2\1\2\f\16\3\2\2\2\r\t\3\2\2\2\16\21\3\2\2\2\17\r\3\2"+
		"\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\23\7\4\2\2\23\34\b\3"+
		"\1\2\24\25\7\3\2\2\25\34\b\3\1\2\26\27\7\5\2\2\27\30\5\2\2\2\30\31\7\6"+
		"\2\2\31\32\b\3\1\2\32\34\3\2\2\2\33\22\3\2\2\2\33\24\3\2\2\2\33\26\3\2"+
		"\2\2\34\5\3\2\2\2\4\17\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}