package santanderjavabootcamp.interfaceselambdaemjava.exercicios.Mensagens;

public record Email() implements MarketingMessage {

    @Override
    public String sendMessage(String message) {
        return "Enviando por e-mail: " + message;
    }
}
