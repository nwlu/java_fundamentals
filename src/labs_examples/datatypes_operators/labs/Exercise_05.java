package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        boolean c = true;
        boolean d = true;
        if (c & d){
            System.out.println("c and d is true");
        }
        if (a && a){
            System.out.println("a is true");
        }
        if (a | b){
            System.out.println("either a or b is true");
        }
        if (a || b){
            System.out.println("a is true but b is false");
        }
        if (a ^ b){
            System.out.println("one of these is true but not the other");
        }
        if (!b){
            System.out.println("if not b then a");
        }
    }

}

