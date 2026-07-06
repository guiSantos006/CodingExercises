package santanderjavabootcamp.exerciciosclasseseencapsulamento.contabancaria;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);



    static void main(String[] args) {
        System.out.println("Qual valor de deposito você deseja para a criação da conta?:");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);

        var option = -1;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("==============================");
            option = scanner.nextInt();

            switch (option){
                case 1 -> checkBalance(bankAccount);
                case 2 -> checkOverdraft(bankAccount);
                case 3 -> makeDeposit(bankAccount);
                case 4 -> makeWithdraw(bankAccount);
                case 5 -> payABill(bankAccount);
                case 6 -> checkUsingOverdraft(bankAccount);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);

    }


    private static void checkBalance(BankAccount bankAccount) {
        double balance = bankAccount.getBalance();
        System.out.println("Seu saldo atual é de: R$" + balance);
    }

    private static void checkOverdraft(BankAccount bankAccount) {
        double overdraft = bankAccount.getOverdraft();
        System.out.println("Seu cheque especial é de: R$" + overdraft);
    }

    private static void makeDeposit(BankAccount bankAccount) {
        System.out.println("Insira o valor que deseja depositar:");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    private static void makeWithdraw(BankAccount bankAccount) {
        System.out.println("Insira o valor que deseja sacar:");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }

    private static void payABill(BankAccount bankAccount) {
        System.out.println("Insira o valor do boleto:");
        double amount = scanner.nextDouble();
        bankAccount.payBankBill(amount);
    }

    private static void checkUsingOverdraft(BankAccount bankAccount) {
        if (bankAccount.isUsingOverdraft()){
            System.out.println("A conta está usando o cheque especial.");
        }
        else {
            System.out.println("A conta não está usando o cheque especial.");
        }
    }

}

