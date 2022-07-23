package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private ArrayList<String> vaccinations = new ArrayList<>();

    public Pet(String name, String species) {
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

    public String listVaccinations() {
        String vaccine = null;
        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");
        vaccinations.add("super covid");
        for(int i = 0; i < vaccinations.size(); i++){
            vaccine = vaccine + vaccinations.get(i) + ", ";
            return vaccine;
        }
        return vaccine;
    }

}
