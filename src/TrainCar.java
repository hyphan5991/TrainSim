/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainCar {

    public TrainCar(){
        trainlength = new Q1[23];
        for (int i = 0; i <trainlength.length; i++){
            trainlength[i] = new Q1();
        }
        count = 0;
    }

    public static void addPassenger(Passenger n){
        if (count < 50) {
            int stop = n.getDestinationstop();
            trainlength[stop - 1].add(n);
            count++;
        }
    }

    public static Passenger removePassenger(Stop n){
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

    private static int count;
    private static Q1[] trainlength;
}
