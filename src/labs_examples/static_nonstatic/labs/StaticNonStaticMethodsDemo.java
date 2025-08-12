package labs_examples.static_nonstatic.labs;

public class StaticNonStaticMethodsDemo {
    public static void main(String[] args) {
        staticMethod();

        StaticNonStaticMethodsDemo thisClass = new StaticNonStaticMethodsDemo();
        thisClass.nonStaticMethod();

        StaticMethods2.staticMethod2();

        StaticMethods2 nonStaticMethod = new StaticMethods2();
        nonStaticMethod.nonStaticMethod2();
    }
    public static void staticMethod(){
        System.out.println("This is an example of a Static Method");
    }
    public void nonStaticMethod(){
        System.out.println("This is an example of a Non Static Method");
    }
}
