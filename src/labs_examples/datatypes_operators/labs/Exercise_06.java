package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        //V=πr2h
        double p = 3.14;
        double r = 3.14;
        int h = 5;

        double v = (r*r)*p*h;
        System.out.println("Volume is: " + v);
    }
}