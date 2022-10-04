import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter a second number: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a math operation [+,-,*,/,^,%]: ");
            char mathOperation = scanner.nextLine().charAt(0);

            Calculator cal = new Calculator(num1,num2,mathOperation);

            if (((cal.getMathOperation() == '/' || cal.getMathOperation() == '%') && cal.getNum2() == 0)
                    || !cal.hasMathOperation() {
                cal.getCalculationResult();
            } else {
                System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                    cal.getNum2() + " = " + cal.getCalculationResult());
            }

            System.out.print("Want to contine calculations [Y/N]: ");
            char answer = scanner.nextLine().charAt(0);

            if (answer == 'N' || answer == 'n') {
                return;
            }
        }
    }
}