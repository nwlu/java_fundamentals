package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int [][] array2D = new int [5][5];
        int multipleOf = 3;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = multipleOf;
                multipleOf += 3;
            }
        }
        System.out.println("Results of a 5x5 array by multiples of 3");
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D.length; j++){
                System.out.printf("%4d", array2D[i][j]);
            }
            System.out.println();
        }
    }
}
