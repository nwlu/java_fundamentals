package labs_examples.static_nonstatic.labs;

public class StaticMethods2 {
    public static void staticMethod2(){
        System.out.println("This is another Static Method that we'll call Static Method 2");
    }
    public void nonStaticMethod2(){
        System.out.println("This is another Non Static Method that we'll call Non Static Method 2");
    }
    public static void nonStaticMethodCallingStaticMethodInAnotherClass(){
        System.out.println("This is a non static method calling a static method in another class");
    }
}
