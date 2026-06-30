package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.Mensagens;

public record Email(String message) implements Marketing  {

    @Override
    public String sendMessage() {
        return "Olá, tudo bem? Esta mensagem foi enviado por email.";
    }
}
