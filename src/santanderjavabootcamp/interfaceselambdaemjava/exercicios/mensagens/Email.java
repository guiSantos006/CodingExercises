package santanderjavabootcamp.interfaceselambdaemjava.exercicios.mensagens;

public record Email() implements MarketingMessage {

    @Override
    public String sendMessage(String message) {
        return "Enviando por e-mail: " + message;
    }
}
