package labs_examples.objects_classes_methods.labs.objects;

class AirplaneExample {
    public static void main(String[] args) {
        Plane myPlane = new Plane("piston", "American", "Boeing", 500, 459);

    }
    //Class 1
    class Plane {
        Engine engine;
        String airline;
        String model;
        double fuelCapacity;
        double currentFuel;

        public Plane(Engine engine, String airline, String model, double fuelCapacity, double currentFuel) {
            this.engine = engine;
            this.airline = airline;
            this.model = model;
            this.fuelCapacity = fuelCapacity;
            this.currentFuel = currentFuel;
        }

        @Override
        public String toString() {
            return "Plane{" +
                    "engine=" + engine +
                    ", airline='" + airline + '\'' +
                    ", model='" + model + '\'' +
                    ", fuelCapacity=" + fuelCapacity +
                    ", currentFuel=" + currentFuel +
                    '}';
        }
    }

//Class 2
    class Engine {
        String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}

    //Class 3
    class Capacity {
        String planeType;
        int numOfSeats;

        public Capacity(String planeType, int numOfSeats) {
            this.planeType = planeType;
            this.numOfSeats = numOfSeats;
        }

        @Override
        public String toString() {
            return "Capacity{" +
                    "planeType='" + planeType + '\'' +
                    ", numOfSeats=" + numOfSeats +
                    '}';
        }
    }

    //Class 4
    class Crew {
        String driver;
        String crewType;

        public Crew(String driver, String crewType) {
            this.driver = driver;
            this.crewType = crewType;
        }

        @Override
        public String toString() {
            return "Crew{" +
                    "driver='" + driver + '\'' +
                    ", crewType='" + crewType + '\'' +
                    '}';
        }
    }
}
