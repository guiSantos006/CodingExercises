package santanderjavabootcamp.collectionseclassesuteis.tiposprimitivosewrappers;

import santanderjavabootcamp.collectionseclassesuteis.tiposprimitivosewrappers.domain.User;

public class Main {
    static void main() {
        var user = new User("João", 20);
        System.out.println(user);
        printValue(user);
        System.out.println(user);

    }

    private static void printValue(final User user){
        user.setName("Maria");
        user.setAge(33);
        System.out.println(user);
    }
}
