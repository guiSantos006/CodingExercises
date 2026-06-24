package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.CinemaIngresso;

public non-sealed class IngressoFamilia extends Ingresso {

    private int numPeople;

    public IngressoFamilia(String movieName, double value, AudioTipo audioType, int numPeople) {
        super(movieName, value, audioType);
        this.numPeople = numPeople;
    }

    @Override
    public double getValorReal() {
        double total = getValue() * numPeople;
        if (numPeople > 3){
            total *= 0.95;
        }
        return total;
    }

    public int getNumPeople(){ return numPeople; }
}
