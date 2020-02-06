package com.example.lunar.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@EnableAutoConfiguration
@RequestMapping("/EnglishMultipleChoice")
@Controller
public class EnglishMultipleChoiceController {

    @RequestMapping("/addChoice")
    public String addChoice() {
        return "/addEnglishMultipleChoice";
    }
}
