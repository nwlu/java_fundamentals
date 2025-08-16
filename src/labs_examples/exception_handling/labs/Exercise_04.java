package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class NestedTryCatch{
    public static void main(String[] args) {
        try{
            int[] nums = {16, 24, 89, 1, 23, 8, 24};
            System.out.println("The number at index 5 is " + nums[5]);

            try{
                int div = nums[1] / 0;
                System.out.println(div);
            }
            catch(ArithmeticException x){
                System.out.println("Dividing by 0 is not allowed");
            }
            System.out.println("Let's keep going");
            System.out.println("Let's divide some other numbers " + nums[1] / nums[10]);
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Array Index Out of Bounds Exception caught");
        }
        finally{
            System.out.println("At the end of the program");
        }
    }
}
