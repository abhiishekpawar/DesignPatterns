package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.trim().equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.trim().equalsIgnoreCase("round")) {
            return new Round();
        }
        return null;
    }
}
