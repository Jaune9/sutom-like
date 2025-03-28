package com.example.sutombis.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.sutombis.model.Word;

@RestController
public class ConnectApiController {

    @SuppressWarnings("null")
    @GetMapping("/word")
    public String getRandomWord(Model model) {
        String url = "https://trouve-mot.fr/api";
        RestTemplate restTemplate = new RestTemplate();

        Word response = restTemplate.getForObject(url + "/daily", Word.class);

        String daily_word = response.getName();
        response.setWordToFind(daily_word);

        return response.hidWord();
    }

    @PostMapping("/word")
    public String submitWord(@ModelAttribute Word Word, Model model) {
        model.addAttribute("Word", Word);
        return "word";
    }
}
