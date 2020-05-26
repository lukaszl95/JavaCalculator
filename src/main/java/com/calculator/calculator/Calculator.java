package com.calculator.calculator;

public class Calculator {

    public void add(int a, int b){
        System.out.println(a + b);
    }
    public void sub(int a, int b){
        System.out.println(a - b);
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.sub(2,1);
    }
}
