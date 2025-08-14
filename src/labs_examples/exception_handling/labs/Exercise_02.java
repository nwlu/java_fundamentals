package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class TryAgain {
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
        catch (Exception e) {
            System.out.println("You can't divide a number by 0");
        }
    }
}

