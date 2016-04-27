/**
 * Created by timroels on 4/25/16.
 */

import java.io.File;
import java.io.PrintWriter;

public class GreenlineSim {
    static PQ agenda = new PQ();
    public static Q1 passengerArray = new Q1();
    public static Q1 lineLengthData = new Q1();
    public static int numTrainsR = 23;
    public static int numCarsR = 3;
    public static int rushHourMultiplier;
    public static Train[] listofTrains = {new Train(numCarsR, 11, 1), new Train(numCarsR, 11, -1),
            new Train(numCarsR, 1, 1), new Train(numCarsR, 1, -1), new Train(numCarsR, 23, 1),
            new Train(numCarsR, 23, -1), new Train(numCarsR, 6, -1), new Train(numCarsR, 6, 1),
            new Train(numCarsR, 16, -1), new Train(numCarsR, 16, 1), new Train(numCarsR, 4, -1),
            new Train(numCarsR, 4, 1), new Train(numCarsR, 19, -1), new Train(numCarsR, 19, 1),
            new Train(numCarsR, 9, -1), new Train(numCarsR, 9, 1), new Train(numCarsR, 14, -1),
            new Train(numCarsR, 14, 1), new Train(numCarsR, 2, -1), new Train(numCarsR, 2, 1),
            new Train(numCarsR, 22, -1), new Train(numCarsR, 22, -1), new Train(numCarsR, 13, -1)};
    public static TrainEvent[] listofEvents = {new TrainEvent(listofTrains[0]), new TrainEvent(listofTrains[1]),
            new TrainEvent(listofTrains[2]), new TrainEvent(listofTrains[3]), new TrainEvent(listofTrains[4]),
            new TrainEvent(listofTrains[5]), new TrainEvent(listofTrains[6]), new TrainEvent(listofTrains[7]),
            new TrainEvent(listofTrains[8]), new TrainEvent(listofTrains[9]), new TrainEvent(listofTrains[10]),
            new TrainEvent(listofTrains[11]), new TrainEvent(listofTrains[12]), new TrainEvent(listofTrains[13]),
            new TrainEvent(listofTrains[14]), new TrainEvent(listofTrains[15]), new TrainEvent(listofTrains[16]),
            new TrainEvent(listofTrains[17]), new TrainEvent(listofTrains[18]), new TrainEvent(listofTrains[19]),
            new TrainEvent(listofTrains[20]), new TrainEvent(listofTrains[21]), new TrainEvent(listofTrains[22])};



    public static void main(String[] args) {
        Stop.stopSetUp();


        int i = 0;
        while (i < numTrainsR){
            TrainArray.add(listofTrains[i]);
            agenda.add(listofEvents[i], 0);
            i++;
        }

        DowntownPassengerMaker targetField = new DowntownPassengerMaker(1);
        agenda.add(targetField, 0);
        DowntownPassengerMaker wareHouseD = new DowntownPassengerMaker(2);
        agenda.add(wareHouseD, 0);
        DowntownPassengerMaker nicolletM = new DowntownPassengerMaker(3);
        agenda.add(nicolletM, 0);
        DowntownPassengerMaker governmentP = new DowntownPassengerMaker(4);
        agenda.add(governmentP, 0);
        DowntownPassengerMaker usBank = new DowntownPassengerMaker(5);
        agenda.add(usBank, 0);
        CampusPassengerMaker westBank = new CampusPassengerMaker(6);
        agenda.add(westBank, 0);
        CampusPassengerMaker eastBank = new CampusPassengerMaker(7);
        agenda.add(eastBank, 0);
        CampusPassengerMaker stadiumV = new CampusPassengerMaker(8);
        agenda.add(stadiumV, 0);
        PassangerMaker prospectPark = new PassangerMaker(9);
        agenda.add(prospectPark, 0);
        PassangerMaker westgateS = new PassangerMaker(10);
        agenda.add(westgateS, 0);
        PassangerMaker raymondA = new PassangerMaker(11);
        agenda.add(raymondA, 0);
        PassangerMaker fairviewA = new PassangerMaker(12);
        agenda.add(fairviewA, 0);
        PassangerMaker snellingA = new PassangerMaker(13);
        agenda.add(snellingA, 0);
        PassangerMaker hamlineA = new PassangerMaker(14);
        agenda.add(hamlineA, 0);
        PassangerMaker lexingtonP = new PassangerMaker(15);
        agenda.add(lexingtonP, 0);
        PassangerMaker victoriaS = new PassangerMaker(16);
        agenda.add(victoriaS, 0);
        PassangerMaker daleS = new PassangerMaker(17);
        agenda.add(daleS, 0);
        PassangerMaker westernA = new PassangerMaker(18);
        agenda.add(westernA, 0);
        DowntownPassengerMaker capitolS = new DowntownPassengerMaker(19);
        agenda.add(capitolS, 0);
        DowntownPassengerMaker robertS = new DowntownPassengerMaker(20);
        agenda.add(robertS, 0);
        DowntownPassengerMaker tenthS = new DowntownPassengerMaker(21);
        agenda.add(tenthS, 0);
        DowntownPassengerMaker centralS = new DowntownPassengerMaker(22);
        agenda.add(centralS, 0);
        DowntownPassengerMaker unionD = new DowntownPassengerMaker(23);
        agenda.add(unionD, 0);
        LineLengthEvent lenData = new LineLengthEvent();
        agenda.add(lenData, 0);


        while (GreenlineSim.agenda.getCurrentTime() < 1440){
            Event removed = agenda.remove();
            System.out.println(removed.toString());
            removed.run();
        }

        GreenlineSim.writeFileOne("dataFile");
        GreenlineSim.writeFileTwo("dataFile2");

    }

    public static boolean writeFileOne(String fileName) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new File(fileName));
        } catch (Exception e) {
            return false;
        }
        p.println("NumTrains, NumCars, Passenger, ArrivalTime, DestinationTime, TotalTime, ArrivalStop, " +
                "DestinationStop, DirectionVector");
        int i = 1;
        while (passengerArray.length() != 0) {
            Passenger t = (Passenger) passengerArray.remove();
            p.println(numTrainsR + " " + numCarsR + ", " + i + ", " + t.getArrived() + ", " + t.getArrivaltime() + ", "
                    + t.getDestinationtime() + ", " + t.getToaltriptime() + ", " + t.getArrivalstop() + ", "
                    + t.getDestinationstop() + ", " + t.getDirectionvector());
            i++;
        }
        p.close();
        return true;
    }

    public static boolean writeFileTwo(String fileName) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new File(fileName));
        } catch (Exception e) {
            return false;
        }
        p.println("Stop#, East, West");
        int i = 1;
        while (passengerArray.length() != 0) {
            int east = (Integer) lineLengthData.remove();
            int west = (Integer) lineLengthData.remove();
            p.println(i + ", " + east + ", " + west);
            i++;
        }
        p.close();
        return true;
    }

}
