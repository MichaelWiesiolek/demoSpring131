package com.example.demospring131.controller;

import com.example.demospring131.model.Population;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PopulationController {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, path = "/population")
    public List<Population> getAllPopulation(){
        System.out.println("Hej ludzie");
        Population population = new Population(
                "Argentina", 8, 85, 1);
        Population population2 = new Population(
                "Argentina", 8, 35, 2);
        return List.of(population,population2);
    }
}
