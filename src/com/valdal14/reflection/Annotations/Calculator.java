package com.valdal14.reflection.Annotations;

public class Calculator {

    private double num1, num2;

    public Calculator() {
        System.out.println("Default Calculator Constructor");
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @CalculatorAnnotation(value1 = "hello", value2 = "world")
    public double add(double num1, double num2){
        return num1 + num2;
    }
}