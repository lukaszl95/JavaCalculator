package com.calculator.calculator;

public class Calculator {

    public void suma(){
        System.out.println("Suma");
    }
    public void odejmowanie(){
        System.out.println("Odejmowanie");
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.suma();
        calculator.odejmowanie();
    }
}
