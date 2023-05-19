package com.example.demospring131.service;

import com.example.demospring131.model.Population;

import java.util.List;

public class PopulationServices {
    public List<Population> getAllPopulation(){
        Population population = new Population("Argentina", 8, 85, 1);
        Population population2 = new Population("Oman", 7, 35,2);
        return List.of(population, population2);
    }
}
