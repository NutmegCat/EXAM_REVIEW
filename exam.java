/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        firstProgram();
        advice();
        escapeCharacters();
    }

    public static void firstProgram() {
        System.out.println("\nHello, World!"); // This is a statement. This prints out "Hello, World!"
    }

    public static void advice() {
        System.out.print("\nIf at first ");
        System.out.println("you don't succeed" + ","); // The plus indicates a concatenation.
        System.out.print("failure may be ");
        System.out.println("your style");
    }

    public static void escapeCharacters() {
        System.out.println("\nA backslash is \\\nand a double quote is \"."); // The backslash indicates an escape character.
    }
}