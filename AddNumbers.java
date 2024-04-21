import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
       
        double num1 = 10.2;

        // Prompt user to enter the second number
        
        double num2 = 10.3;

        // Close the scanner to prevent resource leak
        scanner.close();

        // Add the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
