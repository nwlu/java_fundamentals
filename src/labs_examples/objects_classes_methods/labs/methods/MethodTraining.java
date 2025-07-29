package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    //Exercise 1
    public static int muliply(int a, int b) {
        return a * b;
    }

    public static int multiply(double a, double b) {
        return (int) ((int) a * b);
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //Exercise 2 Pass by Value
    public static int passByValue(int zebra) {
        zebra = zebra * 10;
        System.out.println(zebra);
        return zebra;
    }

    public static void main(String[] args) {
        int y = 5;
        y = passByValue(y);
        System.out.println(y);

        Cat cat = new Cat();
        cat.name = "Sylvester";

        passByReference(cat);
        System.out.println(cat.name);

        int a = 5;
        int b = 15;
        int c = 3;
        int d = 25;

        int num = numbers(a, b, c, d);
        System.out.println("The largest number is " + num);

        String test = "Java is getting easier!";
        System.out.println("Consonants: " + consonants(test));
    }

    //Exercise 2 Pass by Reference
    public static void passByReference(Cat cat) {
        cat.name = "Garfield";
    }

    //Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int numbers(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }
        int testNumber = 29;
        if(primeNumber(testNumber)){
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }
        

    //Write a method to count all consonants (the opposite of vowels) in a String
    public static int consonants(String letters) {
        int count = 0;
        letters = letters.toLowerCase();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            if (Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    //Write a method that will determine whether or not a number is prime
    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Divisible by something other than 1 and itself
            }
        }
        return true; // No divisors found, it's prime
    }

}
