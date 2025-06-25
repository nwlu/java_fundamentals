package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        double d = 3.14;
        System.out.println("double d is the same is pi, which is " + d);
        byte b = -128;
        System.out.println("byte b is " + b);
        boolean x = true;
        System.out.println("boolean x is " + x);
        long l = 123456789987654L;
        System.out.println("long l is " + l);
        float f = 12.34F;
        System.out.println("float f is " + f);
        char c = 'D';
        System.out.println("char c is " + c);
        short s = 3785;
        System.out.println("short s is " + s);
    }

}
