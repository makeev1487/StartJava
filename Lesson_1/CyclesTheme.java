public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел" + "\n" +
                "---------------------------------------------------------------");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;

        System.out.printf("In the range [%d, %d] ", startRange, endRange);

        do {
            if (startRange % 2 != 0) {
                sumOdd += startRange;
            } else {
                sumEven += startRange;
            }
            startRange++;
        } while (startRange <= endRange);

        System.out.println("even numbers sum = " + sumEven + ", and odd = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min, max) в порядке убывания" + "\n" +
                "------------------------------------------------------------");
        int num1 = 5;
        int num2 = -1;
        int num3 = 10;

        int maxNum = num1;
        int minNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        } else if (num2 < minNum) {
            minNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        } else if (num3 < minNum) {
            minNum = num3;
        }

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр" + "\n" +
                "-----------------------------------------------------------");
        int num4 = 1234;
        int sumDigits = 0;

        System.out.print("Revers number: ");

        while (num4 > 0) {
            int currentDigit = num4 % 10;
            System.out.print(currentDigit);

            sumDigits += currentDigit;
            num4 /= 10;
        }

        System.out.println("\nSum digits: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк" + "\n" +
                "----------------------------------------------------------------");
        int countNums = 1;

        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);

            if (countNums == 5) {
                System.out.println();
                countNums = 0;
            }
            countNums++;
        }

        if (countNums > 1) {
            for (int i = countNums; i <= 5; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на чётность" + "\n" +
                "------------------------------------------------------------");
        int srcNum = 3141591;
        int countOnes = 0;
        int copySrcNum = srcNum;

        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 1) {
                countOnes++;
            }

            copySrcNum /= 10;
        }

        if (countOnes > 0) {
            if (countOnes % 2 ==0) {
                System.out.println("The number " + srcNum + " contains " + countOnes + " even count of ones");
            } else {
                System.out.println("The number " + srcNum + " contains " + countOnes + " odd count of ones");
            }
        } else {
            System.out.println("No matches found");
        }

        System.out.println("\n6. Отображение фигур в консоли" + "\n" +
                "-------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("--------------");
        int countCols = 5;
        int countRows = 0;

        while (countCols > 0) {
            countRows = countCols;

            while (countRows > 0) {
                System.out.print("#");
                countRows--;
            }

            System.out.println();
            countCols--;
        }

        System.out.println("---------------");
        countCols = 5;

        do {
            if (countCols < 3) {
                countRows = countCols;
            } else {
                countRows = 5 + 1 - countCols;
            }

            do {
                System.out.print("$");
                countRows--;
            } while (countRows > 0);

            System.out.println();
            countCols--;
        } while (countCols > 0);

        System.out.println("\n7. Отображение ASCII" + "\n" +
                "--------------------------------------------------------------");
        System.out.printf("%4s %4s%n", "Dec", "Char");

        for (char i = 0; i < 123; i++) {
            if ((i < '0' && (int) i % 2 != 0) || (i >= 'a' && i <= 'z' && (int) i % 2 == 0)) {
                System.out.printf("%3d %3c%n", (int) i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом" + "\n" +
                "-----------------------------------------------------------");
        int num6 = 1234321;
        int copyNum6 = num6;
        int reverseNum = 0;

        while (copyNum6 > 0) {
            int currentDigit = copyNum6 % 10;
            reverseNum = reverseNum * 10 + currentDigit;
            copyNum6 /= 10;
        }

        if (num6 == reverseNum) {
            System.out.println("The number " + num6 + " is a palindrome");
        } else {
            System.out.println("The number " + num6 + " is not a palindrome");
        }

        System.out.println("\n9. Определение, является ли число счастливым" + "\n" +
                "-------------------------------------------------------");
        int num7 = 181631;
        int copyNum7 = num7;
        int digits3Sum1 = 0;
        int digits3Sum2 = 0;
        countNums = 0;
        int num7FirstDigits3 = num7 / 1000;
        int num7SecondDigits3 = num7 % 1000;

        while (copyNum7 > 0) {
            int currentDigit = copyNum7 % 10;

            if (countNums < 3) {
                digits3Sum2 += currentDigit;
            } else {
                digits3Sum1 += currentDigit;
            }

            copyNum7 /= 10;
            countNums++;
        }

        if (digits3Sum1 == digits3Sum2) {
            System.out.println("Digital sum " + num7FirstDigits3 + " = " + digits3Sum1 + "\n" +
                    "Digital sum " + num7SecondDigits3 + " = " + digits3Sum2 + "\n" +
                    "Number " + num7 + " is happy");
        } else {
            System.out.println("Digital sum " + num7FirstDigits3 + " = " + digits3Sum1 + "\n" +
                    "Digital sum " + num7SecondDigits3 + " = " + digits3Sum2 + "\n" +
                    "Number " + num7 + " is not happy");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора" + "\n" +
                "-------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("%2s|", " ");
            } else {
                System.out.printf("%2d|", i);
            }

            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    continue;
                } else {
                    System.out.printf("%3d", i*j);
                }
            }

            System.out.println();

            if (i == 1) {
                System.out.println("---------------------------");
            }
        }
    }
}