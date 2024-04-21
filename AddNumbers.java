import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        //System.out.print("Enter the first number: ");
        double num1 = 6.89;

        // Prompt user to enter the second number
        //System.out.print("Enter the second number: ");
        double num2 = 5.23;

        // Close the scanner to prevent resource leak
        scanner.close();

        // Add the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
