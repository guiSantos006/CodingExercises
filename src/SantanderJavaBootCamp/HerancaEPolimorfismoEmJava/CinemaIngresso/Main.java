package SantanderJavaBootCamp.HerancaEPolimorfismoEmJava.CinemaIngresso;

public class Main {
    public static void main(String[] args) {
        Ingresso meia = new IngressoMeiaEntrada("Duna", 30.00, AudioTipo.LEGENDADO);
        Ingresso familia = new IngressoFamilia("Duna", 30.00, AudioTipo.DUBLADO, 5);

        System.out.println(meia);
        System.out.println(familia);
    }
}
