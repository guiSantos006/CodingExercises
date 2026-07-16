package santanderjavabootcamp.interfaceselambdaemjava.exercicios.mensagens;

public record SocialMedia() implements MarketingMessage {
    @Override
    public String sendMessage(String message) {
        return "Enviando para as redes sociais: " + message;
    }
}
