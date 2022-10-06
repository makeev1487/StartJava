import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a first number: ");
            double num1 = scanner.nextInt();

            System.out.print("Enter a second number: ");
            double num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a math operation [+,-,*,/,^,%]: ");
            char mathOperation = scanner.nextLine().charAt(0);

            Calculator cal = new Calculator(num1, num2, mathOperation);

            double epsilon = 1.0e-10;

            if ((mathOperation == '/' || mathOperation == '%') && Math.abs(num2) < epsilon) {
                cal.calc();
            } else {
                System.out.println(num1 + " " + mathOperation + " " +
                    num2 + " = " + cal.calc());
            }

            System.out.print("Want to contine calculations [Y/N]: ");
            char answer = scanner.nextLine().charAt(0);

            if (answer == 'N' || answer == 'n') {
                return;
            }
        }
    }
}