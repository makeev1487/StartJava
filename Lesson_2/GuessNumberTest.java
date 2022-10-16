import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first player name: ");
        String name1 = scanner.nextLine();
        Player player1Name = new Player(name1);

        System.out.print("Enter second player name: ");
        String name2 = scanner.nextLine();
        Player player2Name = new Player(name2);

        GuessNumber game = new GuessNumber(player1Name, player2Name);

        String answer = "yes";

        do {
            if ("yes".equals(answer)){
                game.startGame();
            }

            System.out.print("Want to contine calculations [yes/no]: ");
            answer = scanner.nextLine();

            if (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Answer is not correct");
            }
        } while(!"no".equals(answer));
    }
}