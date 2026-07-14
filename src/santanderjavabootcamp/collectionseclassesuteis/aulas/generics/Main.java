package santanderjavabootcamp.collectionseclassesuteis.aulas.generics;

import santanderjavabootcamp.collectionseclassesuteis.aulas.generics.dao.GenericDAO;
import santanderjavabootcamp.collectionseclassesuteis.aulas.generics.dao.UserDAO;
import santanderjavabootcamp.collectionseclassesuteis.aulas.generics.domain.UserDomain;

public class Main {

    private static final GenericDAO<Integer, UserDomain> dao = new UserDAO();

    static void main() {
        var user = new UserDomain(1,"João", 36);

        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.find(d -> d.getId().equals(1)));
        System.out.println(dao.find(d -> d.getId().equals(2)));
        System.out.println(dao.count());
        dao.delete(new UserDomain(-1, "", -1));
        dao.delete(new UserDomain(1, "João", 36));
        System.out.println(dao.findAll());
        System.out.println(dao.count());

    }
}
