package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        long result = getSecondsInYears(3650);
        System.out.println(result);
        int l1 = varArgsLength();
        int l2 = varArgsLength("Anything");
        int l3 = varArgsLength("one", "two", "3");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        int x = multiply(5, 7);
        System.out.println(divide(13, 6));

        jokeOfTheDay();
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b){
        return (double) a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void jokeOfTheDay(){
        System.out.println("Dad jokes are how eye roll");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long getSecondsInYears(int years){
        int secsInYear = 31536000;
        long result = (long) secsInYear * years;
        return result;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgsLength(String... args){
        int length = args.length;
        for (String arg : args){
            System.out.println(arg);
        }
        return length;
    }





}
