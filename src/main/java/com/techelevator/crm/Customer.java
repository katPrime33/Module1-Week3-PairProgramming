package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    //variables
    private String phoneNumber;
    private List pets = new ArrayList();


    //getters and setters
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List getPets() {
        return pets;
    }
    public void setPets(List pets) {
        this.pets = pets;
    }

    //constructors
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    //method
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double servicesCost = 0.00;

        for(Map.Entry<String, Double> costMap : servicesRendered.entrySet()){
            servicesCost += costMap.getValue();
        }
        return servicesCost;
    }

}
