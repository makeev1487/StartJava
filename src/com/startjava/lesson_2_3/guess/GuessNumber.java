package com.startjava.lesson_2_3.guess;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        while(true) {
            System.out.print(player1.getName() + " enter a number: ");
            int playerNumber = scanner.nextInt();

            if (playerNumber == randomNumber) {
                System.out.println(player1.getName() + " guessed number " + playerNumber);
                break;
            }

            if (playerNumber > randomNumber) {
                System.out.println("Number should be smaller " + playerNumber);
            } else {
                System.out.println("Number should be larger " + playerNumber);
            }

            System.out.print(player2.getName() + " enter a number: ");
            playerNumber = scanner.nextInt();

            if (playerNumber == randomNumber) {
                System.out.println(player2.getName() + " guessed number " + playerNumber);
                break;
            }

            if (playerNumber > randomNumber) {
                System.out.println("Number should be smaller " + playerNumber);
            } else {
                System.out.println("Number should be larger " + playerNumber);
            }
        }
    }
}