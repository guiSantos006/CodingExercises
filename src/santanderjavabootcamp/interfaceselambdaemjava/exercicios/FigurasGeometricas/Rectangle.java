package santanderjavabootcamp.interfaceselambdaemjava.exercicios.FigurasGeometricas;

public record Rectangle(double height, double base) implements GeometricForm {

    public double getArea(){
        return height * base;
    }
}
