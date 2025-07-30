package labs_examples.objects_classes_methods.labs.objects.airplane;

//Class 1
public class Plane {
    private PlaneEngine engine;
    private String airline;
    private String model;
    private double fuelCapacity;
    private double currentFuel;

    public Plane(PlaneEngine engine, String airline, String model, double fuelCapacity, double currentFuel) {
        this.engine = engine;
        this.airline = airline;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public PlaneEngine getEngine() {
        return engine;
    }

    public void setEngine(PlaneEngine engine) {
        this.engine = engine;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
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
