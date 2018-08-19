package me.mneri.sk;

import me.mneri.lambda.λ;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import static me.mneri.lambda.Redex.β;

public class SK {
    public enum Result {
        //@formatter:off
        FALSE     ("false"),
        TRUE      ("true"),
        UNDEFINED ("undefined");
        //@formatter:on

        private String string;

        Result(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    public static Result eval(λ expression) {
        λ F = (λ x) -> x;
        λ T = (λ x) -> x;

        λ r = β(expression, T, F).compute();

        //@formatter:off
        if      (r == T) return Result.TRUE;
        else if (r == F) return Result.FALSE;
        else             return Result.UNDEFINED;
        //@formatter:on
    }

    public static void print(Result result) {
        System.out.println(result);
    }

    public static λ read(String string) {
        //@formatter:off
        CharStream charStream = new ANTLRInputStream(string);
        SkLexer lexer         = new SkLexer(charStream);
        TokenStream tokens    = new CommonTokenStream(lexer);
        SkParser parser       = new SkParser(tokens);
        //@formatter:on

        return parser.expr().lambda;
    }
}
