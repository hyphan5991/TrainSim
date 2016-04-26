/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainCar {

    public TrainCar(){
        trainlength = new Q1[22];
        for (int i = 0; i <trainlength.length; i++){
            trainlength[i] = new Q1();
        }
        count = 0;
    }

    public void addPassenger(Passenger n){
        if (count < 50) {
            int stop = n.getDestinationstop();
            trainlength[stop - 1].add(n);
            count++;
        }
    }

    public Passenger removePassenger(Stop n){
        //Note will have to iterate all the way through
        int stopNumber = n.getStopNumber();
        return (Passenger) trainlength[stopNumber - 1].remove();
    }

    public boolean isFull(){
        if (count < 50){
            return false;
        }
        else return true;
    }

    private int count;
    private Q1[] trainlength;
}
