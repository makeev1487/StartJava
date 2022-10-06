public class Calculator {
    private double num1;
    private double num2;
    private char mathOperation;

    public Calculator(double num1, double num2, char mathOperation) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathOperation = mathOperation;
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

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        if (validateMathOperation ()) {
            this.mathOperation = mathOperation;
        } else {
            System.out.println("Math operation not supported");
        }
    }

    public double calc() {
        double epsilon = 1.0e-10;

        switch (mathOperation) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (Math.abs(num2) < epsilon) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        return num1 / num2;
                    }
                case '^':
                    double result = 1;

                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                    return result;
                case '%':
                    if (Math.abs(num2) < epsilon) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        return num1 / num2;
                    }
            }
            return 0;
        }

    public boolean validateMathOperation() {
        if (mathOperation != '+' || mathOperation != '-' || mathOperation != '*' ||
            mathOperation != '/' || mathOperation != '^' || mathOperation != '%') {
            return false;
        }
        return true;
    }
}