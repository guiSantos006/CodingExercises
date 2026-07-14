package santanderjavabootcamp.collectionseclassesuteis.aulas.classeoptional;

import santanderjavabootcamp.collectionseclassesuteis.aulas.classeoptional.domain.User;
import java.util.Optional;

import static santanderjavabootcamp.collectionseclassesuteis.aulas.classeoptional.domain.SexEnum.FEMALE;
import static santanderjavabootcamp.collectionseclassesuteis.aulas.classeoptional.domain.SexEnum.MALE;

public class Main {
    static void main() {
        Optional<User> optional = Optional.ofNullable(new User("João" , 19 , MALE));
        System.out.println(optional.orElse(defaultUser()));

        System.out.println(optional.orElseGet(Main::defaultUser));


    }

    private static User defaultUser() {
        System.out.println("Buscando valor default");
        return new User("Maria", 24, FEMALE);
    }
}
