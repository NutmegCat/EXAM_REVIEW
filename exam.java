/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        firstProgram();
        advice();
        escapeCharacters();
        integerTypes();
        assigningValuesToVariables();
        stringType();
    }

    public static void firstProgram() {
        System.out.println("\n---First program---");
        System.out.println("Hello, World!"); // This is a statement. This prints out "Hello, World!"
    }

    public static void advice() {
        System.out.println("\n---Print a statement---");

        System.out.print("If at first ");
        System.out.println("you don't succeed" + ","); // The plus indicates a concatenation.
        System.out.print("failure may be ");
        System.out.println("your style");
    }

    public static void escapeCharacters() {
        System.out.println("\n---Escape characters---");
        System.out.println("A backslash is \\\nand a double quote is \"."); // The backslash indicates an escape character.
    }

    public static void integerTypes() {
        /* 
          * The four integer types are: byte, short, int, long.
          
          ? The byte type is a signed 8-bit integer.
          ? The short type is a signed 16-bit integer.
          ? The int type is a signed 32-bit integer.
          ? The long type is a signed 64-bit integer.

          * These four data types cannot be -ve or have decimal values.
          * Illegal values include: 37.0, -12 562, and 1,233,985

          ? The largest value of a byte type is 127
          ? The largest value of a short type is 32765
          ? The largest value of an int type is 2147483647
          ? The largest value of a long type is 92233720368547758071
         */

        byte a = 127;
        short b = 32765;
        int c = 2147483647;
        long d = 9223372036854775807l;

        System.out.println("\n---Integer types---");

        System.out.println("The value of the byte type a is: " + a);
        System.out.println("The value of the short type b is: " + b);
        System.out.println("The value of the int type c is: " + c);
        System.out.println("The value of the long type d is: " + d);

        /*
         * Other primitive types are float, double and char.
         ? The float type is a 32-bit floating point number (can have decimal values and -ve).
         ? The double type is a 64-bit floating point number (can have decimal values and -ve).
         ? The char type is a 16-bit character, this cannot hold numbers. 

         * Floating point numbers can be in scientific notation
         
         ? The largest value of a float type is 3.4028235e+38
         ? The largest value of a double type is 1.7976931348623157e+308
         */

        double e = 1.7976931348623157E308;
        float f = 3.4028235e38f;
        float scientificNotation = 6e6f;
        char z = 'z'; // The char type must have single quotes.

        System.out.println("\n---Other primitive types---");

        System.out.println("The value of the float type e is: " + e);
        System.out.println("The value of the float type f is: " + f);
        System.out.println("The value of the float type scientificNotation is: " + scientificNotation);
        System.out.println("The value of the char type z is: " + z);
    }
    public static void assigningValuesToVariables() {
        // Here are the different ways to assign values to variables.

        int i = 10;
        double x = 10.0, y = 56.42; // The values of the double type will be stored into the assigned variables (x and y).

        System.out.println("\n---Assigning values to variables---");

        System.out.println("The value of the variable i is: " + i);
        System.out.println("++++++++++++++++");
        System.out.println("--> The value x and y are combined in a single double call");
        System.out.println("The value of the variable x is: " + x);
        System.out.println("The value of the variable y is: " + y);
    }
    public static void stringType() {
        //* A string type holds a sentence
        //! STRINGS ARE IMMUTABLE (they can't be changed after declaration)

        String s; // The string is declared but it doesn't have a value.
        s = "Hello, World!"; // The string is assigned a value.

        System.out.println("\n---String type---");
        System.out.println("The value of the string s is: " + s);
    }
}