import java.util.Random;

/**
 * Created by timroels on 4/25/16.
 */
public class PassangerMaker implements Event {
    public void run(){
        Random stopgenerater = new Random();
        int r = stopgenerater.nextInt(69);
        int q = stopgenerater.nextInt(69);
        while(r==q){
            q = stopgenerater.nextInt(69);
        }
        int arrivalstop = -1;
        int destinationstop = -1;
        if(r<5){
            arrivalstop =1;
        }
        if(r<10&&r>=5){
            arrivalstop=2;
        }
        if(r<15&&r>=10){
            arrivalstop=3;
        }
        if(r<20&&r>=15){
            arrivalstop =4;
        }
        if(r<25&&r>=20){
            arrivalstop=5;
        }
        if(r<28&&r>=25){
            arrivalstop=6;
        }
        if (r<31&&r>=28){
            arrivalstop=7;
        }
        if(r<34&&r>=31){
            arrivalstop=8;
        }
        if(r==34){
            arrivalstop=9;
        }
        if (r==35){
            arrivalstop=10;
        }
        if (r==36){
            arrivalstop=11;
        }
        if (r==37){
            arrivalstop=12;
        }
        if (r==38){
            arrivalstop=13;
        }
        if (r==39){
            arrivalstop=14;
        }
        if (r==40){
            arrivalstop=15;
        }
        if (r==41){
            arrivalstop=16;
        }
        if(r==42){
            arrivalstop=17;
        }
        if(r==43){
            arrivalstop=18;
        }
        if(r<49&&r>=44){
            arrivalstop=19;
        }
        if(r<54&&r>=49){
            arrivalstop=20;
        }
        if(r<59&&r>=54){
            arrivalstop =21;
        }
        if (r<64&&r>=59){
            arrivalstop=22;
        }
        if (r<69&&r>=64){
            arrivalstop=23;
        }
        if(q<5){
            destinationstop =1;
        }
        if(q<10&&q>=5){
            destinationstop=2;
        }
        if(q<15&&q>=10){
            destinationstop=3;
        }
        if(q<20&&q>=15){
            destinationstop =4;
        }
        if(q<25&&q>=20){
            destinationstop=5;
        }
        if(q<28&&q>=25){
            destinationstop=6;
        }
        if (q<31&&q>=28){
            destinationstop=7;
        }
        if(q<34&&q>=31){
            destinationstop=8;
        }
        if(q==34){
            destinationstop=9;
        }
        if (q==35){
            destinationstop=10;
        }
        if (q==36){
            destinationstop=11;
        }
        if (q==37){
            destinationstop=12;
        }
        if (q==38){
            destinationstop=13;
        }
        if (q==39){
            destinationstop=14;
        }
        if (q==40){
            destinationstop=15;
        }
        if (q==41){
            destinationstop=16;
        }
        if(q==42){
            destinationstop=17;
        }
        if(q==43){
            destinationstop=18;
        }
        if(q<49&&q>=44){
            destinationstop=19;
        }
        if(q<54&&q>=49){
            destinationstop=20;
        }
        if(q<59&&q>=54){
            destinationstop =21;
        }
        if (q<64&&q>=59){
            destinationstop=22;
        }
        if (q<69&&q>=64){
            destinationstop=23;
        }
        Passenger p = new Passenger(GreenlineSim.agenda.getCurrentTime(),arrivalstop,destinationstop);

    }
}
