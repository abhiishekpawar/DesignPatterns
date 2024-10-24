package org.DesignPattern.FactoryDesignPattern;

public class Tester implements Employee{
    @Override
    public int getEmployeeSalary() {
        System.out.println("Getting Tester salary");
        return 30000;
    }
}
