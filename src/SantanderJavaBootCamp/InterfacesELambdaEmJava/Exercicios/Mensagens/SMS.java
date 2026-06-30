package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.Mensagens;

public record SMS(String message) implements Marketing {
    @Override
    public String sendMessage() {
        return "Olá, tudo bem? Esta mensagem foi enviada por SMS.";
    }
}
