package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.Class1;

public class Class2 {
    public void serve(){
        System.out.println("Serve the ball cross court");
    }

    public void returnServe(){
        System.out.println("Return the ball back to the serving team");
    }

    public void testSmash(){
        Class1 shots = new Class1();
        shots.dink();

        //shots.smash(); --this won't work because it's the protected method in Class1
    }
}
