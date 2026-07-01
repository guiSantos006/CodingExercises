package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.TributosProdutos;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.of("pt", "BR"));
        while (true){
            System.out.println("Insira o valor do produto: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Qual é o tipo desse produto?");
            System.out.println("============================");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário ");
            System.out.println("4 - Cultura ");
            System.out.println("5 - Sair do programa");
            System.out.println("============================");
            int option = Integer.parseInt(scanner.nextLine());

            Product product = switch (option) {
                case 1 -> new Food(productPrice);
                case 2 -> new Health(productPrice);
                case 3 -> new Clothes(productPrice);
                case 4 -> new Culture(productPrice);
                case 5 -> {
                    System.out.println("Fechando o programa...");
                    scanner.close();
                    System.exit(0);
                    yield null;
                }
                default -> {
                    System.out.println("Opção inválida.");
                    yield null;
                }
            };

            if (product != null){
                System.out.printf(Locale.of("pt", "BR"),
                        "O valor do imposto do produto é de: R$%,.2f%n", product.calculateTax());
            }
        }
    }
}
