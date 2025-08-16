package labs_examples.exception_handling.labs;

import videos_source_code.arrays.ArrayLists;

import java.util.ArrayList;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class TryAgainAgain {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 0;

        ArrayList
        try{
            int x = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught " + e.toString());
        }
        catch (Exception e) {
            System.out.println("You can't divide a number by 0");
        }
        finally {
            System.out.println("This method will always execute");
        }
    }
}