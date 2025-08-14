package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
class Try {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 0;

        try{
            int x = a / c;
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught " + e.toString());
        }
    }
}
