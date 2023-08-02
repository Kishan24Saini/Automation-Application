package com.demo.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperToPojo {
    private static MapperToPojo instance;
    private static ObjectMapper objectMapper;

    private MapperToPojo() {
        objectMapper = new ObjectMapper();
    }

    public static MapperToPojo getInstance() {
       if(instance==null)  {
           instance= new MapperToPojo();
       }
       return instance;
    }
    public <T> T jsonToPojo(String json, Class<T> clazz) throws JsonProcessingException {
       return objectMapper.readValue(json, clazz);
    }
}
