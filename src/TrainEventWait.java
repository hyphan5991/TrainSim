/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainEventWait implements Event {

    private Train q;
    private int leftovertime;
    private int baseWait;

    public TrainEventWait(Train n, int fractionTime){
        q = n;
        baseWait = 5;
        leftovertime = fractionTime;
    }

    @Override
    public void run() {
        if (TrainArray.move(q)) {
            TrainArray.move(q);
            TrainEvent newTrainEvent = new TrainEvent(q);
            if (15 > leftovertime) {
                GreenlineSim.agenda.add(newTrainEvent, 15 + newTrainEvent.getBaseTime());
            }
            else GreenlineSim.agenda.add(this, leftovertime + newTrainEvent.getBaseTime());

        }
        else {
            GreenlineSim.agenda.add(this, baseWait);
        }
    }

    public int getBaseWait() {
        return baseWait;
    }
}
