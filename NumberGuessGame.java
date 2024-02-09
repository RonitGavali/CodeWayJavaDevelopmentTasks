import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int attemptsLimit = 5;
        int totalScore = 0; 

        System.out.println("Welcome to the Number Guessing Game!!!!!");

        while (true) {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");
            
            while (attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                
                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    totalScore++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                
                attempts++;
            }
            
            if (attempts == attemptsLimit) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing! Your total score is " + totalScore + ".");
                break;
            }
        }
        
        scanner.close();

    }
    
}
