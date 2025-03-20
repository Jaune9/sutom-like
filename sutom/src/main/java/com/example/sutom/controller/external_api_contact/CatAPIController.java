package com.example.sutom.controller.external_api_contact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CatAPIController {

  @GetMapping("/cat_fact")
  public String catFactForm(Model model) {
    model.addAttribute("catfact", new CatFact());
    return "cat_fact";
  }

  @PostMapping("/cat_fact")
  public String catFactSubmit(@ModelAttribute CatFact catFact, Model model) {
    model.addAttribute("catfact", catFact);
    return "result_cat";
  }

}