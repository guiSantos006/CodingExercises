package santanderjavabootcamp.herancaepolimorfismoemjava.systemusers;

public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String password) {
        super(nome, email, password, false); // isAdministrador sempre false
        this.valorEmCaixa = 0.0;
    }

    public void receberPagamento(double value) {
        valorEmCaixa += value;
        System.out.printf("Pagamento de R$ %.2f recebido. Caixa atual: R$ %.2f%n", value, valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.printf("Caixa fechado. Valor total: R$ %.2f%n", valorEmCaixa);
        valorEmCaixa = 0.0;
    }

    // Getter (setter não faz sentido — só incrementa via receberPagamento)
    public double getValorEmCaixa() { return valorEmCaixa; }
}