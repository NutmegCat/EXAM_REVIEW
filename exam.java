/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        javaMath();
        printing();
        incrementAndDecrement();
        arithmeticAndCharacters();
    }

    public static void javaMath() {
        /*
         * Math in java is almost similar to PEMDAS.
         * It has the same operators as PEMDAS plus mod ('%').
         ? Mod takes the remainder of the division.

         * An example of java math is:
         ? 4 + 3 * (5 - 6 / 2)
         ? --> 4 + 3 * (5 - 3)
         ? --> 4 + 3 * 2
         ? --> 4 + 6
         ? --> 10
         */

        System.out.println("---Java Math---");
        System.out.println("\nAn example of java math is:");
        System.out.println("4 + 3 * (5 - 6 / 2)");
        System.out.println(" --> 4 + 3 * (5 - 3)");
        System.out.println(" --> 4 + 3 * 2");
        System.out.println(" --> 4 + 6");
        System.out.println(" --> 10");
        
        int equation = 4 + 3 * (5 - 6 / 2);
        System.out.println("\nAssigned \"int equation\" as \"4 + 3 * (5 - 6 / 2)\".");
        System.out.println("The answer to \"4 + 3 * (5 - 6 / 2)\" is : " + equation);
    }

    public static void printing() {
        System.out.println("\n---Printing---");
        int m = 3, n = 4;
        System.out.println("m is 3 and n is 4."); 
        System.out.println("m: " + m);
        System.out.println(m + n);
        System.out.println("m" + "n");
        System.out.println("m + n = " + m + n);
        System.out.println("m + n = " + (m + n));
        System.out.println("mn: " + m*n);
        System.out.println(m + n + "m + n");
        System.out.println(m + n + (m + n));
    }

    public static void incrementAndDecrement() {
        /*
         * n ++ and ++n are different
         * If a variable has a prefix operator, the variable is incremented or decremented first and this new value is used as the value of the expression.
         ? Example: if n is 1 and we did ++n, then the value of n would be 2.
         * If a variable has a postfix operator, the variable is incremented or decremented after the old value has been used as the value of the expression.
         ? Example: if n is 1 and we did n++, then the value of n would be 1, but it would print out 2
         */

        System.out.println("\n---Increment and Decrement---");
        
        byte n = 1;
        System.out.println(++n);
        System.out.println(n);
        System.out.println(n++);
        System.out.println(n);
    }

    public static void arithmeticAndCharacters() {
        System.out.println("\n---Arithmetic and Characters---");
        char c = 'A';
        System.out.println(c);
        c++; // increment
        System.out.println(c);
    }
}