package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        double height = 3.25;

        if (height < 3.5){
            throw new IllegalArgumentException("Must be this tall to ride...whomp whomp");
        }
        System.out.println("You are tall enough for this ride! Yay!");
    }

}