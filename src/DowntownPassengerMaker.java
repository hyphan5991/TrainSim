/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class DowntownPassengerMaker implements Event {
    private int stopNum;
    public DowntownPassengerMaker(int stop){
        stopNum = stop;
    }
    public String toString(){
        return "DowntownPassangerMaker" + stopNum;
    }
    @Override
    public void run() {

        int r = (int) (Math.random() * 100);
        r++;
        double arrivalMod = 0;
        if(r <= 10 && r > 0){
            arrivalMod = .75;
        }
        if(r <= 25 && r > 10){
            arrivalMod = .50;
        }
        if(r <= 45 && r > 25){
            arrivalMod = .2;
        }
        if(r <= 55 && r > 45){
            arrivalMod = 0;
        }
        if(r <= 75 && r > 55){
            arrivalMod = -.2;
        }
        if(r <= 90 && r > 75){
            arrivalMod = -.5;
        }
        if (r <= 100 && r >90){
            arrivalMod = -.75;
        }

        int q = (int) (Math.random() * 69);
        q ++;
        int destinationstop = -1;

        if(q <= 5 && q >= 1){
            destinationstop = 1;
        }
        if(q <= 10 && q > 5){
            destinationstop = 2;
        }
        if(q <= 15 && q > 10){
            destinationstop = 3;
        }
        if(q <= 20 && q > 15){
            destinationstop = 4;
        }
        if(q <= 25 && q > 20){
            destinationstop = 5;
        }
        if(q <= 28 && q > 25){
            destinationstop = 6;
        }
        if (q <= 31 && q >28){
            destinationstop = 7;
        }
        if(q <= 34 && q > 31){
            destinationstop = 8;
        }
        if(q == 35){
            destinationstop = 9;
        }
        if (q == 36){
            destinationstop = 10;
        }
        if (q == 37){
            destinationstop = 11;
        }
        if (q == 38){
            destinationstop = 12;
        }
        if (q == 39){
            destinationstop = 13;
        }
        if (q == 40){
            destinationstop = 14;
        }
        if (q == 41){
            destinationstop = 15;
        }
        if (q == 42){
            destinationstop = 16;
        }
        if(q == 43){
            destinationstop = 17;
        }
        if(q == 44){
            destinationstop = 18;
        }
        if(q <= 49 && q > 44){
            destinationstop = 19;
        }
        if(q <= 54 && q > 49){
            destinationstop = 20;
        }
        if(q <= 59 && q > 54){
            destinationstop = 21;
        }
        if (q <= 64 && q > 59){
            destinationstop = 22;
        }
        if (q <= 69 && q > 64){
            destinationstop = 23;
        }
        Passenger p = new Passenger(GreenlineSim.agenda.getCurrentTime(), stopNum, destinationstop);
        Stop.addPassenger(p);
        GreenlineSim.passengerArray.add(p);
        GreenlineSim.agenda.add(this, (1 / GreenlineSim.rushHourMultiplier) + (arrivalMod * (1 / GreenlineSim.rushHourMultiplier)));
    }
}
