package santanderjavabootcamp.exerciciosclasseseencapsulamento.contabancaria;

public class BankAccount {
    private double balance;
    private double overdraft;

    public BankAccount(double balance){
        this.balance = balance;
        if (this.balance <= 0){
            System.out.println("O valor do saldo inicial deve ser maior que 0.");
            return;
        } else if (this.balance <= 500){
            this.overdraft = 50;
            return;
        } else {
            this.overdraft = balance / 2;
            return;
        }



    }
    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("O valor de depósito não pode ser negativo ou zero.");
            return;
        }
        this.balance += amount;
        System.out.println("Saldo atual: "+ this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("O valor de saque não pode ser negativo ou zero.");
            return;
        }
        if (amount > (this.balance + this.overdraft)) {
            overdraft -= 0.20 * (amount - (balance + overdraft));
        }
        this.balance -= amount;
        System.out.println("Saldo atual: "+ this.balance);
    }

    public void payBankBill(double amount) {
        if (amount < 0) {
            System.out.println("O valor do boleto não pode ser negativo ou zero.");
            return;
        }
        if (amount > (this.balance + this.overdraft)){
            overdraft -= 0.20 * (amount - (balance + overdraft));
        }

        this.balance -= amount;
        System.out.println("Saldo atual: "+ this.balance);
    }

    public boolean isUsingOverdraft(){
        return balance < 0;
    }
}
