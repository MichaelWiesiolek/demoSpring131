package com.example.demospring131.controller;

import com.example.demospring131.model.Translation;
import com.example.demospring131.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
     private final TranslationService translationService;

    @Autowired
    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, path = "/translations")
    public java.util.List<Translation> getAllTranslations(){
        return translationService.getAllTranslationsFromDataSource();



       }

//    @RequestMapping(method = RequestMethod.POST, path = "/translations")
//    public void saveNewTranslation(){
//        System.out.println("Hello");
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, path = "/translations")
//    public void updateTranslation(){
//        System.out.println("Hello");
//    }
}
  //  @RequestMapping(method = RequestMethod.POST, path = "/translations")
  //  public void saveNewTranslations() {
  //      System.out.println("Hello");
  //  }
//
  //  @RequestMapping(method = RequestMethod.PUT, path = "/translations")
  //  public void updateTranslations() {
  //      System.out.println("Hello");
  //  }

// 1:38:00, day1/cz.3
