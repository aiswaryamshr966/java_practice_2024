package com.stream_api_programming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MappingToObject {
    public static void main(String[] args) {
        List<String> jsonStrings = List.of("{\"name\":\"John\", \"age\":30}", "{\"name\":\"Alice\", \"age\":25}");

        List<Map<String, Object>> jsonObjects = jsonStrings.stream()
                .map(json -> {
                    Map<String, Object> jsonObject = new HashMap<>();
                    String[] pairs = json.substring(1, json.length() - 1).split(", ");
                    for (String pair : pairs) {
                        String[] keyValue = pair.split(":");
                        String key = keyValue[0].replace("\"", "");
                        String value = keyValue[1].startsWith("\"") ? keyValue[1].replace("\"", "") : keyValue[1];
                        jsonObject.put(key, value);
                    }
                    return jsonObject;
                })
                .collect(Collectors.toList());

        System.out.println(jsonObjects);
    }
}
