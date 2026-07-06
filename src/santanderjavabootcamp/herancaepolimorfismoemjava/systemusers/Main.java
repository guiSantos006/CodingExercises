package santanderjavabootcamp.herancaepolimorfismoemjava.systemusers;

public class Main {
    static void main() {
        Gerente gerente = new Gerente("Ana", "ana@email.com", "1234");
        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        System.out.println("É admin? " + gerente.isAdmin()); // true
        gerente.realizarLogoff();

        System.out.println("---");

        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", "abcd");
        vendedor.realizarLogin();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        System.out.println("É admin? " + vendedor.isAdmin()); // false
        vendedor.realizarLogoff();

        System.out.println("---");

        Atendente atendente = new Atendente("Julia", "julia@email.com", "xyz");
        atendente.realizarLogin();
        atendente.receberPagamento(50.00);
        atendente.receberPagamento(120.00);
        atendente.fecharCaixa();
        System.out.println("É admin? " + atendente.isAdmin()); // false
        atendente.realizarLogoff();
    }
}
