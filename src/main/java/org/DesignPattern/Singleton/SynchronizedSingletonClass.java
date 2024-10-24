package org.DesignPattern.Singleton;

/**
 * To make singleton classes thread safety than we have to use Synchronization
 */
public class SynchronizedSingletonClass {

    private static SynchronizedSingletonClass synchronizedSingletonClass;

    private SynchronizedSingletonClass() {
    }

    /**This is Method level synchronization*/

    /*public static synchronized SynchronizedSingletonClass getSynchronizedSingletonClass(){
        if(synchronizedSingletonClass == null){
            synchronizedSingletonClass = new SynchronizedSingletonClass();
        }
        return synchronizedSingletonClass;
    }*/

    /**
     * This is block level synchronization
     */
    public static SynchronizedSingletonClass getSynchronizedSingletonClass() {

        if (synchronizedSingletonClass == null) {
            synchronized (SynchronizedSingletonClass.class) {
                if (synchronizedSingletonClass == null) {
                    synchronizedSingletonClass = new SynchronizedSingletonClass();
                }
            }
        }
        return synchronizedSingletonClass;
    }
}
