//package Number Guessing Game;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        //random object will generate random numbers
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //declaring variables
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); //setting range 

        //welcome message
        System.out.println("Number Guessing Game");

        //user input
        System.out.printf("Guess a number between %d-%d\n", min, max);

        //do while loop for game
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again.");
            } 
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again.");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }while(guess != randomNumber);

        scanner.close();


    }
}
