/* This is an exam review for ICS3U1 */

class exam{ // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        javaMath();
        printing();
        incrementAndDecrement();
        arithmeticAndCharacters();
        mathMethods();
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

    public static void mathMethods() {
        /*
         * There are 17 math methods in java. They are:
         ? Math.abs(), Math.sqrt(), Math.pow(), Math.max(), Math.min(), Math.ceil(), Math.floor(), Math.random(), Math.sin(), Math.cos(), 
         ? Math.tan(), Math.asin(), Math.acos(), Math.atan(), Math.exp(), and Math.log().

         * In examples below
         */

        System.out.println("\n---Math Methods---"); 

        // Math.abs()
        double x = Math.abs(-10);
        System.out.println("The absolute value of -10 is: " + x);

        // Math.sqrt()
        double y = Math.sqrt(16);
        System.out.println("The square root of 16 is :" + y);

        // Math.pow()
        double z = Math.pow(2, 3);
        System.out.println("The power of 2 to the power of 3 is: " + z);

        // Math.max()
        double max = Math.max(10, 20);
        System.out.println("The maximum of 10 and 20 is: " + max);

        // Math.min()
        double min = Math.min(10, 20);
        System.out.println("The minimum of 10 and 20 is: " + min);

        // Math.ceil()
        double ceil = Math.ceil(10.5);
        System.out.println("The ceiling of 10.5 is: " + ceil);

        // Math.floor()
        double floor = Math.floor(10.5);
        System.out.println("The floor of 10.5 is: " + floor);

        // Math.random()
        double random = Math.random();
        System.out.println("The random number is: " + random);

        // Math.sin()
        double sin = Math.sin(Math.PI / 4);
        System.out.println("The sine of the angle pi/4 is: " + sin);

        // Math.cos()
        double cos = Math.cos(Math.PI / 4);
        System.out.println("The cosine of the angle pi/4 is: " + cos);

        // Math.tan()
        double tan = Math.tan(Math.PI / 4);
        System.out.println("The tangent of the angle pi/4 is: " + tan);

        // Math.asin()
        double asin = Math.asin(1);
        System.out.println("The arcsine of 1 is: " + asin);

        // Math.acos()
        double acos = Math.acos(-1);
        System.out.println("The arccosine of -1 is: " + acos);
        
        // Math.atan()
        double atan = Math.atan(10);
        System.out.println("The arctangent of 10 is: " + atan);

        // Math.exp()
        double exp = Math.exp(10);
        System.out.println("The exponential of 10 is: " + exp);

        // Math.log()
        double log = Math.log(10);
        System.out.println("The natural logarithm of 10 is: " + log);
    }
}