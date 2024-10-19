package org.example;


import org.example.Singleton.LazySingletonClass;
import org.example.Singleton.SynchronizedSingletonClass;

public class Main {
    public static void main(String[] args) {

        //LazySingletonClass lazySingletonClass1 = new LazySingletonClass();
        LazySingletonClass lazySingletonClass1 = LazySingletonClass.getCarInstance();
        System.out.println(lazySingletonClass1.toString());

        LazySingletonClass lazySingletonClass2 = LazySingletonClass.getCarInstance();
        System.out.println(lazySingletonClass2.toString());

        SynchronizedSingletonClass s1 = SynchronizedSingletonClass.getSynchronizedSingletonClass();
        System.out.println(s1.hashCode());
        SynchronizedSingletonClass s2 = SynchronizedSingletonClass.getSynchronizedSingletonClass();
        System.out.println(s2.hashCode());

    }
}