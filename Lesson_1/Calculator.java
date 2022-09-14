public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        char ch = '^';
        int result = 0;

        if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else if (ch == '/') {
            if (num2 == 0) {
                System.out.println("Cannot be divide by zero");
                return;
            }
            result = num1 / num2;
        } else if (ch == '^') {
            if (num2 == 0) {
                result = 1;
            }
            result = 1;

            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (ch == '%') {
            if (num2 == 0) {
                System.out.println("Cannot be divide by zero");
                return;
            }
            result = num1 % num2;
        } else {
            System.out.println("Option not supported");
        }

        System.out.println(num1 + " "+ ch + " " + num2 + " = " + result);
    }
}