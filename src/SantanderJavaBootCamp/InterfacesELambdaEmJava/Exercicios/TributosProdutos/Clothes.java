package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.TributosProdutos;

public record Clothes(double price) implements Product {

    public static final double TAX = 0.025;

    @Override
    public double calculateTax() {
        return price * TAX;
    }
}
