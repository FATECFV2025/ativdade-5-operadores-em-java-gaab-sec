public class Calculadora {
    public static void main(String [] args) {
        Operadores op = new Operadores();

        System.out.println("O Resultado é: " + op.soma(10, 5));

        System.out.println("O Resultado é: " + op.menos(10, 5));

        System.out.println("O Resultado é: " + op.mult(10, 5));

        System.out.println("O Resultado é: " + op.divisao(10, 5));
        // System.out.println("O Resultado é: " + op.divisao(10, 0)); --> lança ArithmeticException

        // atribuições
        System.out.println();
        System.out.println("O Resultado é: " + op.atribuicaoSoma(10, 2));
        System.out.println("O Resultado é: " + op.atribuicaoSub(10, 2));
        System.out.println("O Resultado é: " + op.atribuicaoMult(10, 2));
        System.out.println("O Resultado é: " + op.atribuicaoDivisao(10, 2));
        System.out.println("O Resultado é: " + op.atribuicaoRestoDivisao(10, 2));

        // logico
        System.out.println();
        System.out.println("O Resultado é: " + op.logicoAnd(true, false));
        System.out.println("O Resultado é: " + op.logicoBooleanAnd(true, false));
        System.out.println("O Resultado é: " + op.logicoOr(true, false));
        System.out.println("O Resultado é: " + op.logicoBooleanOr(true, false));
        System.out.println("O Resultado é: " + op.logicoExclusiveBooleanOr(true, false));
        System.out.println("O Resultado é: " + op.logicoNot(true, false));

        // comparacao
        System.out.println();
        System.out.println("O Resultado é: " + op.comparacaoIgual(10, 2));
        System.out.println("O Resultado é: " + op.comparacaoDiferente(10, 2));
        System.out.println("O Resultado é: " + op.comparacaoMenor(10, 2));
        System.out.println("O Resultado é: " + op.comparacaoMaior(10, 2));
        System.out.println("O Resultado é: " + op.comparacaoMenorIgual(10, 2));
        System.out.println("O Resultado é: " + op.comparacaoMaiorIgual(10, 2));
    }
}
