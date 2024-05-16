package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int i = 1001;
        float j = 1001.0012f;
        if (i < j){
            System.out.println("i is less than j");
        }
        int k = 1001;
        float l = 1001.0012f;
        if (k <= l){
            System.out.println("l is greater than k");
        }
        int m = 56;
        int n = 89;
        if (n > m){
            System.out.println("m is not greater than n");
        }
        int o = 67;
        int p = 67;
        if (o >= p){
            System.out.println("o is greater than or equal to p");
        }
        int q = 23;
        int r = 23;
        if (q == r){
            System.out.println("q and r are equal");
        }
    }

}

