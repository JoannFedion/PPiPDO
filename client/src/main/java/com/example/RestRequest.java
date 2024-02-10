package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestRequest {

    public static <T> ResponseEntity<T> makeGETRequestTo(String url, Class<T> clazz){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url, clazz);
    }
}
