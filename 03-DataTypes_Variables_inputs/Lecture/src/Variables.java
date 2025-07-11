
public class Variables {
        public static void main(String[] args) {

            // ---------------- INTEGER DATA TYPES ----------------

            // int (Integer): Stores whole numbers, positive or negative, without decimals. Size: 4 bytes
            int myNumber = 865;             // Variable with camelCase naming
            int myNUMBER = 865;             // Variable with different casing (Java is case-sensitive)
            int yourNumber = 0;             // Initially assigned 0

            int asdf987 = 8;                // Valid variable name with letters and numbers
            int uh87d87yyd87 = 90;          // Another valid identifier, but not meaningful (avoid such names in real use)

            // Printing and updating int values
            System.out.println(yourNumber); // Prints 0
            yourNumber = 865;               // Updating value
            System.out.println(yourNumber); // Prints 865
            yourNumber = 45;                // Updating again
            System.out.println(yourNumber); // Prints 45

            // ---------------- FLOATING POINT DATA TYPES ----------------

            // float: Stores fractional numbers. Size: 4 bytes. Must end with 'f' or 'F'
            float myFloat = 5.0f;
            System.out.println(myFloat);    // Prints 5.0

            // double: Stores fractional numbers with double precision. Size: 8 bytes
            double myDouble = 6.98766;      // More precise than float

            // ---------------- BOOLEAN DATA TYPE ----------------

            // boolean: Stores only true or false. Size: ~1 bit logically
            boolean isVegetarian = true;
            System.out.println(isVegetarian);  // Prints true

            // ---------------- STRING AND CHARACTER DATA TYPES ----------------

            // String: Stores a sequence of characters (text). Not a primitive type but a class.
            String wishes = "Good Morning";
            System.out.println(wishes);     // Prints "Good Morning"

            // char: Stores a single character. Size: 2 bytes (Unicode character)
            char myCharacter = 'K';         // Note: use single quotes for char

            // You can print the character if you want
            System.out.println(myCharacter);  // Prints K
        }
    }

