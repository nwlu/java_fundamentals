package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregularArray = new int[4][3];

        irregularArray[0] = new int[]{6, 5, 4, 3};
        irregularArray[1] = new int[]{10, 9, 3};
        irregularArray[2] = new int[]{23, 8, 30, 32};
        irregularArray[3] = new int[]{3, 54};

        System.out.println("Irregular array: ");

        for (int[] row : irregularArray){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
