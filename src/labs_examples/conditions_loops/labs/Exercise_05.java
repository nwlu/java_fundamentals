package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter first number: ");
        // assign input to variable as int
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = 0;
        int count =0;

        for (int i = num1; i <= num2; i++){
            sum +=i;
            count++;
        }
        System.out.println("The sum of both numbers entered = " + sum);

        double avg = (double) sum / count;
        System.out.println("The average of both numbers entered = " + avg);
        }
    }


