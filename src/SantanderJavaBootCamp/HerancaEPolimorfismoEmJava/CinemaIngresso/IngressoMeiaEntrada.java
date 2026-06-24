package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.CinemaIngresso;

public non-sealed class IngressoMeiaEntrada extends Ingresso  {

    public IngressoMeiaEntrada(String movieName, double value, AudioTipo audioType) {
        super(movieName, value, audioType);
    }

    @Override
    public double getValorReal() {
        return getValue() / 2;
    }
}
