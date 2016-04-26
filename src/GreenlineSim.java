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
        DowntownPassengerMaker targetField = new DowntownPassengerMaker();
        DowntownPassengerMaker wareHouseD = new DowntownPassengerMaker();
        DowntownPassengerMaker nicolletM = new DowntownPassengerMaker();
        DowntownPassengerMaker governmentP = new DowntownPassengerMaker();
        DowntownPassengerMaker usBank = new DowntownPassengerMaker();
        CampusPassengerMaker westBank = new CampusPassengerMaker();
        CampusPassengerMaker eastBank = new CampusPassengerMaker();
        CampusPassengerMaker stadiumV = new CampusPassengerMaker();
        PassangerMaker prospectPark = new PassangerMaker();
        PassangerMaker westgateS = new PassangerMaker();
        PassangerMaker raymondA = new PassangerMaker();
        PassangerMaker fairviewA = new PassangerMaker();
        PassangerMaker snellingA = new PassangerMaker();
        PassangerMaker hamlineA = new PassangerMaker();
        PassangerMaker lexingtonP = new PassangerMaker();
        PassangerMaker victoriaS = new PassangerMaker();
        PassangerMaker daleS = new PassangerMaker();
        PassangerMaker westernA = new PassangerMaker();
        DowntownPassengerMaker capitolS = new DowntownPassengerMaker();
        DowntownPassengerMaker robertS = new DowntownPassengerMaker();
        DowntownPassengerMaker tenthS = new DowntownPassengerMaker();
        DowntownPassengerMaker centralS = new DowntownPassengerMaker();
        DowntownPassengerMaker unionD = new DowntownPassengerMaker();

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
