package santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao.enumeration;

import java.util.function.BiFunction;

public enum Operation {

    SUM((Integer v1, Integer v2) -> v1 + v2, "+"),

    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-");

    private final String symbol;

    private final BiFunction<Integer, Integer, Integer> calculate;

    Operation(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.symbol = symbol;
        this.calculate = calculate;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}

