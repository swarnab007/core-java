import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // ---------------- STRING INPUT ----------------
        System.out.print("Please enter your name: ");
        String name = input.nextLine(); // String input (full line)
        System.out.println("Good Morning " + name);

        // ---------------- INTEGER INPUT ----------------
        System.out.print(name + ", Also tell me your age: ");
        int age = input.nextInt(); // Integer input
        System.out.println("Your age is: " + age);

        // ---------------- FLOAT INPUT ----------------
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        float height = input.nextFloat(); // Float input
        System.out.println("Your height is: " + height + " meters");

        // ---------------- DOUBLE INPUT ----------------
        System.out.print("Enter your weight in kg (e.g., 65.5): ");
        double weight = input.nextDouble(); // Double input
        System.out.println("Your weight is: " + weight + " kg");

        // ---------------- BOOLEAN INPUT ----------------
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean(); // Boolean input
        System.out.println("Student status: " + isStudent);

        // ---------------- CHAR INPUT ----------------
        System.out.print("Enter the first letter of your favorite color: ");
        char colorInitial = input.next().charAt(0); // Char input (first character of string)
        System.out.println("Favorite color starts with: " + colorInitial);

        input.close(); // Close scanner
    }
}

