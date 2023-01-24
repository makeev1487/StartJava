package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.print("Enter a first number: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();
                cal.setNum1(num1);

                System.out.print("Enter a math operation [+,-,*,/,^,%]: ");
                char mathOperation = scanner.nextLine().charAt(0);
                cal.setMathOperation(mathOperation);

                System.out.print("Enter a second number: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();
                cal.setNum2(num2);

                System.out.println("Result: " + cal.calc());
            }

            System.out.print("Want to contine calculations [yes/no]: ");
            answer = scanner.nextLine();

            if (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Answer is not correct");
            }
        } while(!"no".equals(answer));
    }
}