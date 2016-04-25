/**
 * Created by timroels on 4/25/16.
 */
public class Passenger {
    double arrivaltime;

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

    int arrivalstop;
    int destinationstop;
    int directionvector = arrivalstop - destinationstop;

}
