public class VariablesTheme {
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
        double discountPrice = bookPrice + penPrice - discountAmount;

        System.out.println("Discount amount: " + discountAmount + " "+ "RUB" + "\n" +
                "Price  discount: " + discountPrice + " " + "RUB");

        System.out.println("\n3. Вывод на консоль слова JAVA" + "\n" +
                "--------------------------------------------------------------");

        System.out.println("   J    a  v     v  a" + "\n" + 
                "   J   a a  v   v  a a" + "\n" + 
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных" + "\n" +
                "-----------------------------------------------------------");

        byte num1 = 127;
        System.out.println("Initial number:" + " " + num1 + "\n" + 
                "Increment number:" + " " + ++num1 + "\n" + 
                "Decrement number:" + " " + --num1);

        short num2 = 32_767;
        System.out.println("\nInitial number:" + " " + num2 + "\n" + 
                "Increment number:" + " " + ++num2 + "\n" + 
                "Decrement number:" + " " + --num2);

        int num3 = 2_147_483_647;
        System.out.println("\nInitial number:" + " " + num3 + "\n" +
                "Increment number:" + " " + ++num3 + " \n" + 
                "Decrement number:" + " " + --num3);

        long num4 = 9_223_372_036_854_775_807L;
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

        num5 ^= num6;
        num6 ^= num5;
        num5 ^= num6;
        System.out.println("New value of the first number:" + " " + num5 + "\n" +
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
        int ones = num7 % 10;
        int tens = num7 / 10 % 10;
        int hundreds = num7 / 100;

        System.out.println("Number " + num7 + " " + "contains:" + "\n" +
                hundreds + " " + "hundreds" + "\n" +
                tens + " " + "tens" + "\n" +
                ones + " " + "ones");

        System.out.println("\n8. Вывод на консоль ASCII-aрт Дюка" + "\n" +
                "-----------------------------------------------------------");

        char forwardSlash = '/';
        char backSlash = '\\';
        char space = ' ';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.printf("%5c%2$c%n" +
                "%1$4c%3$c%3$c%2$c%n" +
                "%1$3c%4$c%5$c%3$c%6$c%2$c%n"+
                "%1$2c%3$c%3$c%3$c%3$c%3$c%3$c%2$c%n" +
                "%1$c%4$c%4$c%4$c%4$c%1$c%2$c%4$c%4$c%2$c",
                forwardSlash, backSlash, space, underscore, openParenthesis, closeParenthesis);

        System.out.println("\n\n9. Произведение и сумма цифр числа"+ "\n"+
                "------------------------------------------------------------");

        int sumDigits = ones + tens + hundreds;
        int prodDigits = ones * tens * hundreds;

        System.out.println("The figure of " + num7 + " " + "=" + " " + sumDigits + "\n" +
                "Multiplication digit number " + num7 + " " + "=" + " " + prodDigits);

        System.out.println("\n10. Преобразование секунд" + "\n"+
                "----------------------------------------------------------");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int secondsRemainder = totalSeconds % 3600;
        int minutes = secondsRemainder / 60;
        int seconds = secondsRemainder % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}