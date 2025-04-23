public class Operadores {
    public float soma (float v1, float v2) {
        return v1 + v2;
    }

    public float menos (float v1, float v2) {
        return v1 - v2;
    }
    
    public float mult (float v1, float v2) {
        return v1 * v2;
    }
    
    public float divisao (float v1, float v2) {
        if (v2 == 0) throw new ArithmeticException("DIVISION ERROR: CANNOT DIVIDE BY 0 (ZERO)");

        return v1 / v2;
    }

    public float atribuicaoSoma(float v1, float v2) {
        return v1 += v2;
    }

    public float atribuicaoSub(float v1, float v2) {
        return v1 -= v2;
    }

    public float atribuicaoMult(float v1, float v2) {
        return v1 *= v2;
    }

    public float atribuicaoDivisao(float v1, float v2) {
        if (v2 == 0) throw new ArithmeticException("DIVISION ERROR: CANNOT DIVIDE BY 0 (ZERO)");
        return v1 /= v2;
    }
    
    public float atribuicaoRestoDivisao(float v1, float v2) {
        return v1 %= v2;
    }
    
    public Boolean logicoAnd(Boolean v1, Boolean v2) {
        return v1 && v2;
    }
    
    public Boolean logicoBooleanAnd(Boolean v1, Boolean v2) {
        return v1 & v2;
    }
    
    public Boolean logicoOr(Boolean v1, Boolean v2) {
        return v1 || v2;
    }
    
    public Boolean logicoBooleanOr(Boolean v1, Boolean v2) {
        return v1 | v2;
    }
    
    public Boolean logicoExclusiveBooleanOr(Boolean v1, Boolean v2) {
        return v1 ^ v2;
    }
    
    public Boolean logicoNot(Boolean v1, Boolean v2) {
        return !v1;
    }

    public Boolean comparacaoIgual(float v1, float v2) {
        return v1 == v2;
    }

    public Boolean comparacaoDiferente (float v1, float v2) {
        return v1 != v2;
    }

    public Boolean comparacaoMenor(float v1, float v2) {
        return v1 < v2;
    }

    public Boolean comparacaoMaior(float v1, float v2) {
        return v1 > v2;
    }

    public Boolean comparacaoMenorIgual(float v1, float v2) {
        return v1 <= v2;
    }
    
    public Boolean comparacaoMaiorIgual(float v1, float v2) {
        return v1 >= v2;
    }
}
