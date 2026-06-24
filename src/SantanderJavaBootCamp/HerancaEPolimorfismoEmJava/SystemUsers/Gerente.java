package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.SystemUsers;

public class Gerente extends Usuario{

    public Gerente(String name, String email, String password){
        super(name, email, password, true);
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Relatório financeiro sendo gerado por: " + getName());
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas...");
    }

}
