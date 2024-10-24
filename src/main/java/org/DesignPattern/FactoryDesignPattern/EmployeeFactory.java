package org.DesignPattern.FactoryDesignPattern;

public class EmployeeFactory  {

    public static Employee getEmployee(String employeeType) {
        if (employeeType.trim().equalsIgnoreCase("Developer")) {
            return new Developer();
        } else if (employeeType.trim().equalsIgnoreCase("Tester")) {
            return new Tester();
        }
        return null;
    }
}
