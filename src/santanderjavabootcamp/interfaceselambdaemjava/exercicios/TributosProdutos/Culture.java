package santanderjavabootcamp.interfaceselambdaemjava.exercicios.TributosProdutos;

public record Culture(double price) implements Product {

    public static final double TAX = 0.04;

    @Override
    public double calculateTax() {
        return price * TAX;
    }
}
