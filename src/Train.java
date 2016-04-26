/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Train {

    public Train(int n, int m){
        startLocation = m;

        numTrainCars = new TrainCar[n];
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

    private int startLocation; // where the train starts after instantiation
    private TrainCar[] numTrainCars;
}
