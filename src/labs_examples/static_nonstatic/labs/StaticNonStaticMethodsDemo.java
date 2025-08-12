package labs_examples.static_nonstatic.labs;

public class StaticNonStaticMethodsDemo {
    public static void main(String[] args) {
        staticMethod();

        StaticNonStaticMethodsDemo thisClass = new StaticNonStaticMethodsDemo();
        thisClass.nonStaticMethod();

        StaticMethods2.staticMethod2();

        StaticMethods2 nonStaticMethod = new StaticMethods2();
        nonStaticMethod.nonStaticMethod2();

        StaticNonStaticMethodsDemo nonStaticClass = new StaticNonStaticMethodsDemo();
        nonStaticClass.nonStaticMethod();

        StaticMethods2 nonStaticClass2 = new StaticMethods2();
        nonStaticClass2.nonStaticMethod2();

        StaticNonStaticMethodsDemo demo = new StaticNonStaticMethodsDemo();
        demo.nonStaticMethod();

        StaticMethods2 staticClass = new StaticMethods2();
        staticClass.nonStaticMethodCallingStaticMethodInAnotherClass();
    }
    public static void staticMethod(){
        System.out.println("This is an example of a Static Method");
    }
    public void nonStaticMethod(){
        System.out.println("This is an example of a Non Static Method");
    }
    public void nonStaticCallingStaticMethod(){
        System.out.println("This is a non static method calling a static method");
        staticMethod();
    }
    /*public static void nonStaticMethodCallingStaticMethodInAnotherClass(){
        StaticMethods2.staticMethod2();
    }*/

}
