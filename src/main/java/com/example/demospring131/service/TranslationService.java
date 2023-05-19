package com.example.demospring131.service;

import com.example.demospring131.model.Translation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TranslationService {



    public List<Translation>
    getAllTranslationsFromDataSource(){
        Translation translation = new Translation(
                "main.page.welcome-message",
                Map.of("EN", "Hello", "PL", "Witaj", "CN", "欢迎")
        );

        return List.of(translation, translation, translation, translation);
    }
}
