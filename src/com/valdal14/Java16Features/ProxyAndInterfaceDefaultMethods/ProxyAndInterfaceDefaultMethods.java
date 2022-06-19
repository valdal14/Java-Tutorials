package com.valdal14.Java16Features.ProxyAndInterfaceDefaultMethods;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyAndInterfaceDefaultMethods {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class<?>[] { MyInterface.class },
                (prox, method, arguments) -> {
                    return InvocationHandler.invokeDefault(prox, method, arguments);
                });
        Method method = proxy.getClass().getMethod("myInterfaceMethod");
        System.out.println(method.invoke(proxy));
    }
}
