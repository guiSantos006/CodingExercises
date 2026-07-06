package santanderjavabootcamp.interfaceselambdaemjava.exercicios.Mensagens;

public record SMS() implements MarketingMessage {

    @Override
    public String sendMessage(String message) {
        return "Enviando por SMS: " + message;
    }
}
