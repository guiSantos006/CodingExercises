package santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao;

import santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao.enumeration.Operation;

import java.util.Scanner;

public class Main {

    static void main() {
        var scanner = new Scanner(System.in);
        var option = -1;

        while (option != 5){
            System.out.println("Qual operação você deseja aplicar?");
            System.out.println("==================================");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Sair");
            System.out.println("==================================");
            System.out.print("-> ");
            option = scanner.nextInt();

            if ( option > 3 || option < 1){
                System.out.println("Selecione uma opção válida");
                continue;
            }

            if ( option == 3 ) break;

            // Selecionando o ENUM da operação
            Operation selectedOperation = Operation.values()[option - 1];

            // Inicializando o StringBuilder para visualização do usuário

            scanner.nextLine(); // limpa o \n

            System.out.println("Digite os números separados por vírgula:");
            String input = scanner.nextLine();

            String[] values = input.split(",");

            int result = Integer.parseInt(values[0].trim());

            StringBuilder expression = new StringBuilder(values[0].trim());

            for (int i = 1; i < values.length; i++) {
                int value = Integer.parseInt(values[i].trim());

                result = selectedOperation.getCalculate().apply(result, value);

                expression.append(" ")
                        .append(selectedOperation.getSymbol())
                        .append(" ")
                        .append(value);
            }

            expression.append(" = ").append(result);

            System.out.println(expression);





        }

    }
}
