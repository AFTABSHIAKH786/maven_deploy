package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("Hello this is aftab");
    }
    // Calculator class
    public double calculate(double firstOperand, double secondOperand, char operator){
        switch (operator){
            case '+':{
                return add(firstOperand,secondOperand);
            }
            case '-':{
                return subtract(firstOperand,secondOperand);
            }
            case '*':{
                return multiply(firstOperand,secondOperand);
            }
            case ':':{
                return divide(firstOperand,secondOperand);
            }
            default:
                throw new IllegalArgumentException("Unsupported operation :"+operator);
        }
    }

    private double divide(double firstOperand, double secondOperand) {
        if(secondOperand == 0)
            throw new IllegalArgumentException("Second argument must not be zero!");
        return firstOperand / secondOperand;
    }

    private double multiply(double firstOperator, double secondOperand) {
        return firstOperator * secondOperand;
    }

    private double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    private double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
}
