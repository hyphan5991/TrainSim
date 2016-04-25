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

    public Passenger addPassenger(Passenger n){

    }

    private int startLocation;
    private TrainCar[] numTrainCars;
}
