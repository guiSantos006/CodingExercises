package santanderjavabootcamp.collectionseclassesuteis.exercicios.formatter;

import santanderjavabootcamp.collectionseclassesuteis.exercicios.formatter.domain.Field;
import santanderjavabootcamp.collectionseclassesuteis.exercicios.formatter.domain.FieldType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        List<Field> fields = new ArrayList<>();

        System.out.println("Digite os valores que deseja processar:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("/end")){
                break;
            }
            Field parsedField = parseField(input);
            // Adiciona o Objeto na List Fields
            fields.add(parsedField);
        }

        System.out.println(JSONGenerator.generate(fields));
        System.out.println("============================");
        System.out.println(XMLGenerator.generate(fields));
        System.out.println("============================");
        System.out.println(YAMLGenerator.generate(fields));
    }

    // Transforma a String em um Objeto

    private static Field parseField(String input){
        String[] splitInput = input.split(";");

        if (splitInput.length != 3) {
            throw new IllegalArgumentException(
                    "Formato inválido. Use: NOME;VALOR;TIPO"
            );
        }

        System.out.println(Arrays.toString(splitInput));

        String name = splitInput[0];
        FieldType type = FieldType.valueOf(splitInput[2].toUpperCase());
        Object value = type.convert(splitInput[1]);

        return new Field(name,value,type);
    }

    private static class JSONGenerator  {

        public static String generate(List<Field> fields) {

            StringBuilder json = new StringBuilder();

            json.append("{\n");

            for (int i = 0; i < fields.size(); i++) {

                Field field = fields.get(i);

                json.append("    \"")
                        .append(field.name())
                        .append("\": ");

                if (field.value() instanceof String) {
                    json.append("\"")
                            .append(field.value())
                            .append("\"");
                } else {
                    json.append(field.value());
                }

                if (i < fields.size() - 1) {
                    json.append(",");
                }

                json.append("\n");
            }

            json.append("}");

            return json.toString();
        }

    }

    private static class XMLGenerator {

        public static String generate(List<Field> fields) {

            StringBuilder xml = new StringBuilder();

            xml.append("<object>\n");

            for (Field field : fields) {

                xml.append("    <")
                        .append(field.name())
                        .append(">")
                        .append(field.value())
                        .append("</")
                        .append(field.name())
                        .append(">\n");
            }

            xml.append("</object>");

            return xml.toString();
        }

    }

    private static class YAMLGenerator {

        public static String generate(List<Field> fields) {

            StringBuilder yaml = new StringBuilder();

            for (Field field : fields) {

                yaml.append(field.name())
                        .append(": ")
                        .append(field.value())
                        .append("\n");
            }

            return yaml.toString();
        }

    }

}
