/**
 * Created by timroels on 4/25/16.
 */
import java.io.*;

public class GreenlineSim {
    static PQ agenda = new PQ();
    public static Q1 passengerArray = new Q1();

    public static void main(String[] args) {
        TrainArray first = new TrainArray();
        Train firstTrain = new Train(3, 1, 1);
        TrainArray.add(firstTrain);
        TrainEvent firstTrainEvent = new TrainEvent(firstTrain);
        Train secondTrain = new Train(3, 23, -1);
        TrainArray.add(secondTrain);
        TrainEvent secondTrainEvent = new TrainEvent(secondTrain);
        Train thirdTrain = new Train(3, 12, 1);
        TrainArray.add(thirdTrain);
        TrainEvent thirdTrainEvent = new TrainEvent(thirdTrain);
        Train fourthTrain = new Train(3, 12, -1);
        TrainArray.add(fourthTrain);
        TrainEvent fourthTrainEvent = new TrainEvent(fourthTrain);
        DowntownPassengerMaker targetField = new DowntownPassengerMaker(1);
        DowntownPassengerMaker wareHouseD = new DowntownPassengerMaker(2);
        DowntownPassengerMaker nicolletM = new DowntownPassengerMaker(3);
        DowntownPassengerMaker governmentP = new DowntownPassengerMaker(4);
        DowntownPassengerMaker usBank = new DowntownPassengerMaker(5);
        CampusPassengerMaker westBank = new CampusPassengerMaker(6);
        CampusPassengerMaker eastBank = new CampusPassengerMaker(7);
        CampusPassengerMaker stadiumV = new CampusPassengerMaker(8);
        PassangerMaker prospectPark = new PassangerMaker(9);
        PassangerMaker westgateS = new PassangerMaker(10);
        PassangerMaker raymondA = new PassangerMaker(11);
        PassangerMaker fairviewA = new PassangerMaker(12);
        PassangerMaker snellingA = new PassangerMaker(13);
        PassangerMaker hamlineA = new PassangerMaker(14);
        PassangerMaker lexingtonP = new PassangerMaker(15);
        PassangerMaker victoriaS = new PassangerMaker(16);
        PassangerMaker daleS = new PassangerMaker(17);
        PassangerMaker westernA = new PassangerMaker(18);
        DowntownPassengerMaker capitolS = new DowntownPassengerMaker(19);
        DowntownPassengerMaker robertS = new DowntownPassengerMaker(20);
        DowntownPassengerMaker tenthS = new DowntownPassengerMaker(21);
        DowntownPassengerMaker centralS = new DowntownPassengerMaker(22);
        DowntownPassengerMaker unionD = new DowntownPassengerMaker(23);

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
