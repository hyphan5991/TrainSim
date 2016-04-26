/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class Stop {

    static Q1[][] stopArray = new Q1[23][2];

    public static void stopSetUp(){
        for(int i = 0; i < stopArray.length; i++){
            // 0 equals east 1 equals west
            stopArray[i][0] = new Q1();
            stopArray[i][1] = new Q1();
        }
    }

    public static void addPassenger(Passenger n){
        int stopNum = n.getArrivalstop();
        if (n.getDirectionvector() < 0){
            stopArray[stopNum - 1][1].add(n);
        }
        else stopArray[stopNum - 1][0].add(n);
    }

    public Passenger removePassenger(Train n){

        if (n.getDirectionVector() < 0){
            return (Passenger) west.remove();
        }
        else return (Passenger) east.remove();
    }

    public int getStopNumber() {
        return stopNumber;
    }

    private int stopNumber;
    private Q1 east;
    private Q1 west;
}
