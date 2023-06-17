/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        javaMath();
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

        System.out.println("---Java Math ---");
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
}