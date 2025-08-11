package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class WatchTest {
    public static void main(String[] args) {
        MechanicalWatch mechanicalRolex = new MechanicalWatch("Rolex", "Daytona", "stainless steel");
        System.out.println("My new watch is a " + mechanicalRolex.getBrand() + " ");
        System.out.println("The watch is " + mechanicalRolex.showTime());
        System.out.println("The " + mechanicalRolex.getBrand() + " " + mechanicalRolex.getModel() + " has a " + mechanicalRolex.getBracelet() +
                " bracelet");

        mechanicalRolex.windUp();

        SmartWatch smartApple = new SmartWatch("Apple", "Watch1", "rubber", "lithium");
        System.out.println("My second watch is a " + smartApple.getBrand() + " ");
        System.out.println("The watch is " + smartApple.showTime("IST"));
        System.out.println("The " + smartApple.getBrand() + " " + smartApple.getModel() + " has a " + smartApple.getBracelet() +
                " bracelet");

        smartApple.charge();
        smartApple.getBatteryLevel();

        System.out.println(smartApple.showTime());
        System.out.println(mechanicalRolex.showTime());
    }
}

interface Chargeable {
    void charge();
}

class TimePiece {

    public String showTime() {
        return "Timepiece: showing the current time";
    }

    public String showTime(String timezone) {
        return "Timepiece: current timezone";
    }
}

class WristWatch extends TimePiece{
    private String brand;
    private String model;
    private String bracelet;

    public WristWatch(String brand, String model, String bracelet) {
        this.brand = brand;
        this.model = model;
        this.bracelet = bracelet;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBracelet(String bracelet) {
        this.bracelet = bracelet;
    }

    public String getModel() {
        return model;
    }

    public String getBracelet() {
        return bracelet;
    }
}

class MechanicalWatch extends WristWatch {
    public MechanicalWatch(String brand, String model, String bracelet) {
        super(brand, model, bracelet);
    }

    public void windUp (){
        System.out.println("Winding my watch");
    }

    @Override
    public String showTime(String timezone) {
        return "Mechanical: " + getBrand() + " " + getModel() + ": showing time in " + timezone;
    }
}
class SmartWatch extends WristWatch implements Chargeable{
    private String battery;

    public SmartWatch(String brand, String model, String bracelet, String battery) {
        super(brand, model, bracelet);
        this.battery = battery;
    }

    public void getBatteryLevel() {
        System.out.println("This watch is fully charged");
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String showTime() {
        return "SmartWatch " + getBrand() + " " + getModel() + ": current time and message displayed";
    }

    @Override
    public void charge() {
        System.out.println(getBrand() + " " + getModel() + ": this watch is a Smartwatch. Please use charging puck.");
    }
}



