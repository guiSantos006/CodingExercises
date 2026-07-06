package santanderjavabootcamp.interfaceselambdaemjava.exercicios.FigurasGeometricas;

import java.util.Scanner;

public class Main{

    public final static Scanner scanner = new Scanner(System.in);

    static void main() {
        int option;
        GeometricForm geometricForm = null;
        while(true){
            System.out.println("Escolha a forma geométrica que deseja calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();
            if (option == 1){
                geometricForm = calculateSquareArea();
            } else if (option == 2){
                geometricForm = calculateRectangleArea();
            } else if (option == 3) {
                geometricForm = calculateCircleArea();
            } else if (option == 4){
                System.out.println("Fechando o programa...");
                System.exit(0);
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("O resultado do calculo da área foi de: " + geometricForm.getArea());
        }
    }

    private static GeometricForm calculateSquareArea() {
        System.out.println("Insira o valor do lado do quadrado:");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm calculateRectangleArea() {
        System.out.println("Insira o valor da altura do retângulo:");
        double height = scanner.nextDouble();
        System.out.println("Insira o valor da base do retângulo:");
        double base = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm calculateCircleArea() {
        System.out.println("Insira o valor do raio do círculo:");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
