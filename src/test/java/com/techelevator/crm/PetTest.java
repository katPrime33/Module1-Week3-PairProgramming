package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

    @Test
    public void test_listVaccinations(){

        //Arrange
    PetTest testList = new PetTest();
        //Act
           List<String> results = new ArrayList<>();
        results.add(0,"Rabies");
        results.add(1, "a");
        results.add(2, "Flea Treatment");
        //Assert
              Assert.assertEquals();
    }

}
