package santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone;

import santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone.domain.GenericPhone;
import santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone.domain.PhoneParser;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número a ser formatado:");
        var numInput = scanner.next();
        Optional<GenericPhone> result = PhoneParser.parse(numInput);
        if (result.isPresent()) {
            GenericPhone phone = result.get();
            System.out.println(numInput + " -> " + phone.format() + " (" + phone.getType() + ")");
        } else {
            System.out.println(numInput + " -> Entrada inválida");
        }

    }
}
