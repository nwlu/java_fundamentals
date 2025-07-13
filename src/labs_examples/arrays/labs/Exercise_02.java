package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Enter a number from 1 - 10: ");

        // write code here
        int enterednum = input.nextInt();
        int found = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == enterednum) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println("The number you entered " + enterednum + " is at index " + found);
        } else {
            System.out.println("The number you entered " + enterednum + " is not found");
        }
    }
}