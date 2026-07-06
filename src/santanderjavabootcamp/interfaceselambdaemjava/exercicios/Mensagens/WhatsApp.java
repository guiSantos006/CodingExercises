package santanderjavabootcamp.interfaceselambdaemjava.exercicios.Mensagens;

public record WhatsApp() implements MarketingMessage {
    @Override
    public String sendMessage(String message) {
        return "Enviando por WhatsApp: " + message;
    }
}
