import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter a second number: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter a math operation [+,-,*,/,^,%]: ");
            char mathOperation = scanner.nextLine().charAt(0);

            Calculator cal = new Calculator(num1,num2,mathOperation);

            switch (cal.getMathOperation()) {
                default:
                    System.out.println("Math operation not supported");
                    break;
                case '+':
                    System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                        cal.getNum2() + " = " + cal.sum());
                    break;
                case '-':
                    System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                        cal.getNum2() + " = " + cal.subtract());
                    break;
                case '*':
                    System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                        cal.getNum2() + " = " + cal.multiply());
                    break;
                case '/':
                    if (num2 ==0) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                            cal.getNum2() + " = " + cal.divide());
                    }
                    break;
                case '^':
                    System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                        cal.getNum2() + " = " + cal.exponentiate());
                    break;
                case '%':
                    if (num2 ==0) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        System.out.println(cal.getNum1() + " " + cal.getMathOperation() + " " +
                            cal.getNum2() + " = " + cal.remainder());
                    }
                    break;
            }
            System.out.println("Want to contine calculations [Y/N]: ");
            char answer = scanner.nextLine().charAt(0);

            if (answer == 'N' || answer == 'n') {
                System.exit(0);
            }
        }
    }
}