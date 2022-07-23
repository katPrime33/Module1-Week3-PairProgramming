package com.techelevator.hr;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void test_EmployeeAmount() {
        //Arrange
        Employee employee = new Employee("Billy", "Bob-Smith");
        Map<String, Double> services = new HashMap<String, Double>();
        services.put("Grooming", 20.00);
        services.put("Obedience", 100.00);
        services.put("Walking", 50.00);
        services.put("Evaluation", 25.00);

        double expectedBalance = 170.00;
        double actualBalance = employee.getBalanceDue(services);
        Assert.assertEquals(expectedBalance, actualBalance, 0.01);

    }


    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }
}
