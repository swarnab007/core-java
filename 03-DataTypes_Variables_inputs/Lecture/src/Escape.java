public class Escape {
    public static void main(String[] args) {

        // \b - Backspace (removes previous character if possible)
        System.out.println("Hello\bKGCoding..."); // Output: HellKGCoding...

        // \t - Tab (horizontal tab space)
        System.out.println("Name:\tSwarnab"); // Output: Name:    Swarnab

        // \n - New Line
        System.out.println("This is line one.\nThis is line two.");

        // \" - Double quote
        System.out.println("He said, \"Keep coding!\"");

        // \' - Single quote
        System.out.println("It\'s a great day to code!");

        // \\ - Backslash
        System.out.println("This is a backslash: \\");

        // \r - Carriage return (overwrites from beginning of line)
        System.out.println("12345\rABC"); // Output: ABC45 (on most systems)

        // \f - Form feed (used in printers, may not show effect in console)
        System.out.println("Hello\fWorld"); // Output may vary or not be visible

        // Combining multiple sequences
        System.out.println("Name:\t\"Swarnab\"\nRole:\tProgrammer\nPath:\\Users\\Swarnab");

    }
}

