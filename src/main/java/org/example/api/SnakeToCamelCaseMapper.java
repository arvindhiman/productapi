package org.example.api;

import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class SnakeToCamelCaseMapper implements FieldNameMapper {

    Properties cache = new Properties();

    public String createSnakeCaseInputParam(String param) {

        char[] characters = param.toCharArray();
        StringBuilder sb = new StringBuilder("ip_");
        for (char c: characters) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append("_").append(Character.toLowerCase(c));
            }
        }

        return sb.toString();

    }

    public String createCamelCaseInputParam(String param) {
        String removedPrefix = param.replaceAll("ip_","");
        return convertToCamelCase(removedPrefix);
    }

    @Override
    public String convertToCamelCase(String field) {

        if (cache.getProperty(field) != null) {
            return cache.getProperty(field);
        }

        // lowercase whole string
        String[] parts = field.toLowerCase().split("_");
        StringBuilder finalString = new StringBuilder();
        for(int i = 0; i < parts.length; i++) {
            if (i == 0)
                finalString.append(parts[i]);
            else {
                String s1 = parts[i].substring(0, 1).toUpperCase();
                finalString.append(s1).append(parts[i].substring(1));
            }
        }

        cache.put(field, finalString.toString());
        return finalString.toString();

    }
}
