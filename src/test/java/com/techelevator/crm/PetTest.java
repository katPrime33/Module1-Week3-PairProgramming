package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

    @Test
    public void test_listVaccinations(){

        //Arrange
    Pet pet = new Pet();
        //Act
           List<String> results = new ArrayList<>();
        results.add("Rabies");
        results.add("Parvo");
        results.add("super covid");
        results.add("Distemper");

        String expectedResults = "Rabies, Parvo, super covid, Distemper";
        String actualResults = pet.listVaccinations(results);
        //Assert
              Assert.assertEquals(expectedResults, actualResults);
    }

}
