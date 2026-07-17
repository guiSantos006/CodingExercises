package santanderjavabootcamp.debuggingeotratamentodeexcecoes.entedendoexceptions;

import java.io.FileNotFoundException;
import java.lang.reflect.Executable;

public class Main {
    static void main(String[] args) {
        test();

    }

    private static void test() {
                                             new Throwable(); // Pai de Exception e Error
        //                               /                           \
                            new Exception();                        new Error();
        //                  /               \
        new RuntimeException();       new FileNotFoundException();
        //    UNCHECKED                             CHECKED

    }
}
