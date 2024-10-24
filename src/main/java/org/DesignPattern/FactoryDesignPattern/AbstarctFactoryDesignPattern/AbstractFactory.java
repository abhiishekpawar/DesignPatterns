package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
     abstract Shape getShape(String shapeType);
}
