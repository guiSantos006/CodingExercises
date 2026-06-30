package SantanderJavaBootCamp.InterfacesELambdaEmJava.Exercicios.Mensagens;

public record SocialMedia(String message) implements Marketing  {
    @Override
    public String sendMessage() {
        return "Olá, tudo bem? Esta mensagem foi enviada por uma rede social.";
    }
}
