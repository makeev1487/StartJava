public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java" + "\n" +
                "------------------------------------------------------------");

        int age = 35;

        if (age > 20) {
            System.out.println("Age of majority");
        } else {
            System.out.println("Age of minor");
        }

        boolean isMale = true;

        if (!isMale) {
            System.out.println("Feminine");
        } else {
            System.out.println("Male");
        }

        double humanHeigth = 1.75;
        double epsion = 1.0e-10;

        if (1.80 - humanHeigth >= epsion){
            System.out.println("Average height");
        } else {
            System.out.println("High grown");
        }

        char letter1Name = "Ivan".charAt(0);

        if (letter1Name == 'M') {
            System.out.println(letter1Name + " - diligence, attentiveness");
        } else if (letter1Name == 'I') {
            System.out.println(letter1Name + " - good nature, emotionality, sensitivity");
        } else {
            System.out.println("Record not found");
        }

        System.out.println("\n2. Поиск max и min числа" + "\n" + 
                    "------------------------------------------------------------");

        int num1 = 587;
        int num2 = 383;

        if (num1 > num2) {
            System.out.println("Largest number: "+ num1 + "\n" + "Smallest number: " + num2);
        } else if (num1 < num2) {
            System.out.println("Largest number: "+ num2 + "\n" + "Smallest number: " + num1);
        } else {
            System.out.println("Numbers are equal");
        }

        System.out.println("\n3. Работа с числом" + "\n" +
                    "-------------------------------------------------------------");

        if (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd");
            }

            if (num1 < 0) {
                System.out.println("This number is negative");
            } else {
                System.out.println("This number is positive");
            }
        } else {
            System.out.println("This number is 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах" + "\n" +
                "------------------------------------------------------------");

        int num3 = 546;
        int num4 = 746;

        int num3Digit1 = num3 / 100;
        int num4Digit1 = num4 / 100;
        int num3Digit2 = num3 / 10 % 10;
        int num4Digit2 = num4 / 10 % 10;
        int num3Digit3 = num3 % 10;
        int num4Digit3 = num4 % 10;

        System.out.println("Second number: " + num3 + "\n" +
                "First number: " + num4);

        if (num3Digit1 == num4Digit1) {
            System.out.println("Same numbers " + num3Digit1 + "," + " " + "index numbers 1");
        }
        if (num3Digit2 == num4Digit2) {
            System.out.println("Same numbers " + num3Digit2 + "," + " " + "index numbers 2");
        }
        if (num3Digit3 == num4Digit3) {
            System.out.println("Same numbers " + num3Digit3 + "," + " " + "index numbers 3");
        }
        if (num3Digit1 != num4Digit1 && num3Digit2 != num4Digit2 && num3Digit3 != num4Digit3) {
            System.out.println("Match not found");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду" + "\n" +
                "----------------------------------------------------------------");

        char ch = '\u0057';
        String characterData;
        
        if (ch >= '0' && ch <= '9') {
            characterData = "number";
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'а' && ch <= 'я')) {
            characterData = "letter to lover case";
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'А' && ch <= 'Я')) {
            characterData = "letter to upper case";
        } else {
            characterData = "not a letter or a number";
        }

        System.out.println("Character " + ch + "," + " " + characterData);

        System.out.println("\n6. Определение суммы вклада и начисление банком %" + "\n" +
                "------------------------------------------------------------------");

        int deposit = 300_000;
        int yearlyRatePercent;

        if (deposit < 100_000) {
            yearlyRatePercent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            yearlyRatePercent = 7;
        } else {
            yearlyRatePercent = 10;
        }

        double grossTotal = deposit + deposit * yearlyRatePercent / 100;

        System.out.printf("Deposit: %d RUB%nYearly rate: %d%%%n" +
                "Gross total: %.2f RUB%n", deposit, yearlyRatePercent, grossTotal);

        System.out.println("\n7. Определение оценки по предметам" + "\n" +
                "------------------------------------------------------------");

        int scoreInHistoryPercent = 59;
        int scoreInProgrammingPercent = 91;
        int totalGrade = 2;
        int historyGrade = 0;
        int programmingGrade = 0;

        if (scoreInHistoryPercent <= 60) {
            historyGrade = 2;
        } else if (scoreInHistoryPercent > 60) {
            historyGrade = 3;
        } else if (scoreInHistoryPercent > 73) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (scoreInProgrammingPercent <= 60) {
            programmingGrade = 2;
        } else if (scoreInProgrammingPercent > 60) {
            programmingGrade = 3;
        } else if (scoreInProgrammingPercent > 73) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        double gpa = (double) (historyGrade + programmingGrade) / totalGrade;
        double gpaPercent = (double) (scoreInHistoryPercent + scoreInProgrammingPercent) / totalGrade;

        System.out.printf("Grade: %d history%n" +
                "Grade: %d programming%n" +
                "GPA: %.2f%n" +
                "Average scores for all subject: %.1f %%%n", historyGrade, programmingGrade, gpa, gpaPercent);

        System.out.println("\n8. Расчёт прибыли" + "\n" +
               "-----------------------------------------------------------");

        double monthlyRentPrice = 5_000;
        double costPrice = 9_000;
        double productMonthlyProfit = 13_000;

        double yearlyNetAmount = 12 * (productMonthlyProfit - monthlyRentPrice - costPrice);

        if (yearlyNetAmount < epsion) {
            System.out.printf("Yearly net amount: %.2f RUB%n", yearlyNetAmount);
        } else {
            System.out.printf("Yearly net amount: +%.2f RUB%n", yearlyNetAmount);
        }

        System.out.println("\n9. Подсчёт количества банкнот" + "\n" +
            "----------------------------------------------------------------");

        int money = 567;
        int banknote100Count = money / 100;
        int banknote10Count = money / 10 % 10;
        int banknote1Count = money % 10;

        if (banknote10Count > 5) {
            banknote10Count = 5;
            banknote1Count = money % 100 - banknote10Count * 10;
        }

        int totalMoney = banknote100Count * 100 + banknote10Count * 10 + banknote1Count;

        System.out.println("Banknote 100 USD count " + banknote100Count + "\n" +
                "Banknote 10 USD count " + banknote10Count + "\n" +
                "Banknote 1 USD count " + banknote1Count + "\n" +
                "Total money: " + totalMoney + " USD");
    }
}