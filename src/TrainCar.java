/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainCar {

    public TrainCar(int numCars){
        seats = new Stack1[23];
        for (int i = 0; i <seats.length; i++){
            seats[i] = new Stack1();
        }
        max = numCars * 50;
        count = 0;
    }

    public void addPassenger(Passenger n){
        if (count < max) {
            int stop = n.getDestinationstop();
            seats[stop - 1].push(n);
            count++;
        }
    }

    public Passenger removePassenger(int n){
        //Note will have to iterate all the way through
        if (!seats[n].isEmpty()){
            count --;
            return (Passenger) seats[n].pop();
        }
        else return null;
    }

    public boolean isFull(){
        if (count < max){
            return false;
        }
        else return true;
    }

    public boolean isEmpty(){
        if (count == 0){
            return true;
        }
        else return false;
    }

    private int max;
    private int count;
    private Stack1[] seats;
}
