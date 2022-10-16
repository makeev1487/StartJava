import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1Name;
    private Player player2Name;

    public GuessNumber(Player player1Name, Player player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int hiddenNumber = 0;

        while(true) {
            System.out.print(player1Name.getName() + " enter a number: ");
            hiddenNumber = scanner.nextInt();

            if (hiddenNumber > randomNumber) {
                System.out.println("Number should be smaller " + hiddenNumber);
            } else if (hiddenNumber < randomNumber) {
                System.out.println("Number should be larger " + hiddenNumber);
            } else {
                System.out.println(player1Name.getName() + " guessed number " + hiddenNumber);
                break;
            }

            System.out.print(player2Name.getName() + " enter a number: ");
            hiddenNumber = scanner.nextInt();

            if (hiddenNumber > randomNumber) {
                System.out.println("Number should be smaller " + hiddenNumber);
            } else if (hiddenNumber < randomNumber) {
                System.out.println("Number should be larger " + hiddenNumber);
            } else {
                System.out.println(player2Name.getName() + " guessed number " + hiddenNumber);
                break;
            }
        }
    }
}