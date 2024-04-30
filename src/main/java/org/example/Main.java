package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guess the Number Game!");

        GuessGame game = new GuessGame();

        while (!game.isGameOver()) {
            System.out.println("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            boolean isCorrect = game.makeGuess(guess);

            if (isCorrect) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Total attempts: " + game.getTotalAttempts());
                System.out.println("Score: " + game.calculateScore());
                game.startNewGame();
            } else {
                System.out.println("Incorrect guess. Try again!");
            }
        }

        scanner.close();
    }
}