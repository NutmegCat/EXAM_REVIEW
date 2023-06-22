/* This is an exam review for ICS3U1 */

class exam { // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        System.out.println("Please enter your letter: ");
        System.out.print("  >  ");
        char c = In.getChar();

        int position = c - 64; // 64 is the ASCII value of 'A'

        System.out.println();
        System.out.println(c + " is at position " + position + " in the alphabet.");
    }
}