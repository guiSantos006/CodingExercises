package santanderjavabootcamp.collectionseclassesuteis.aulas.map;

import santanderjavabootcamp.collectionseclassesuteis.aulas.map.domain.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<String, User> users = new HashMap<>();
        users.put("joão@joão.com", new User("João",22));
        users.put("maria@maria.com", new User("Maria", 19));
        users.put("juca@juca.com", new User("Juca", 18));
        users.put("leo@leo.com", new User("Leonardo", 29));
        /*
        System.out.println(users);
        System.out.println("===============");
        users.keySet().forEach(System.out::println);
        System.out.println("===============");
        users.values().forEach(System.out::println);
        System.out.println("===============");
        System.out.println(users.containsValue(new User("João",22)));
        System.out.println(users.containsKey("joão@joão.com"));
        users.remove("maria@maria.com");
        System.out.println("===============");
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));
        users.replace("leo@leo.com", new User("Leonardo", 66));
        System.out.println("===============");
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));
        System.out.println("===============");
        System.out.println(users.size());
        */
        users.putIfAbsent("", new User("None", 100));
        System.out.println("===============");
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));



    }
}
