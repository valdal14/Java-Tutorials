package com.valdal14.Java15Features.SealedClasses;

public class SealedClassesDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        BMWParent bmw = new FiveSeries();
        bmw.applyColor("Red");
        bmw.startEngine(bmw);

        // This class can extend a non-selaed class
        BMWM m2 = new BMWM();

        // Reflection
        Class c = Class.forName(BMWParent.class.getName());
        // check if this class is sealed
        System.out.println(c.getName() + " is sealed: " + c.isSealed());
        // get all permitted subclasses
        Class[] objs = c.getPermittedSubclasses();
        for (var o: objs) {
            System.out.println(o.getName());
        }
    }
}
