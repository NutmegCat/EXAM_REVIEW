/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        booleanTF();
        comparisonOperators();
        testForBooleansAndComparisonOperators();
        compareStrings();
    }

    public static void booleanTF() {
        /*
         * Boolean variables are used to store a true or false value.
         ? Commonly used for loops
         */

        System.out.println("---Boolean Variables---");

        boolean x = true;
        boolean y = false;
        System.out.println("x is " + x + " and y is " + y);
    }

    public static void comparisonOperators() {
        /*
         * Comparison operators are used to compare two values by combining multiple operators.
         ? Eg. 30 > 20, 10 < 20, 10 <= 20, 10 >= 20, 5 != 10, 5 == 5,  
         */
        
        System.out.println("\n---Comparison Operators---");

        boolean x = 2 + 3 < 2 * 3;
        System.out.println("x is " + x);
    }

    public static void testForBooleansAndComparisonOperators() {
        System.out.println("\n---Test For Booleans and Comparison Operators---");   

        boolean perhaps, maybe;
        perhaps = 4 < 5;
        maybe = -17 % 4 == 1;
        System.out.println("perhaps: " + perhaps);
        System.out.println("maybe: " + maybe);
    }

    public static void compareStrings() {
        /*
         * We have two ways to compare strings. 
         ? First, we can use "equals" 
         ? Second, we can use "compareTo".
         */
        
        System.out.println("\n---Compare Strings---");

        //! equals
        System.out.println("--> Equals");
        String s = "Same";
        boolean x1 = s.equals("Same"); // true
        boolean y1 = s.equals("same"); // false because "s" is not upper case
        boolean z1 = s.equals("Same "); // false because there's a blank space

        System.out.println("x is " + x1 + " and y is " + y1 + " and z is " + z1);

        //! compareTo
        System.out.println("--> Compare To");
        String cab = "cab";
        boolean x2 = "car".compareTo(cab) < 0;
        boolean y2 = "Cab".compareTo(cab) < 0;
        System.out.println("x is " + x2 + " and y is " + y2);
    }
}