package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private ArrayList<String> vaccinations = new ArrayList<>();

    public Pet() {
        this.name = name;
        this.species = species;
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    //method

    public String listVaccinations(List<String> vaccinations) {
        String vaccine = vaccinations.get(0);

        for(int i = 1; i < vaccinations.size(); i++){
            vaccine = vaccine + ", " + vaccinations.get(i) ;
        }
        return vaccine;
    }

}
