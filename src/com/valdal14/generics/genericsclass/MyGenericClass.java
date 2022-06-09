package com.valdal14.generics.genericsclass;

public class MyGenericClass<T> {

    // fild of generics type
    T obj;

    public MyGenericClass(T obj){
        this.obj = obj;
    }

    public void displayObjInfo(){
        System.out.println("Type of object is: " + this.obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }
}

class Demo {

    public static void main(String[] args) {
        MyGenericClass<String> myGenericClass = new MyGenericClass<>("I am a String");
        myGenericClass.displayObjInfo();
        // Integer x = myGenericClass.getObj(); compile time error since we are using a T String
        String x = myGenericClass.getObj();
        System.out.println(x);

        MyGenericClass<Integer> myGenericClassInt = new MyGenericClass<>(14);
        myGenericClassInt.displayObjInfo();
        // String y = myGenericClass.getObj(); compile time error since we are using a T Integer
        Integer y = myGenericClassInt.getObj();
        System.out.println(y);
    }
}
