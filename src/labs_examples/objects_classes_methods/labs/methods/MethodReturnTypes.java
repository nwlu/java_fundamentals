package labs_examples.objects_classes_methods.labs.methods;

public class MethodReturnTypes {
        public static void main(String[] args) {

            // create the four methods as instructed below
            // then call each method from here within the main()
            int a = 2;
            int b = 3;
            int c = 8;
            int d = 4;
            int num = 25;
            int num2 = 12;

            int x = multiply(a,b);
            int z = divide(c,d);
            //int y = isOdd(int num);

            System.out.println(x);
            System.out.println(z);
            System.out.println(num + " is odd " + isOdd(num));
            System.out.println(num2 + " is odd " + isOdd(num));
            System.out.println(msg("programming is cool"));
        }

        // write a static multiply() method below that takes
        // two parameters and returns the result of
        // multiplying them together
        public static int multiply(int a, int b) {
            return a * b;
        }

        // write a static divide() method below that takes
        // two parameters and returns the result of
        // dividing the first parameter by the second
        public static int divide(int c, int d) {
            return c / d;
        }

        // write a static isOdd(int num) method
        // param and returns true if "num" is odd
        public static boolean isOdd(int num) {
            return num % 2 !=0;
        }

        // write a method that will accept a String argument
        // and return that String in reverse order
        // For instance, if you pass in the String
        // "programming is cool" the method will return
        // the String "looc si gnimmargorp"
        public static String msg(String inputString) {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }
    }

