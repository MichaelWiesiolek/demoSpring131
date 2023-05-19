package com.example.demospring131;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demospring131.service.PopulationServices;
@Configuration
public class AppConfig {

    @Bean
    public PopulationService populationService(){

        var populationServices = new PopulationService();
       return populationServices;
    }
}
