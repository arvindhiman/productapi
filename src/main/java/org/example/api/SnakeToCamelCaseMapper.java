package org.example.api;

import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class SnakeToCamelCaseMapper implements FieldNameMapper {

    Properties cache = new Properties();

    @Override
    public String convert(String field) {

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
