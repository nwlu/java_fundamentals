package labs_examples.arrays.labs;

class Main {
    public static void main(String[] args){
        // create a new object of type
        // Vehicle named "myVehicle"
        Vehicle myVehicle = new Vehicle();
        // then you can set the instance variables
        // in the myVehicle object
        myVehicle.passengers = 6;
        myVehicle.fuelCap = 18;
        // then you can also access the methods
        // within the myVehicle object
        myVehicle.printPassengers();
    }
}

/*class Vehicle{
    //declaration of instance variable storing num of passengers
    int passengers;
    // declaration of instance variable storing fuel capacity
    int fuelCap;
    // method that prints out the number of passengers
    public int printPassengers() {
        System.out.println(
                "This vehicle has " + passengers + " passengers");
    }
}
*/