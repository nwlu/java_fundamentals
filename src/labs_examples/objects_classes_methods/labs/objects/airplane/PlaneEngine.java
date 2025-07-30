package labs_examples.objects_classes_methods.labs.objects.airplane;

//Class 2
public class PlaneEngine {
    private String engineType;

    public PlaneEngine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType(){
        return engineType;
    }

    public void setEngineType(String engineType){
        if (engineType.equalsIgnoreCase("jet")){
            System.out.println("Sorry we don't work on jet engines");
            return;
        }
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
