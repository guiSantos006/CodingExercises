package santanderjavabootcamp.interfaceselambdaemjava.exercicios.TributosProdutos;

public record Food(double price) implements Product {

    public static final double TAX = 0.01;

    @Override
    public double calculateTax() {
        return price * TAX;
    }
}
