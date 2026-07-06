package santanderjavabootcamp.interfaceselambdaemjava.keywords;

import static santanderjavabootcamp.interfaceselambdaemjava.keywords.KeywordPackage.Client.getStaticName;
import static santanderjavabootcamp.interfaceselambdaemjava.keywords.KeywordPackage.Client.setStaticName;

public class Main {
    static void main(String[] args) {
        setStaticName("teste");
        System.out.println(getStaticName());
    }

}
