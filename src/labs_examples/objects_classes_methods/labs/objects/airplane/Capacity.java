package labs_examples.objects_classes_methods.labs.objects.airplane;

//Class 3
public class Capacity {
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
