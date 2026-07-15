package santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone.domain;

public record MobilePhone(String number) implements GenericPhone {

    public MobilePhone {
        if (number == null || !(number.length() == 9 || number.length() == 11)) {
            throw new IllegalArgumentException("Quantidade de dígitos inválida para telefone celular");
        }
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String format() {
        return number.length() == 9 ?
                number.substring(0,5) + "-" + number.substring(5) :
                "(" + number.substring(0,2) + ")" + number.substring(2,7) + "-" + number.substring(7);
    }

    @Override
    public String getType() {
        return "Celular";
    }
}
