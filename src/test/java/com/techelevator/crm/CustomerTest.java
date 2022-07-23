package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {

    @Test
    public void test_CustomerAmount() {
        //Arrange
        Customer customer = new Customer("Billy", "Bob-Smith");
        //double servicesCost= 0.00;
        Map<String, Double> services = new HashMap<String, Double>();
        services.put("Grooming", 20.00);
        services.put("Obedience", 100.00);
        services.put("Walking", 50.00);
        services.put("Evaluation", 25.00);

        double expectedBalance = 195.00;
        double actualBalance = customer.getBalanceDue(services);

        Assert.assertEquals(expectedBalance, actualBalance, 0.01);

    }
}
