package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square share");
    }
}
