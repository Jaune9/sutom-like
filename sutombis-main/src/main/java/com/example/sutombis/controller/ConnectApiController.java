package com.example.sutombis.controller;

import com.example.sutombis.model.Word;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ConnectApiController {

    @SuppressWarnings("null")
    @GetMapping("/word")
    public String getRandomWord(Model model) {
        String url = "https://trouve-mot.fr/api";
        RestTemplate restTemplate = new RestTemplate();
        
        Word response = restTemplate.getForObject(url + "/daily", Word.class);
        
        return response.getName();
    }

}
