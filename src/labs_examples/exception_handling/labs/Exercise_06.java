package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class FindIndex {
    public void findIndex() throws ArrayIndexOutOfBoundsException {
        int[] array = {2, 6, 23, 8, 24};
        System.out.println("Give me the number that is at index 10 " + array[10]);
    }

    public static void main(String[] args) {
        FindIndex obj = new FindIndex();

        try{
            obj.findIndex();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception caught");
        }
    }
}