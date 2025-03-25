package com.example.sutombis.controller;

import com.example.sutombis.model.Word;

import java.io.IOException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConnectApiController {

    @GetMapping("/word")
    public String getRandomWord(Model model) throws IOException {

        String url = "https://trouve-mot.fr/api/random";

        HttpHeaders headers = new HttpHeaders();
        // Si besoin de host/key
        // headers.add("x-rapidapi-host", "wordsapiv1.p.rapidapi.com");
        // headers.add("x-rapidapi-key", "66415cdb44msh4c25cde97367049p176f34jsnd9aca8060cfd");
        
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        
        return response.toString();
    }

}
