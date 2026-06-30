package SantanderJavaBootCamp.InterfacesELambdaEmJava.KeyWords;

import SantanderJavaBootCamp.InterfacesELambdaEmJava.KeyWords.KeywordPackage.Client;

import static SantanderJavaBootCamp.InterfacesELambdaEmJava.KeyWords.KeywordPackage.Client.getStaticName;
import static SantanderJavaBootCamp.InterfacesELambdaEmJava.KeyWords.KeywordPackage.Client.setStaticName;

public class Main {
    static void main(String[] args) {
        setStaticName("teste");
        System.out.println(getStaticName());
    }

}
