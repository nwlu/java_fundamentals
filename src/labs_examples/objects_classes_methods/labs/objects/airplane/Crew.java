package labs_examples.objects_classes_methods.labs.objects.airplane;

//Class 4
public class Crew {
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