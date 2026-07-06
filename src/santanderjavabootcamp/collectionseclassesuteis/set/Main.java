package santanderjavabootcamp.collectionseclassesuteis.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId).reversed());;
        users.add(new User(1, "Guilherme"));
        users.add(new User(2, "Pedro"));
        users.add(new User(3, "Maria"));
        users.add(new User(4, "João"));
        users.forEach(System.out::println);

        System.out.println(users);
    }
}
