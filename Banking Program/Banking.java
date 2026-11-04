import java.util.Scanner;

public class Banking {

    //class scope, this allows all methods to use scanner
    //static since static methods are using it
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        //declaring variables
        double balance = 67;
        boolean isRunning = true;
        int choice;

        //program only runs while user hasn't chosen to exit
        while(isRunning) {

            //displaying menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            //user input
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        //exit message
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }

    //method to display balance
    //static method since it'll be called from a static method
    static void showBalance(double balance){
        System.out.printf("£%.2f\n", balance);
    }

    //method to make deposit
    static double deposit(){
        double amount; //local variable
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0; //method needs to return something
        }
        else{
            return amount;
        }
    }
    
    //method to withdraw funds
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}
