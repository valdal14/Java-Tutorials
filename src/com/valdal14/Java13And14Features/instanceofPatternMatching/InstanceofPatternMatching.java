package com.valdal14.Java13And14Features.instanceofPatternMatching;

public class InstanceofPatternMatching {

    public static void main(String[] args) {

        Object object = get();

        // Pattern matching
        if(object instanceof String str){
            System.out.println(str);
        }
    }

    public static Object get(){
        return "Pattern Matching in action";
    }
}
