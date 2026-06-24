package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.SystemUsers;

public class Usuario {

    private String name;
    private String email;
    private String password;
    private boolean isAdmin;

    public Usuario(String name, String email, String password, boolean isAdmin){
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void realizarLogin() {
        System.out.println(name + " realizou login.");
    }

    public void realizarLogoff() {
        System.out.println(name + " realizou logoff.");
    }

    public void alterarDados(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
        System.out.println("Dados alterados com sucesso.");
    }

    public void alterarSenha(String newPassword) {
        this.password = newPassword;
        System.out.println("Senha alterada com sucesso.");
    }

    // Getters
    public boolean isAdmin() {
        return isAdmin;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
