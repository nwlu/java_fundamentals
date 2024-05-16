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
        //Volume of a cylinder with radius of 3.14 and height of 5 = pi * radius(squared) * height
        int h = 5;
        double r = 3.14;
        double pi = 3.14;
        double rsq = r * r;

        double volume = rsq * pi * h;
        System.out.println(volume);

        //Surface area is 2 * pi * radius * h + 2 * pi * radius(squared)
        double sf = 2 * pi * r * h + 2 * pi * (r * r);
        System.out.println(sf);
    }
}