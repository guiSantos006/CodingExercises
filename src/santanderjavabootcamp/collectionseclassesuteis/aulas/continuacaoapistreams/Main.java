package santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams;

import santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams.domain.Contact;
import santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams.domain.Sex;
import santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams.domain.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams.domain.ContactType.EMAIL;
import static santanderjavabootcamp.collectionseclassesuteis.aulas.continuacaoapistreams.domain.ContactType.PHONE;

public class Main {
    static void main() {
        List<User> users =  new ArrayList<>(generateUsers());

        var values = users.stream()
                .flatMap(u -> u.contacts().stream())
                .sorted(Comparator.comparing(Contact::description))
                .map(c -> String.format("{\n    'description': '%s',\n    'type': '%s'\n}", c.description(), c.contactType()))
                        .toList();


        values.forEach(System.out::println);

    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
                new Contact("(21)93439-9335", PHONE),
                new Contact("joao@joao.com", EMAIL)
        );

        var contacts2 = List.of(
                new Contact("laura@laura.com", EMAIL)
        );

        var contacts3 = List.of(
                new Contact("(11)93344-9847", PHONE)
        );

        var contacts4 = List.of(
                new Contact("(31)97654-8756", PHONE),
                new Contact("(31)92324-2391", PHONE)
        );

        var contacts5 = List.of(
                new Contact("sarah@gmail.com", EMAIL),
                new Contact("sarah@sarah.com", EMAIL)
        );

        var user1 = new User("João" , 19, Sex.MALE, new ArrayList<>(contacts1));
        var user2 = new User("Laura" , 25, Sex.FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Maria" , 29, Sex.FEMALE, new ArrayList<>(contacts3));
        var user4 = new User("Celso" , 40, Sex.MALE, new ArrayList<>(contacts4));
        var user5 = new User("Sarah" , 22, Sex.FEMALE, new ArrayList<>(contacts5));
        var user6 = new User("Bruna" , 36, Sex.FEMALE, new ArrayList<>());



        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
