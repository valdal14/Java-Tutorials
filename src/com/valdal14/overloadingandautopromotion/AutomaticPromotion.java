package com.valdal14.overloadingandautopromotion;

/**
 *  OVERLOADING AND AUTO PROMOTION
 *
 *  -> If we take out the first print method that takes the integer still works
 *     and it will be auto-promoted as the Float version of it
 *
 *  -> Autoptomoting also works on Object
 *      -> If we remove the string version the object will be auto-promoted
 */


public class AutomaticPromotion {


//    public void print(int i){
//        System.out.println("Interger Version: " + i);
//    }

    public void print(float f){
        System.out.println("Float Version: " + f);
    }

//    public void print(String s){
//        System.out.println("String Version: " + s);
//    }

    public void print(Object o){
        System.out.println("String Version: " + o);
    }

    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(123);
        ap.print(10.5f);
        ap.print("This is a String");
        ap.print(new String("This is an Object String"));
    }
}
