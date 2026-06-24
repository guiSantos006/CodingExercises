package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.CinemaIngresso;

public sealed abstract class Ingresso permits IngressoMeiaEntrada, IngressoFamilia {

    private String movieName;
    private double value;
    private AudioTipo audioType;

    public Ingresso(String movieName, double value, AudioTipo audioType){
        this.movieName = movieName;
        this.value = value;
        this.audioType = audioType;
    }

    public abstract double getValorReal();

    public String getMovieName() { return movieName; }
    public double getValue() { return value; }
    public AudioTipo getAudioType() { return audioType; }

    public String toString(){
        return String.format("Filme: %s | Áudio: %s | Valor real: R$ %.2f",
                movieName, audioType.getDescription(), getValorReal());
    }

}
