package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.CinemaIngresso;

public enum AudioTipo {
    DUBLADO("Dublado"),
    LEGENDADO("Legendado");

    private final String description;

    AudioTipo(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}