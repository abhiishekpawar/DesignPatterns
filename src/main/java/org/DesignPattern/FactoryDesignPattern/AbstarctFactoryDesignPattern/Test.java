package org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("shape");
        Shape round = abstractFactory.getShape("round");
        round.draw();

        AbstractFactory factory = FactoryProducer.getFactory("color");
        Color red = factory.getColor("black");
        red.fill();

    }
}
