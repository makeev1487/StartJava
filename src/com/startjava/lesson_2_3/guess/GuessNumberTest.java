package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first player name: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Enter second player name: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                game.start();
            }

            System.out.print("Want to contine calculations [yes/no]: ");
            answer = scanner.nextLine();

            if (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Answer is not correct");
            }
        } while(!"no".equals(answer));
    }
}