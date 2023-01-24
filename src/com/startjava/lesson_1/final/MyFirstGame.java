public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNum = 33;
        int startRange = 0;
        int endRange = 100;
        int randomNum = 23;

        System.out.println("Number should be larger " + startRange + " and smaller " + (endRange + 1));

        while (hiddenNum != randomNum) {
            if (hiddenNum > randomNum) {
                System.out.println("Number should be larger " + startRange + " and smaller " + hiddenNum);
                endRange = hiddenNum - 1;
            } else {
                System.out.println("Number should be larger " + hiddenNum + " and smaller " + (endRange + 1));
                startRange = hiddenNum + 1;
            }
            hiddenNum = (startRange + endRange) / 2;
        }

        System.out.println(hiddenNum + " number guessed");
    }
}