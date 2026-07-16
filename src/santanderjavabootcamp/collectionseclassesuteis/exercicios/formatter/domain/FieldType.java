package santanderjavabootcamp.collectionseclassesuteis.exercicios.formatter.domain;

import java.util.function.Function;

public enum FieldType {

    TEXT(value -> value),

    INTEGER(Integer::parseInt),

    FLOAT(Double::parseDouble),

    BOOLEAN(Boolean::parseBoolean),

    DATE(value -> value),

    DATETIME(value -> value),

    ARRAY_INTEGER(value -> value),

    ARRAY_OBJECTS(value -> value);

    private final Function<String, Object> converter;

    FieldType(Function<String, Object> converter) {
        this.converter = converter;
    }

    public Object convert(String value) {
        return converter.apply(value);
    }
}
