package CodSoft_Task1;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1, upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("Guess the number between " + lowerBound + " and " + upperBound);
        
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
                break;
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            attempts--;
            System.out.println("Attempts left: " + attempts);
        }
        
        if (!guessedCorrectly) {
            System.out.println("Out of attempts! The correct number was: " + randomNumber);
        }
}
}