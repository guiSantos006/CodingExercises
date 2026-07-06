package santanderjavabootcamp.exerciciosclasseseencapsulamento.dirigircarro;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private static final Car car = new Car();

    static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Ligar o Carro");
            System.out.println("2 - Desligar o Carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar a esquerda");
            System.out.println("6 - Virar a direita");
            System.out.println("7 - Verificar a velocidade");
            System.out.println("8 - Subir a marcha");
            System.out.println("9 - Reduzir a marcha");
            System.out.println("0 - Sair");
            System.out.println("==============================");
            option = scanner.nextInt();

            switch (option){
                case 1 -> car.startCar();
                case 2 -> car.turnOffCar();
                case 3 -> car.accelerate();
                case 4 -> car.decelerate();
                case 5 -> car.turnLeft();
                case 6 -> car.turnRight();
                case 7 -> checkSpeed();
                case 8 -> car.gearUp();
                case 9 -> car.gearDown();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);

    }


    private static void checkSpeed() {
        int speed = car.getSpeed();
        System.out.println("Sua velocidade é de " + speed + "KM/H.");
    }


}

