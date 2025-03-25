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
        

        String daily_word = response.getName();
        response.blurWord(daily_word);
        int length = daily_word.length();
        String hidden_daily_word = String.format("%-" + length + "s", daily_word.charAt(0)).replace(' ', '_');

        return hidden_daily_word;
    }

}
