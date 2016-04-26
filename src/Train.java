/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Train {

    public Train(int numCars, int start, int vector){
        startLocation = start - 1;
        directionVector = vector;
        currentLocation = start - 1;
        trainCar = new TrainCar(numCars);
    }

    public boolean isFull(){
        return trainCar.isFull();
    }

    public boolean isEmpty(){
        return trainCar.isEmpty();
    }
    public void addPassenger(Passenger n){
        trainCar.addPassenger(n);
    }

    public Passenger removePassenger(){
        // Will have to change this probably
        return trainCar.removePassenger(this.currentLocation);
    }


    public int getDirectionVector() {
        return directionVector;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public void setCurrentLocation(int current) {
        this.currentLocation = current;
    }

    public void setDirectionVector(int vector) {
        this.directionVector = vector;
    }

    private int directionVector;
    private int currentLocation;
    private int startLocation; // where the train starts after instantiation

    private TrainCar trainCar;
}
