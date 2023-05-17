package com.example.demospring131.controller;

import com.example.demospring131.model.Translation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

@RestController
public class TranslationController {
@RequestMapping(method = RequestMethod.GET, path = "/translations")
    public List<Translation> getAllTranslations(){
        System.out.println("Hello");
        Translation translation = new Translation("main.page.welcome-message",
                Map.of("EN", "Hello", "Pl", "Witaj", "CN", "你好"));

        return List.of(translation);
    }
}
// 29 minuta, day1/cz.3