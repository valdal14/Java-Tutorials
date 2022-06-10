package com.valdal14.java8functional.defaultmethodsinterfaces;

public interface DefaultMethodInterface {

    default void defaultMethodInterface(){
        System.out.println("This is a default method of this interface");
    }
}


class DemoDefaultMethodInterface implements DefaultMethodInterface {

    @Override
    public void defaultMethodInterface() {
        //DefaultMethodInterface.super.defaultMethodInterface();
        System.out.println("defaultMethodInterface inside class DemoDefaultMethodInterface child class");
    }
}

class DemoDefaultMethodInterfaceDireclty {
    public static void main(String[] args) {
        // Using runtime poly
        DefaultMethodInterface defaultMethodInterface = new DemoDefaultMethodInterface();
        defaultMethodInterface.defaultMethodInterface();
    }
}