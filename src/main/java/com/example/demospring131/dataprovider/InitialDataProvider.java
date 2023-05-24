package com.example.demospring131.dataprovider;

import com.example.demospring131.model.Translation;
import com.example.demospring131.model.entity.TranslationEntity;
import com.example.demospring131.repository.TranslationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class InitialDataProvider implements CommandLineRunner {

    private final TranslationRepository repository;

    public InitialDataProvider(TranslationRepository repository) {
        this.repository = repository;
    }
    @Override
    public void run(String... args) throws  Exception{

        createAndSave("main.page.welcome-message", "En", "Hello");
        createAndSave("main.page.welcome-message", "Pl", "Witaj");
        createAndSave("main.page.welcome-message", "Cn", "欢迎");

    }
    private void createAndSave(String code, String language, String translation){
        TranslationEntity entity = new TranslationEntity();
        entity.setCode("main.page.welcome-message");
        entity.setLanguage("En");
        entity.setTranslation("Hello");
        repository.save(entity);
    }
}
