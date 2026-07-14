package santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao;

import santanderjavabootcamp.collectionseclassesuteis.exercicios.calculadorasomasubtracao.enumeration.Operation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Qual operação você deseja aplicar? (1 - Soma ,2 - Subtração)");
        System.out.print("-> ");
        var operationOption = scanner.nextInt();
        while (operationOption > 2 || operationOption < 1){
            System.out.println("Escolha uma opção válida (1 - Soma ,2 - Subtração)");
            operationOption = scanner.nextInt();
        }
        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Informe os números que serão usados na conta separados por vírgula");
        var numbers = scanner.next();
        var numArray = Arrays.stream(numbers.split(","))
                .mapToLong(Long::parseLong)
                .toArray();
        var result = selectedOperation.getOperationCallBack().exec(numArray);
        var operationToShow = numbers.replaceAll(",", " " + selectedOperation.getSymbol() + " ");
        System.out.printf("O resultado da operação %s é %s \n",operationToShow,result);







        }

    }

