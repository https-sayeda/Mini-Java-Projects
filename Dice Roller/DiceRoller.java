import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        
        //declaring variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        //user input
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //validating input
        if (numOfDice > 0){
            //rolling the dice
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                //get total
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }
    //method to display ascii art
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
        """;;
        String dice2 = """
                 -------
                |●      |
                |       |
                |      ●|
                 -------
        """;;
        String dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
        """;;
        String dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
        """;;
        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
        """;;
        String dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
        """;;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
