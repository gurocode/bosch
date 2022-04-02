package com.example.demo.urlHandler;

import com.example.demo.urlHandler.Url;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;


public class JsonConverter {
    ArrayList<String> list = new ArrayList<>();
    Url urlx;
    String jsonString;
    ObjectMapper objectMapper = new ObjectMapper();

    public void addToList(int id, String url){
         urlx = new Url(id,url);

         try {
             jsonString = objectMapper.writeValueAsString(urlx);
             list.add(jsonString);
         } catch (JsonProcessingException e) {
             e.printStackTrace();
         }
    }
}


