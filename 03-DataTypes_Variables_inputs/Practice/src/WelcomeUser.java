import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // Input name from user
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Full-line string input

        // Display welcome message
        System.out.println("Welcome " + name + " to KG Coding");

        input.close(); // Close scanner
    }
}
