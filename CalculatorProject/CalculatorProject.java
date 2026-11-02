package CalculatorProject;

import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declaring variables
        double num1;
        double num2;
        char operator;
        double result = 0; 
        // set it to 0 since if there are no matching cases, 
        // result still needs to be initialised
        boolean validOperation = true;

        //user input
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        //using enhanced switch to determine the operator
        switch(operator) {
            case '+' -> result = num1 + num2; //single quotes since working w/ character
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by 0!");
                    validOperation = false; //prevents result being displayed
                } else {
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2);
            default -> { //if none of the above cases apply
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}
