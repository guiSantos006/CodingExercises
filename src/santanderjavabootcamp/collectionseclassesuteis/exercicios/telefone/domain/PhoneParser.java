package santanderjavabootcamp.collectionseclassesuteis.exercicios.telefone.domain;

import java.util.Optional;

public class PhoneParser {

    public static Optional<GenericPhone> parse(String raw){
        if (raw == null) return Optional.empty();

        String digits = raw.replaceAll("\\D", "");

        try {
            return switch (digits.length()) {
                case 8, 10 -> Optional.of(new LandLinePhone(digits));
                case 9, 11 -> Optional.of(new MobilePhone(digits));
                default -> Optional.empty();
            };
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
