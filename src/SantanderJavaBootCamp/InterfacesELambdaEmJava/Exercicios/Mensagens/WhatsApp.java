package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.Mensagens;

public record WhatsApp(String message) implements Marketing  {
    @Override
    public String sendMessage() {
        return "Olá, tudo bem? Esta mensagem foi enviada pelo WhatsApp.";
    }
}
