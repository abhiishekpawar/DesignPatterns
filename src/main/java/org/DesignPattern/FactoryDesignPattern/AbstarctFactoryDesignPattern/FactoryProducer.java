package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.trim().equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.trim().equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
