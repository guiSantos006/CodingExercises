package santanderjavabootcamp.interfaceselambdaemjava.exercicios.Mensagens;

public record SocialMedia() implements MarketingMessage {
    @Override
    public String sendMessage(String message) {
        return "Enviando para as redes sociais: " + message;
    }
}
