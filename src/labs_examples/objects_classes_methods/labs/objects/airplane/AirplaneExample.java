package labs_examples.objects_classes_methods.labs.objects.airplane;

import java.util.ArrayList;

class AirplaneExample {
    public static void main(String[] args) {
        PlaneEngine engine = new PlaneEngine("piston");
        Plane myPlane = new Plane(engine, "American", "Boeing", 500, 459);
        System.out.println(myPlane.getEngine().getEngineType());
        myPlane.getEngine().setEngineType("jet");
        System.out.println(myPlane.getEngine().getEngineType());
        myPlane.getEngine().setEngineType("propeller");
        System.out.println(myPlane.getEngine().getEngineType());

        PlaneEngine engine2 = new PlaneEngine("ion thruster");
        //myPlane.setEngine(engine2);

        Plane myPlane2 = new Plane(engine2, "Delta", "Boeing", 700, 350);
        ArrayList<Plane> planes = new ArrayList<>();
        planes.add(myPlane);
        planes.add(myPlane2);

        for (Plane p : planes){
            System.out.println("***");
            System.out.println(p.getEngine().getEngineType());
        }
    }
}



