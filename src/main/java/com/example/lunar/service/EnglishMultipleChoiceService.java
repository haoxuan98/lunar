package com.example.lunar.service;

import com.example.lunar.dao.EnglishMultipleChoiceMapper;
import com.example.lunar.model.EnglishMultipleChoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/EnglishMultipleChoice")
public class EnglishMultipleChoiceService {

    @Autowired
    EnglishMultipleChoiceMapper englishMultipleChoiceMapper;

    @RequestMapping("getAll.do")
    public List<EnglishMultipleChoice> getAll(){
        return englishMultipleChoiceMapper.selectAll();
    }

    @RequestMapping("addEnglishMultipleChoice.do")
    public boolean addEnglishMultipleChoice(EnglishMultipleChoice englishMultipleChoice) {
        return englishMultipleChoiceMapper.addChoice(englishMultipleChoice);
    }

}
