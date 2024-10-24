package org.DesignPattern.FactoryDesignPattern;

public class Developer implements Employee{
    @Override
    public int getEmployeeSalary() {
        System.out.println("Getting Developer salary");
        return 50000;
    }
}
