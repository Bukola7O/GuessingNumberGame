package org.example;

import java.util.Random;

public class GuessGame {
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_NUMBER = 100;
    private int secretNumber;
    private int attempts;

    public GuessGame() {
        startNewGame();
    }

    public void startNewGame() {
        Random random = new Random();
        secretNumber = random.nextInt(MAX_NUMBER) + 1;
        attempts = 0;
    }

    public boolean makeGuess(int guess) {
        attempts++;
        if (guess == secretNumber || attempts >= MAX_ATTEMPTS) {
            return true;
        } else if (guess < secretNumber) {
            System.out.println("The secret number is higher than your guess.");
        } else {
            System.out.println("The secret number is lower than your guess.");
        }
        return false;
    }

    public boolean isGameOver() {
        return attempts >= MAX_ATTEMPTS;
    }

    public int getTotalAttempts() {
        return attempts;
    }

    public int calculateScore() {
        return MAX_ATTEMPTS - attempts;
    }
}
