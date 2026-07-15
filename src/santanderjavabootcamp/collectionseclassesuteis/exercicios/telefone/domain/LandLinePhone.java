package santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone.domain;

public record LandLinePhone(String number) implements GenericPhone {

    public LandLinePhone {
        if (number == null || !(number.length() == 8 || number.length() == 10)) {
            throw new IllegalArgumentException("Quantidade de dígitos inválida para telefone fixo");
        }
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String format() {
        return number.length() == 8 ?
                number.substring(0,4) + "-" + number.substring(4) :
                "(" + number.substring(0,2) + ")" + number.substring(2,6) + "-" + number.substring(6);
    }


    @Override
    public String getType() {
        return "Telefone Fixo";
    }
}
