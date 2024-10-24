package org.DesignPattern;


import org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern.AbstractFactory;
import org.DesignPattern.FactoryDesignPattern.AbstarctFactoryDesignPattern.FactoryProducer;
import org.DesignPattern.FactoryDesignPattern.Employee;
import org.DesignPattern.FactoryDesignPattern.EmployeeFactory;
import org.DesignPattern.Singleton.LazySingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //LazySingletonClass lazySingletonClass1 = new LazySingletonClass();
        /*LazySingletonClass lazySingletonClass1 = LazySingletonClass.getCarInstance();
        System.out.println(lazySingletonClass1.toString());

        LazySingletonClass lazySingletonClass2 = LazySingletonClass.getCarInstance();
        System.out.println(lazySingletonClass2.toString());

        SynchronizedSingletonClass s1 = SynchronizedSingletonClass.getSynchronizedSingletonClass();
        System.out.println(s1.hashCode());
        SynchronizedSingletonClass s2 = SynchronizedSingletonClass.getSynchronizedSingletonClass();
        System.out.println(s2.hashCode());*/


        /** Breaking singleton classes using Reflection API**/
        /*LazySingletonClass lazySingletonClass = LazySingletonClass.getCarInstance();
        System.out.println(lazySingletonClass.hashCode());

        Constructor<LazySingletonClass> constructor = LazySingletonClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingletonClass lazySingletonClass1 = constructor.newInstance();
        System.out.println(lazySingletonClass1.hashCode());*/

        //Testing Factory Design pattern

        /*Employee developer = EmployeeFactory.getEmployee("Developer");
        System.out.println(developer.getEmployeeSalary());

        Employee tester = EmployeeFactory.getEmployee("Tester");
        System.out.println(tester.getEmployeeSalary());*/

        //Testing Abstract design factory
        //refer Tester.java class.



    }
}