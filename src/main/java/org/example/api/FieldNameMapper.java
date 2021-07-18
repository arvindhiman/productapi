package org.example.api;

public interface FieldNameMapper {

    String createCamelCaseInputParam(String param);

    public String createSnakeCaseInputParam(String param);

    String convertToCamelCase(String field);
}
