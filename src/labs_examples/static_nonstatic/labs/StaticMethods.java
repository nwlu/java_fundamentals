package labs_examples.static_nonstatic.labs;

public class StaticMethods {
    public static void main(String[] args) {
        staticMethod();

        StaticMethods thisClass = new StaticMethods();
        thisClass.nonStaticMethod();

    }
    public static void staticMethod(){
        System.out.println("This is an example of a Static Method");
    }
    public void nonStaticMethod(){
        System.out.println("This is an example of a Non Static Method");
    }
}
