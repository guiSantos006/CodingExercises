package santanderjavabootcamp.debuggingeotratamentodeexcecoes.debuggingeotratamentodeexcecoesemjava.br.com.dio.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
