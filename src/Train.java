/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Train {

    public Train(int numCars, int start, int vector){
        startLocation = start + 1;
        directionVector = vector;
        currentLocation = start + 1;


        numTrainCars = new TrainCar[numCars];
        for (int i = 0; i < numTrainCars.length; i++){
            numTrainCars[i] = new TrainCar();
        }

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

    public int getPreviousLocation() {
        return previousLocation;
    }

    public int getStartLocation() {
        return startLocation;
    }

    private int directionVector;
    private int currentLocation;
    private int previousLocation;
    private int startLocation; // where the train starts after instantiation
    private TrainCar[] numTrainCars;
}
