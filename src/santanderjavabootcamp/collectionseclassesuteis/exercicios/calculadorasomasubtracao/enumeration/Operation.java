package santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao.enumeration;

import java.util.stream.LongStream;

public enum Operation {

    SUM(n -> LongStream.of(n).reduce(0, Long::sum), "+"),

    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1 , n2) -> n1 - n2), "-");


    private final Calc operationCallBack;

    private final String symbol;

    Operation(Calc operationCallBack, String symbol) {
        this.operationCallBack = operationCallBack;
        this.symbol = symbol;
    }

    public Calc getOperationCallBack() {
        return operationCallBack;
    }

    public String getSymbol() {
        return symbol;
    }
}

