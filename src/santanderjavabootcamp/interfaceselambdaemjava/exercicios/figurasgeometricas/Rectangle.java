package santanderjavabootcamp.interfaceselambdaemjava.exercicios.figurasgeometricas;

public record Rectangle(double height, double base) implements GeometricForm {

    public double getArea(){
        return height * base;
    }
}
