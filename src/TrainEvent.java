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

    public int getBaseTime() {
        return baseTime;
    }

    @Override
    public void run() {
        int currentStop = p.getCurrentLocation();
        int trainVector = p.getDirectionVector();
        int direction;
        int removecount = 0;
        int addcount = 0;
        int time;
        if (!p.isEmpty()){
            Passenger removed = p.removePassenger();
            if (removed != null){
                removed.setDestinationtime(GreenlineSim.agenda.getCurrentTime());
                GreenlineSim.passengerArray.add(removed);
            }
            removecount++;
            while (removed != null){
                removed = p.removePassenger();
                if (removed != null){
                    removed.setDestinationtime(GreenlineSim.agenda.getCurrentTime());
                    GreenlineSim.passengerArray.add(removed);
                    removecount++;
                }
            }
        }
        if (trainVector < 0){
           direction = 1;
        }
        else direction = 0;
        if (Stop.stopArray[currentStop][direction].length() > 0){
            while (Stop.stopArray[currentStop][direction].length() > 0){
                p.addPassenger((Passenger) Stop.stopArray[currentStop][direction].remove());
                addcount++;
            }
        }
        time = addcount + (2 * removecount);
        if (TrainArray.move(p)) {
            TrainArray.move(p);
            if (15 > time) {
                GreenlineSim.agenda.add(this, 15 + baseTime);
            }
            else GreenlineSim.agenda.add(this, time + baseTime);
        }
        else {
            TrainEventWait newWait = new TrainEventWait(p, time);
            GreenlineSim.agenda.add(newWait, newWait.getBaseWait());
        }



    }
}
