public class MyFirstGame {
    public static void main(String[] args) {
        int num = 33;
        int startRange = 0;
        int endRange = 100;
        int randomNum = 23;

        while (true) {
            if (num > randomNum) {
                System.out.println("Number should be larger " + startRange + " and smaller " + num);

                endRange = num + 1;
            } else if (num < randomNum) {
                System.out.println("Number should be larger " + num + " and smaller " + endRange);

                startRange = num - 1;
            } else {
                System.out.println(num + " number guessed");
                return;
            }

            num = (startRange + endRange) / 2;
        }
    }
}