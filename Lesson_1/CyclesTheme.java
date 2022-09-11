public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел" + "\n" +
                "---------------------------------------------------------------");

        int rangeStart = -10;
        int rangeEnd = 21;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        int k = rangeStart;

        do {
            if (k % 2 != 0) {
                oddNumbersSum += k;
            }

            evenNumbersSum += k;
            k++;
        } while (k <= rangeEnd);

        System.out.println("In the range [" + rangeStart + ", " + rangeEnd + "] " + 
                " even numbers sum = " + evenNumbersSum + ", and odd = " + oddNumbersSum);

        System.out.println("\n2. Вывод чисел в интервале (min, max) в порядке убывания" + "\n" +
                "------------------------------------------------------------");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int maxNum = num1;

        if (maxNum < num2) {
            maxNum = num2;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }

        int minNum = num1;

        if (minNum > num2) {
            minNum = num2;
        }
        if (minNum > num3) {
            minNum = num3;
        }

        for (int i = maxNum; i > minNum; i--) {
            if (i == maxNum) {
                continue;
            }

            System.out.printf("%d ",i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр" + "\n" +
                "-----------------------------------------------------------");
        int num4 = 1234;
        int digitsSum = 0;
        int reverseNumber = 0;

        while (num4 > 0) {
            int currentDigit = num4 % 10;
            digitsSum += currentDigit;
            reverseNumber = reverseNumber * 10 + currentDigit;
            num4 /= 10;
        }

        System.out.println("Sum digits: " + digitsSum + "\n" + "Revers number: " + reverseNumber);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк" + "\n" +
                "----------------------------------------------------------------");

        int numbersCount = 1;

        for (int i = 1; i < 24; i+=2) {
            System.out.printf("%4d", i);

            if (numbersCount == 5) {
                System.out.println();

                numbersCount = 0;
            }

            numbersCount++;
        }

        if (numbersCount > 1) {
            for (int i = numbersCount; i <= 5; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на чётность" + "\n" +
                "------------------------------------------------------------");

        int srcNum = 3141591;
        int digits1Count = 0;
        int num5 = srcNum;

        while (num5 > 0) {
            if (num5 % 10 == 1) {
                digits1Count++;
            }

            num5 /= 10;
        }

        if (digits1Count > 0) {
            if (digits1Count % 2 ==0) {
                System.out.println("The number " + srcNum + " contains " + digits1Count + " even count of ones");
            } else {
                System.out.println("The number " + srcNum + " contains " + digits1Count + " odd count of ones");
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

        k = 5;
        int m = 0;

        while (k > 0) {
            m = k;

            while (m > 0) {
                System.out.print("#");

                m--;
            }

            System.out.println();
            k--;
        }

        System.out.println("---------------");

        k = 5;
        m = 0;

        do {
            if (k < 3) {
                m = k;
            } else {
                m = 5 + 1 - k;
            }

            do {
                System.out.print("$");

                m--;
            } while (m > 0);

            System.out.println();
            k--;
        } while (k > 0);

        System.out.println("\n7. Отображение ASCII" + "\n" +
                "--------------------------------------------------------------");
        boolean isRec1 = true;

        for (int i = 0; i < 123; i++) {
            if (isRec1) {
                System.out.printf("%4s %4s%n", "Dec", "Char");
                isRec1 = false;
            }

            char ch = (char) i;

            if ((ch < '0' && i % 2 != 0) || (ch >= 'a' && ch <= 'z' && i % 2 != 0)) {
                System.out.printf("%3d %3c%n", i, ch);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом" + "\n" +
                "-----------------------------------------------------------");

        int num6 = 1234321;
        k = num6;
        int result = 0;

        while (k > 0) {
            int currentDigit = k % 10;
            result = result * 10 + currentDigit;
            k /= 10;
        }

        if (num6 == result) {
            System.out.println("The number " + num6 + " is a palindrome");
        } else {
            System.out.println("The number " + num6 + " is not a palindrome");
        }

        System.out.println("\n9. Определение, является ли число счастливым" + "\n" +
                "-------------------------------------------------------");

        int num7 = 181631;
        k = num7;
        int digits3Sum1 = 0;
        int digits3Sum2 = 0;
        numbersCount = 0;
        int num7FirstDigits3 = num7 / 1000;
        int num7SecondDigits3 = num7 % 1000;

        while (k > 0) {
            int currentDigit = k % 10;

            if (numbersCount < 3) {
                digits3Sum2 += currentDigit;
            } else {
                digits3Sum1 += currentDigit;
            }

            k /= 10;
            numbersCount++;
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