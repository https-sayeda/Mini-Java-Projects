// needed for user inputs
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating scanner object using scanner class

        //initiliasing the variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        //prompting user input and storing
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: "); 
        adjective3 = scanner.nextLine();

        //displaying the final story
        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close(); //make sure to close the scanner
    }
}
