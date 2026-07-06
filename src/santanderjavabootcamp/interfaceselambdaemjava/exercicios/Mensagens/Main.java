package santanderjavabootcamp.interfaceselambdaemjava.exercicios.Mensagens;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escreva a mensagem que deseja enviar:");
            String message = scanner.nextLine();

            System.out.println("Escolha a forma que deseja enviar a mensagem:");
            System.out.println("1 - E-mail");
            System.out.println("2 - SMS");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair do programa");

            int option = Integer.parseInt(scanner.nextLine());

            MarketingMessage servico = switch (option) {
                case 1 -> new Email();
                case 2 -> new SMS();
                case 3 -> new SocialMedia();
                case 4 -> new WhatsApp();
                case 5 -> {
                    System.out.println("Fechando o programa...");
                    scanner.close();
                    System.exit(0);
                    yield null;
                }
                default -> {
                    System.out.println("Opção inválida");
                    yield null;
                }
            };

            if (servico != null) {
                System.out.println(servico.sendMessage(message));
            }
        }
    }
}