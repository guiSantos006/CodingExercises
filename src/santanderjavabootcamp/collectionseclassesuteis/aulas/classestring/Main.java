package santanderjavabootcamp.collectionseclassesuteis.aulas.classestring;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        /*
        var value = "java;java;java;java;";
        var values = value.split(";", 2);

        for (var v : values){

            System.out.println(v.toUpperCase());
        }
        */
        var value = """
                {"name":"joão","age":18}""";
        Map<String, String> map= new HashMap<>();
        value = value.replace("{","").replace("}", "").replace("\"", "");
        var valueArr = value.split(",");
        for (var v : valueArr){
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);
        }
        System.out.println(map);

    }
}
