package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        } else if (colorType.trim().equalsIgnoreCase("green")) {
            return new Green();
        } else if (colorType.trim().equalsIgnoreCase("black")) {
            return new Black();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
