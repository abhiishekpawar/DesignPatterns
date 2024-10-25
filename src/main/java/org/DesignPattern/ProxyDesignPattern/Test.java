package org.DesignPattern.ProxyDesignPattern;

public class Test {

    public static void main(String[] args) {

        Image test = new ProxyImage("test");
        test.display();

//        Image test1 = new ProxyImage("test");
        test.display();
    }
}
