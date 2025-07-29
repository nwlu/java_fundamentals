package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

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

        int n = 62;

        if(isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else{
            System.out.println(n + " is not a prime number.");
        }

        int[] sampleArray = {4, 7, 1, 9, 2, 6};
        int[] result = minMaxArray(sampleArray);

        System.out.println("Lowest number: " + result[0]);
        System.out.println("Highest number: " + result[1]);

        int maxNum = 100;
        int divisor1 = 3;
        int divisor2 = 5;

        ArrayList<Integer> list = divisibleArrayList(maxNum, divisor1, divisor2);

        System.out.println("Numbers divisible by " + divisor1 + " and " + divisor2 + ": " + list);
        System.out.println("Length of the list: " + list.size());

        int[] numList = {1, 2, 3, 4, 5};

        System.out.println("Before reversal:");
        for (int nums : numList) {
            System.out.print(nums + " ");
        }

        reverseArray(numList);

        System.out.println("\nAfter reversal:");
        for (int nums : numList) {
            System.out.print(nums + " ");
        }
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
    public static boolean isPrime(int n) {
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

    //Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //            which is passed in as an argument
    public static int[] minMaxArray(int [] num){
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            } else if (num[i] > max) {
                max = num[i];
            }
        }
        return new int[]{min, max};
    }
    //Exercise 7
    public static ArrayList<Integer> divisibleArrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
    //Exercise 8
    public static void reverseArray(int[] arr) {
        int temp;  // Only one extra variable
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap values
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move indices toward the center
            left++;
            right--;
        }
    }
}
