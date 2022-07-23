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
        //double servicesCost;

        Map<String, Double> services = new HashMap<String, Double>();
        services.put("Grooming", 20.00);
        services.put("Obedience", 100.00);
        services.put("Walking", 50.00);
        services.put("Evaluation", 25.00);

        for(Double servicesCost : services){
            if(services.containsKey(servicesCost)){

                servicesCost += services;

            }
        }
    }

}
