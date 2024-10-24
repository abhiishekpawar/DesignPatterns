package org.DesignPattern.Singleton;

public class LazySingletonClass {

    private static LazySingletonClass lazySingletonClass;

    private LazySingletonClass() {
    }

    //Lazy way of creating singleton class.[instance of the class is created when required.]
    public static LazySingletonClass getCarInstance() {
        if (lazySingletonClass == null) {
            lazySingletonClass = new LazySingletonClass();
        }
        return lazySingletonClass;
    }
}
