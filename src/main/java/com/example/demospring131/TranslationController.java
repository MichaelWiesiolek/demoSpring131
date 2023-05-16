package com.example.demospring131;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
@RequestMapping(method = RequestMethod.GET, path = "/translations")
    public void getAllTranslations(){
        System.out.println("Hello");
    }
}
// 29 minuta, day1/cz.3