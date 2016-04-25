import sun.plugin2.message.GetAppletMessage;

/**
 * Created by timroels on 4/25/16.
 */
public class Passenger {


    public double getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(double arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public int getArrivalstop() {
        return arrivalstop;
    }

    public void setArrivalstop(int arrivalstop) {
        this.arrivalstop = arrivalstop;
    }

    public int getDestinationstop() {
        return destinationstop;
    }

    public void setDestinationstop(int destinationstop) {
        this.destinationstop = destinationstop;
    }

    public int getDirectionvector() {
        return directionvector;
    }

    public void setDirectionvector(int directionvector) {
        this.directionvector = directionvector;
    }


    public double getDestinationtime() {
        return destinationtime;
    }

    public void setDestinationtime(double destinationtime) {
        this.destinationtime = destinationtime;
    }
    double arrivaltime;
    double destinationtime;
    private int arrivalstop;
    private int destinationstop;
    private  int directionvector = arrivalstop - destinationstop;



    public Passenger(){}

}
