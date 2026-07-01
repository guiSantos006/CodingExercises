package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.TributosProdutos;

public record Health(double price) implements Product {

    public static final double TAX = 0.015;

    @Override
    public double calculateTax() {
        return price * TAX;
    }
}
