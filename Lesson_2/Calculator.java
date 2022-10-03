public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;

    public Calculator(int num1, int num2, char mathOperation) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathOperation = mathOperation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        if (mathOperation == '+' || mathOperation == '-' || mathOperation == '*' ||
            mathOperation == '/' || mathOperation == '^' || mathOperation == '%') {
            this.mathOperation = mathOperation;
        } else {
            System.out.println("Math operation not supported");
        }
    }

    public int sum() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public double divide() {
            return (double) num1 / num2;
    }

    public int exponentiate() {
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        return result;
    }

    public int remainder() {
        return num1 % num2;
    }
}