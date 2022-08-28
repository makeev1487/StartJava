public class VariablesTheme{
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль" + "\n" +
            "-------------------------------------------------------------");

        String device = "laptop";
        byte processorType = 7;
        byte coresCpuCount = 4;
        short ram = 16;
        int ssdVolume = 1000;
        long memoryFrequency = 2_133_000_000;
        float cpuFrequency = 2.9F;
        double screenDiagonal = 17.3;
        char keyBacklight = 'Y';
        boolean hasMatteScreen = true;

        System.out.println("Device: " + device + "\n" +
            "Process type: i" + processorType + "\n" +
            "Cores count: " + coresCpuCount + "\n" +
            "Cpu frequency: " + cpuFrequency + " " + "GHz" + "\n" +
            "Ram: " + ram + " " + "GB" + "\n" +
            "Memory frequency: " + memoryFrequency + " " + "Hz" + "\n"+
            "Ssd volume: " + ssdVolume + " " + "GB" + "\n" +
            "Screen diagonal: " + screenDiagonal + "\n" +
            "Key backlight: " + keyBacklight + "\n" +
            "Matee screen: " + hasMatteScreen);



        System.out.println("\n2. Расчёт стоимости товара со скидкой" + "\n" +
            "------------------------------------------------------------");

        int bookPrice = 200;
        int penPrice = 100;
        final int discountsPercent = 11;

        double discountAmount = (double) (bookPrice + penPrice) * discountsPercent / 100;
        double priceWithDiscount = bookPrice - penPrice - discountAmount;

        System.out.println("Discount amount: " + discountAmount + " "+ "RUB" + "\n" +
            "Price with discount: " + priceWithDiscount + " " + "RUB");

        System.out.println("\n3. Вывод на консоль слова JAVA" + "\n" +
            "--------------------------------------------------------------");

        System.out.println("   J    a  v     v  a" + "\n" + 
            "   J   a a  v   v  a a" + "\n" + 
            "J  J  aaaaa  V V  aaaaa" + "\n" +
            " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных" + "\n" +
            "-----------------------------------------------------------");

        byte num1 = 126;
        System.out.println("Initial number:" + " " + num1 + "\n" + 
            "Increment number:" + " " + ++num1 + "\n" + 
            "Decrement number:" + " " + --num1);

        short num2 = 32_760;
        System.out.println("\nInitial number:" + " " + num2 + "\n" + 
            "Increment number:" + " " + ++num2 + "\n" + 
            "Decrement number:" + " " + --num2);

        int num3 = 1_147_483_640;
        System.out.println("\nInitial number:" + " " + num3 + "\n" +
            "Increment number:" + " " + ++num3 + " \n" + 
            "Decrement number:" + " " + --num3);

        long num4 = 9_223_372_036_854_775_800L;
        System.out.println("\nInitial number" + " " + num4 + "\n" +
            "Increment number:" + " " + ++num4 +"\n" + 
            "Decrement number:" + " " + --num4);

        System.out.println("\n5. Перестановка значений переменных" + "\n" +
            "-------------------------------------------------------------");

        int num5 = 2;
        int num6 = 5;
        System.out.println("Swap two numbers using temporary variable" + "\n"+
            "Initial first number:" + " " + num5 + "\n" + 
            "Initial second number:" + " " + num6);

        int temp = num5;
        num5 = num6;
        num6 = temp;
        System.out.println("New value of the first number:" + " " + num5 + "\n" +
            "New value of the second number:" + " " + num6);

        System.out.println("\nSwap two numbers using arithmetic operations" + "\n" +
            "Initial first number:" + " " + num5 + "\n" +
            "Initial second number:" + " " + num6);

        num5 += num6;
        num6 = num5 - num6;
        num5 -= num6;
        System.out.println("New value of the first number:" + " " + num5 + "\n" +
            "New value of the second number:" + " " + num6);

        System.out.println("\nSwap two numbers using bitwise operations" + "\n" +
            "Initial first number:" + " " + num5 + "\n" +
            "Initial second number:" + " " + num6);

        num5 = num5 ^ num6;
        num6 = num5 ^ num6;
        num5 = num5 ^ num6;
        System.out.println("New value of the first number" + " " + num5 + "\n" +
            "New value of the second number:" + " " + num6);

        System.out.println("\n6.Вывод символов и их кодов" + "\n" + 
            "-----------------------------------------------------------");

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;

        System.out.println("Character code: " + (int) ch1 + " "+ "character: " + ch1 + "\n" +
        "Character code: " + (int) ch2 + " " + "character: " + ch2 + "\n" +
        "Character code: " + (int) ch3 + " " + "character: " + ch3 + "\n" +
        "Character code: " + (int) ch4 + " " + "character: " + ch4 + "\n" +
        "Character code: " + (int) ch5 + " " + "character: " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа" + "\n" +
            "-------------------------------------------------------------");

        int num7 = 123;
        int onesCount = num7 % 10;
        int tensCount = num7 / 10 % 10;
        int hundredsCount = num7 / 100 % 10;

        System.out.println("Number " + num7 + " " + "contains:" + "\n" +
            hundredsCount + " " + "hundreds" + "\n" +
            tensCount + " " + "tens" + "\n" +
            onesCount + " " + "ones");

        System.out.println("\n8. Вывод на консоль ASCII-aрт Дюка" + "\n" +
            "-----------------------------------------------------------");

        char ch6 = '/';
        char ch7 = '\\';
        char ch8 = ' ';
        char ch9 = '_';
        char ch10 = '(';
        char ch11 = ')';

        System.out.printf("%5c%2$c%n" +
            "%1$4c%3$c%3$c%2$c%n" +
            "%1$3c%4$c%5$c%3$c%6$c%2$c%n"+
            "%1$2c%3$c%3$c%3$c%3$c%3$c%3$c%2$c%n" +
            "%1$c%4$c%4$c%4$c%4$c%1$c%2$c%4$c%4$c%2$c", ch6, ch7, ch8, ch9, ch10, ch11);

        System.out.println("\n9. Произведение и сумма цифр числа"+ "\n"+
            "------------------------------------------------------------");

        int srcNum = 345;
        int srcNumDigit1 = srcNum % 10;
        int srcNumDigit2 = srcNum / 10 % 10;
        int srcNumDigit3 = srcNum / 100;
        int digitsSum = srcNumDigit1 + srcNumDigit2 + srcNumDigit3;
        int digitsMultiplication = srcNumDigit1 * srcNumDigit2 * srcNumDigit3;

        System.out.println("The figure of " + srcNum + " " + "=" + " " + digitsSum + "\n" +
            "Multiplication digit number " + srcNum + " " + "=" + " " + digitsMultiplication);

        System.out.println("\n10. Преобразование секунд" + "\n"+
            "----------------------------------------------------------");

        int secondsSrcCount = 86399;
        final int secondsInHourCount = 3600;
        final int secondsInMinute = 60;
        int hoursCount = secondsSrcCount / secondsInHourCount;
        int secondsRemainder = secondsSrcCount - hoursCount * secondsInHourCount;
        int minutesCount = secondsRemainder / secondsInMinute;
        int secondsCount = secondsRemainder - minutesCount * secondsInMinute;

        System.out.println(hoursCount + ":" + minutesCount + ":" + secondsCount);
    }
}