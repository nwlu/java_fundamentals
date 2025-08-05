package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class WatchTest {
    public static void main(String[] args) {
        WatchType rolex = new WatchType("Rolex");
        //StrapType bracelet = new StrapType(false);
        Time show = new Time("Rolex");
        Watch watch1 = new Watch("Rolex", "Daytona", "stainless steel");
        System.out.println("My new watch is a " + watch1.getBrand() + " ");
        System.out.println("The watch is " + watch1.showTime());
        System.out.println("The " + watch1.getBrand() + " " + watch1.getModel() + " has a " + watch1.getBracelet() +
                " bracelet");

        Watch watch2 = new Watch("Omega", "Aquaterra", "NATO");
        System.out.println("My second watch is a " + watch2.getBrand() + " ");
        System.out.println("The watch is " + watch2.showTime("IST"));
        System.out.println("The " + watch2.getBrand() + " " + watch2.getModel() + " has a " + watch2.getBracelet() +
                " bracelet");

        SmartWatch watch3 = new SmartWatch("Garmin", "Fenix", "rubber");
        System.out.println("My third watch is a " + watch3.getBrand() + " ");
        System.out.println("The watch is " + watch3.showTime("PST"));
        System.out.println("The " + watch3.getBrand() + " " + watch3.getModel() + " has a " + watch3.getBracelet() +
                " bracelet");

    }
}

interface Chargeable {
    void charge();
}

class WatchType {
    private String brand;

    public WatchType(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Time extends WatchType {
    public Time(String brand) {
        super(brand);
    }

    public String showTime() {
        return "showing the current time";
    }

    public String showTime(String timezone) {
        return "current timezone";
    }
}

class Watch extends Time implements Chargeable {
    private String model;
    private String bracelet;

    public Watch(String brand, String model, String bracelet) {
        super(brand);
        this.model = model;
        this.bracelet = bracelet;
    }

    public String getModel() {
        return model;
    }

    public String getBracelet() {
        return bracelet;
    }

    @Override
    public String showTime(String timezone) {
        return getBrand() + " " + model + ": showing time in " + timezone;
    }

    @Override
    public void charge() {
        System.out.println(getBrand() + " " + getModel() + ": this watch is mechanical, so no need to charge");
    }

}
class SmartWatch extends Watch {
    public SmartWatch(String brand, String model, String bracelet) {
        super(brand, model, bracelet);
    }

    @Override
    public String showTime() {
        return getBrand() + " " + getModel() + ": current time and message displayed";
    }

    @Override
    public String showTime(String timezone) {
        return getBrand() + " " + getModel() + ": time in timezone " + timezone;
    }

    @Override
    public void charge() {
        System.out.println(getBrand() + " " + getModel() + ": this watch is a Smartwatch. Please use charging puck.");
    }
}



