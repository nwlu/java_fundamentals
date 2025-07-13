package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        double avg;

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number: " + (i + 1) + ": ");
            num[i] = in.nextInt();
        }
        for (int n : num) {
            sum += n;
        }
        avg = (double) sum / num.length;

        System.out.println("Sum of numbers entered: " + sum);
        System.out.println("Average of numbers entered: " + avg);
    }

}