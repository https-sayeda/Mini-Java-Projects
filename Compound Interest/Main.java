import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declaring variables
        double principal; //initial investment
        double rate;
        int timesCompounded;
        int years;
        double amount;

        //user input
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100; //divide by 100 since its in %
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        //calculating the amount
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        //System.out.println("The amount after " + years + " is: £" + amount);
        System.out.printf("The amount after %d years is £%.2f", years, amount);
        scanner.close();
    }
}
