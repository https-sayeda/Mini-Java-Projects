import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declaring variables
        String item;
        double price;
        int quantity;
        char currency = '£';
        double total; 

        //prompting user for inputs
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        //calculating total + outputting
        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
