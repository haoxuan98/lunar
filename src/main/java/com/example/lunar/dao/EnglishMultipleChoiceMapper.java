package com.example.lunar.dao;

import com.example.lunar.model.EnglishMultipleChoice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnglishMultipleChoiceMapper {
    List<EnglishMultipleChoice> selectAll();
    
    boolean addChoice(EnglishMultipleChoice englishMultipleChoice);
}
