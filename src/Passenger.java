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

    public double getToaltriptime() {
        return totaltriptime;
    }
    //time passanger is created at stop
    public void setTotaltriptime(double totaltriptime) {
        this.totaltriptime = totaltriptime;
    }

    public String getArrived() {
        return arrived;
    }

    public void setArrived(String answer) {

            this.arrived = answer;
    }

    String arrived;
    double arrivaltime;
    //time passanger arrives at stop and gets of traincar
    double destinationtime;
    //total trip time
    private double totaltriptime;
    //stop passanger was created to
    private int arrivalstop;
    //stop passanger is going to
    private int destinationstop;
    //shows direction passanger is heading and length of stop
    private  int directionvector;


    public Passenger(double arrivalT, int arrivalS, int destinationS){
        arrivaltime = arrivalT;
        arrivalstop = arrivalS;
        destinationstop = destinationS;
        directionvector = arrivalS - destinationS;
        arrived = "N";
        destinationtime = 1440;
        totaltriptime = destinationtime - arrivaltime;
    }


}
