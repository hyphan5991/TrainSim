/**
 * Created by timroels on 4/25/16.
 */
public class TrainEvent implements Event {
    private Train p;
    private int baseTime;

    public TrainEvent(Train n){
        p = n;
        baseTime = 180;
    }

    @Override
    public void run() {


    }
}
