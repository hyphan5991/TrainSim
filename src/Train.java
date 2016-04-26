/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Train {

    public Train(int numCars, int start, int vector){
        startLocation = start - 1;
        directionVector = vector;
        currentLocation = start - 1;


        numTrainCars = new TrainCar[numCars];
        for (int i = 0; i < numTrainCars.length; i++){
            numTrainCars[i] = new TrainCar();
        }

    }

    public boolean isFull(){
        for (int i = 0; i < numTrainCars.length; i++){
            if (!numTrainCars[i].isFull()){
                return false;
            }
        }
        return true;
    }

    public void addPassenger(Passenger n){
        for (int i = 0; i < numTrainCars.length || !numTrainCars[i].isFull(); i++){
            numTrainCars[i].addPassenger(n);
        }
    }

    public Passenger removePassenger(Stop n){
        // Will have to change this probably
        for (int i = 0; i < numTrainCars.length; i ++){
            return numTrainCars[i].removePassenger(n);
        }
        return null;
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

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setDirectionVector(int directionVector) {
        this.directionVector = directionVector;
    }

    private int directionVector;
    private int currentLocation;
    private int startLocation; // where the train starts after instantiation
    private TrainCar[] numTrainCars;
}
