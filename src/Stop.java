/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Stop {

    public Stop(int n){
        stopNumber = n;
        east = new Q1();
        west = new Q1();
    }

    public void addPassenger(Passenger n){
        if (n.getDirectionvector() < 0){
            west.add(n);
        }
        else east.add(n);
    }


    public int getStopNumber() {
        return stopNumber;
    }

    private int stopNumber;
    private Q1 east;
    private Q1 west;
}
