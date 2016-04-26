/**
 * Created by timroels on 4/25/16.
 */
public class TrainEvent implements Event {
    private Train p;
    private double baseTime;

    public TrainEvent(Train n){
        p = n;
        baseTime = 3.0;
    }

    public double getBaseTime() {
        return baseTime;
    }
    public String toString(){
        return "TrainEvent" + (p.getCurrentLocation() + 1);
    }
    @Override
    public void run() {
        int removeCount = 0;
        int addCount = 0;
        double time;
        if (!p.isEmpty()){
            Passenger removed = p.removePassenger();
            if (removed != null){
                removed.setDestinationtime(GreenlineSim.agenda.getCurrentTime());
                removed.setTotaltriptime(removed.getDestinationtime() - removed.getArrivaltime());
                removed.setArrived("Y");
                removeCount++;
            }
            while (removed != null){
                removed = p.removePassenger();
                if (removed != null){
                    removed.setDestinationtime(GreenlineSim.agenda.getCurrentTime());
                    removed.setTotaltriptime(removed.getDestinationtime() - removed.getArrivaltime());
                    removed.setArrived("Y");
                    removeCount++;
                }
            }
        }

        Passenger added = Stop.removePassenger(p);
        if (added != null){
            p.addPassenger(added);
            addCount++;
        }
        while (added != null) {
            added = Stop.removePassenger(p);
            if (added != null) {
                p.addPassenger(added);
                addCount++;
            }
        }

        time = addCount + (2 * removeCount);
        boolean flag = TrainArray.move(p);
        System.out.println(flag);
        if (flag){
            if (15 > time) {
                GreenlineSim.agenda.add(this, (0.25 + 3));
            }
            else GreenlineSim.agenda.add(this, ((time/60) + 3));
        }

        else {
//            TrainEventWait newWait = new TrainEventWait(p, time);
            if (15 > time) {
                GreenlineSim.agenda.add(this, (0.1 + 0.25 + 3));
            }
            else GreenlineSim.agenda.add(this, (0.1 + (time/60) + 3));
        }



    }
}
