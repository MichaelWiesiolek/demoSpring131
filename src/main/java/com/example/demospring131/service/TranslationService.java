package com.example.demospring131.service;

import com.example.demospring131.model.Translation;
import com.example.demospring131.model.entity.TranslationEntity;
import com.example.demospring131.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

@Service
public class TranslationService {

private final TranslationRepository translationRepository;
@Autowired
    public TranslationService(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    public List<Translation>
    getAllTranslationsFromDataSource(){
        List<TranslationEntity> all = translationRepository.findAll();

        return new ArrayList<>(
        all.stream()
                .map(entity -> new Translation(entity.getCode(), new HashMap<>(Map.of(entity.getLanguage(), entity.getTranslation()))))
        .collect(Collectors.toMap(
                translation -> translation.getCode(),
                translation -> translation,
                (oldVal , newVal) -> {
                    Map<String, String> newMap = oldVal.getTranslations();
                    oldVal.getTranslations().putAll(newMap);
                    return oldVal;
                }
        )).values());



   //     new Translation("main.page.welcome-message", Map.of("EN", "Hello"));
   //     new Translation("main.page.welcome-message", Map.of("PL", "Witaj"));
   //     new Translation("main.page.welcome-message", Map.of("CN", "欢迎"));

     //
     //  Translation translation = new Translation(
     //          "main.page.welcome-message",
     //          Map.of("EN", "Hello", "PL", "Witaj", "CN", "欢迎")
     //  );

     //   return List.of(translation, translation, translation, translation);
    }
}
