package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int t = 0; t < 20; t++ ) {
            if (t == 12){
                break;
            }
            System.out.println("We're at " + t);
        }
    }
}
