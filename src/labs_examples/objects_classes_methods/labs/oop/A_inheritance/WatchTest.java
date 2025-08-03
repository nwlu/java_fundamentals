package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class WatchTest {
    public static void main(String[] args) {
        WatchType rolex = new WatchType("Rolex");
        //StrapType bracelet = new StrapType(false);
        Time show = new Time("Rolex");
        Watch model = new Watch("Rolex", "Daytona", "stainless steel");
        System.out.println("My new watch is a " + rolex.getBrand() + " ");
        System.out.println("The watch is " + show.showTime());
        System.out.println("The " + model.getBrand() + " " + model.getModel() + " has a " + model.getBracelet() + " bracelet");
        //show.showTime();
        //rolex.getWatchName();
    }
}
class WatchType {
    private String brand;
    //private String model;

    public WatchType(String brand) {
        this.brand = brand;
        //this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

   /* public String getModel() {
        return model;
    }*/

    /*public void setModel(String model) {
        this.model = model;
    }*/
}

class Time extends WatchType{
    public Time(String brand) {
        super(brand);
    }
    public String showTime(){
        return "showing the current time";
    }
}
class Watch extends Time{
    private String model;
    private String bracelet;

    public Watch(String brand, String model, String bracelet){
        super(brand);
        this.model = model;
        this.bracelet = bracelet;
    }

    public String getModel(){
        return model;
    }

    public String getBracelet(){
        return bracelet;
    }

   /* *//*public StrapType(String brand, String model){
        super(brand, model);
    }*//*
    public StrapType(boolean isBracelet) {
        if (isBracelet) {
            this.bracelet = "Bracelet";
            this.other = null;
        } else {
            this.bracelet = null;
            this.other = "Other";
        }
    }

    public String getBracelet() {
        return bracelet;
    }

    public void setBracelet(String bracelet) {
        this.bracelet = bracelet;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "StrapType{" +
                "bracelet='" + bracelet + '\'' +
                ", other='" + other + '\'' +
                '}';
    }*/
}



