package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public Calculator() {

    }

    public void setNum2(int num2) {
        if ((mathOperation == '/' || mathOperation == '%') && num2 == 0) {
            System.out.println("Cannot be divide by zero");
        } else {
            this.num2 = num2;
        }
    }

    public void setMathOperation(char mathOperation) {
        if (mathOperation == '+' || mathOperation == '-' || mathOperation == '*' ||
            mathOperation == '/' || mathOperation == '^' || mathOperation == '%') {
            this.mathOperation = mathOperation;
        } else {
            System.out.println("Math operation not supported");
        }
    }

    public double calc() {
        switch (mathOperation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '^':
                double result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 / num2;
            }
            return 0;
        }
}