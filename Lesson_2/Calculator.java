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
        if (hasMathOperation ()) {
            this.mathOperation = mathOperation;
        } else {
            System.out.println("Math operation not supported");
        }
    }

    public double getCalculationResult() {
        double result = 1;

        switch (mathOperation) {
                case '+':
                    result = (double) num1 + num2;
                    break;
                case '-':
                    result = (double) num1 - num2;
                    break;
                case '*':
                    result = (double) num1 * num2;
                    break;
                case '/':
                    if (num2 ==0) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        result = (double) num1 / num2;
                    }
                    break;
                case '^':
                    for (int i = 0; i < num2; i++) {
                    result *= num1;
                    }
                    break;
                case '%':
                    if (num2 ==0) {
                        System.out.println("Cannot be divide by zero");
                    } else {
                        result = (double) num1 / num2;
                    }
                    break;
                default:
                    setMathOperation(mathOperation);
                    break;
            }

        return result;
    }

    public boolean hasMathOperation() {
        if (mathOperation != '+' || mathOperation != '-' || mathOperation != '*' ||
            mathOperation != '/' || mathOperation != '^' || mathOperation != '%') {
            return false;
        }
        return true;
    }
}