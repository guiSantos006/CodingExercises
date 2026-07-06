package santanderjavabootcamp.interfaceselambdaemjava.keywords.KeywordPackage;

public final class Client {
    private static String staticName;

    private Client(){

    }

    public static String getStaticName() {
        return staticName;
    }

    public static void setStaticName(String param) {
        staticName = param;
    }

}
