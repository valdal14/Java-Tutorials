package com.valdal14.Java16Features.ProxyAndInterfaceDefaultMethods;

public interface MyInterface {

    default void myInterfaceMethod(){
        System.out.println("Default Method inside an Interface, very useful for developing frameworks");
    }
}
