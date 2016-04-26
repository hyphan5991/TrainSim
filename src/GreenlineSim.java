/**
 * Created by timroels on 4/25/16.
 */
import java.io.*;

public class GreenlineSim {
    static PQ agenda = new PQ();
    public static Q1 passengerArray = new Q1();

    public static void main(String[] args) {
        Stop.stopSetUp();
        Train firstTrain = new Train(3, 1, 1);
        TrainArray.add(firstTrain);
        TrainEvent firstTrainEvent = new TrainEvent(firstTrain);
        agenda.add(firstTrainEvent, 0);
        Train secondTrain = new Train(3, 23, -1);
        TrainArray.add(secondTrain);
        TrainEvent secondTrainEvent = new TrainEvent(secondTrain);
        agenda.add(secondTrainEvent, 0);
        Train thirdTrain = new Train(3, 12, 1);
        TrainArray.add(thirdTrain);
        TrainEvent thirdTrainEvent = new TrainEvent(thirdTrain);
        agenda.add(thirdTrainEvent, 0);
        Train fourthTrain = new Train(3, 12, -1);
        TrainArray.add(fourthTrain);
        TrainEvent fourthTrainEvent = new TrainEvent(fourthTrain);
        agenda.add(fourthTrainEvent, 0);
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


        while (GreenlineSim.agenda.getCurrentTime() < 86400){
            Event removed = agenda.remove();
            System.out.println(removed.toString());
            removed.run();
        }

        GreenlineSim.write("dataFile");

    }

    public static boolean write(String fileName) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new File(fileName));
        } catch (Exception e) {
            return false;
        }
        p.println("Passenger ArrivalTime DestinationTime TotalTime ArrivalStop " +
                "DestinationStop DirectionVector");
        int i = 1;
        while (passengerArray.length() != 0) {
            Passenger t = (Passenger) passengerArray.remove();
            p.print(1 + " ");
            p.print(t.arrivaltime + " ");
            p.print(t.destinationtime + " ");
            p.print(t.getToaltriptime() + " ");
            p.print(t.getArrivalstop() + " ");
            p.print(t.getDestinationstop() + " ");
            p.print(t.getDirectionvector() + "\n");
            i++;
        }
        p.close();
        return true;
    }

}
