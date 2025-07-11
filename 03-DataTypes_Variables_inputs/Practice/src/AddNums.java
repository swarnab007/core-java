import java.util.Scanner;

public class AddNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // Input first number
        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // Integer input

        // Input second number
        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // Integer input

        // Calculate and display sum
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        input.close(); // Close scanner
    }
}
