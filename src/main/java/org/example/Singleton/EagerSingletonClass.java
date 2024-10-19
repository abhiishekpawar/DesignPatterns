package org.example.Singleton;

//Eager singleton class.
public class EagerSingletonClass {
    private static EagerSingletonClass eagerSingletonClass = new EagerSingletonClass();

    public static EagerSingletonClass getEagerSingletonClass() {
        return eagerSingletonClass;
    }
}
