import java.util.Scanner;
public class TempConverter {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declare variables
        double temp;
        double newTemp;
        String unit;

        //user input
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); //making sure unit is uppercase

        //using ternary operator --> (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        //displaying converted temperature
        System.out.printf("%.2f %s", newTemp, unit);

        scanner.close();
   } 
}
