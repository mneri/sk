grammar Sk;

@parser::header {
    import me.mneri.lambda.λ;

    import static me.mneri.lambda.Lambdas.*;
    import static me.mneri.lambda.Redex.β;
}

expr returns [λ lambda]
    : e=expr f=func    {$lambda = β($e.lambda, $f.lambda);}
    |                  {$lambda = I;};
func returns [λ lambda]
    : COMBS            {$lambda = S;}
    | COMBK            {$lambda = K;}
    | LPAR e=expr RPAR {$lambda = $e.lambda;};

COMBK    : 'k' | 'K';
COMBS    : 's' | 'S';
LPAR     : '(';
RPAR     : ')';
WHITESP  : ( '\t' | ' ' | '\r' | '\n' )+ { skip(); };