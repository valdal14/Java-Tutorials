package com.valdal14.generics.methodlevelgenerictypes;

import java.util.Comparator;

public class MethodLevelGenericParams {


    // Generics type params at method level
    public <T> void methodOne(T t){

    }

    public <T extends Runnable> void methodTwo(T t){

    }


    public <T extends Runnable&Comparator<String>> void  methodThree(T t){

    }
}
