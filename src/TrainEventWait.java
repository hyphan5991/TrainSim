/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainEventWait implements Event {

    private Train q;
    private double leftovertime;
    private double baseWait;

    public TrainEventWait(Train n, double fractionTime){
        q = n;
        baseWait = 0.0833;
        leftovertime = fractionTime;
    }

    @Override
    public void run() {
        System.out.println(TrainArray.move(q));

        if (TrainArray.move(q)) {

            TrainEvent newTrainEvent = new TrainEvent(q);
            if (15 > leftovertime) {
                GreenlineSim.agenda.add(newTrainEvent, 0.25 + newTrainEvent.getBaseTime());
            }
            else GreenlineSim.agenda.add(this, leftovertime + newTrainEvent.getBaseTime());

        }
        else {
            GreenlineSim.agenda.add(this, baseWait);
        }
    }

    public double getBaseWait() {
        return baseWait;
    }
}
