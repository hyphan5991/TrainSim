/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainEventWait implements Event {

    private Train q;
    private int baseWait;

    public TrainEventWait(Train n){
        q = n;
        baseWait = 5;
    }

    @Override
    public void run() {

    }
}
