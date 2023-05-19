package com.example.demospring131.model;

public class Population {
    public Population(String nazwa, int populacja, float przyrost, int id){
        this.nazwa = nazwa;
        this.populacja = populacja;
        this.przyrost = przyrost;
        this.id = id;
    }
    private String nazwa;
    private int populacja;
    private float przyrost;
    private int id;

    public String getNazwa() {
        return nazwa;
    }

    public int getPopulacja() {
        return populacja;
    }

    public float getPrzyrost() {
        return przyrost;
    }

    public int getId() {
        return id;
    }
}
