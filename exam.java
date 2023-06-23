/* This is an exam review for ICS3U1 */

class exam { // All Java programs are contained in a class. The name *exam* is the name of the class.
    public static void main(String[] args) {
        howToArray();
        arrayExample();
        multiArray();
    }

    public static void howToArray() {
        double[] price = new double[5];
        price[0] = 1;
        price[1] = 2;
        price[2] = 3;
        price[3] = 4;
        price[4] = 5;
        System.out.println(price[0] + " " + price[1] + " " + price[2] + " " + price[3] + " " + price[4]);
    }

    public static void arrayExample() {
        String[] cars = {"Volvo", "BMW", "Mercedes", "Audi"};
        System.out.println(cars[0] + " " + cars[1] + " " + cars[2] + " " + cars[3]);
    }
    
    public static void multiArray() {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9] + numbers[10] + numbers[11]);
        int arrayAddition = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9] + numbers[10] + numbers[11];
        int addition = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12;
        
        if (arrayAddition == addition) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}