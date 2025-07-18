package labs_examples.objects_classes_methods.labs.methods;

public class BasicCalculator {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int sum = calc.add(2, 2);
        System.out.println("sum of 2 + 2 is " + sum);

        // uncomment the following lines as you create the
        // corresponding methods to test them

        int result = calc.subtract(10, 2);
        System.out.println("result of 10 minus 2 is " + result);
        // System.out.println("result of 10 + 2 is " + result);

        int product = calc.multiply(5, 5);
        System.out.println("product of 5 * 5 is " + product);

        int value = calc.divide(10, 2);
        System.out.println("value of 10 / 2 is " + value);
        // ...
    }
}
