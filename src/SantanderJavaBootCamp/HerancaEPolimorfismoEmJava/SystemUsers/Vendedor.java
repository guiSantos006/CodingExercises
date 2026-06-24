package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.SystemUsers;

public class Vendedor extends Usuario {
    private int soldAmount;

    public Vendedor(String nome, String email, String password) {
        super(nome, email, password, false); // isAdministrador sempre false
        this.soldAmount = 0;
    }

    public void realizarVenda() {
        soldAmount++;
        System.out.println("Venda realizada! Total de vendas: " + soldAmount);
    }

    public void consultarVendas() {
        System.out.println(getName() + " realizou " + soldAmount + " venda(s).");
    }

    // Getter (setter não faz sentido — só incrementa via realizarVenda)
    public int getQuantidadeVendas() { return soldAmount; }
}
