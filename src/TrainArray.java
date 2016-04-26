/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainArray {
    public static Train[][] trainList = new Train[23][2];

    public static void add(Train n){
        int start = n.getStartLocation();
        int vector = n.getDirectionVector();

        if (vector < 0){
            trainList[start][1] = n;
        }
        else {
            trainList[start][0] = n;
        }
    }

    public static boolean move(Train n){
        int current = n.getCurrentLocation();
        int vector = n.getDirectionVector();

        if (current == 0 && vector < 0){
            if (trainList[0][0] == null){
                trainList[0][0] = n;
                trainList[0][1] = null;
                n.setDirectionVector(1);
                return true;
            }
        }
        else if (current == 22 && vector > 0){
            if (trainList[22][1] == null){
                trainList[22][1] = n;
                trainList[22][0] = null;
                n.setDirectionVector(-1);
                return true;
            }
        }
        else{
            if (vector < 0){
                if (trainList[current - 1][1] == null){
                    trainList[current - 1][1] = n;
                    trainList[current][1] = null;
                    n.setCurrentLocation(current - 1);
                    return true;
                }
            }
            else {
                if (trainList[current + 1][0] == null){
                    trainList[current + 1][0] = n;
                    trainList[current][0] = null;
                    n.setCurrentLocation(current + 1);
                    return true;
                }
            }
        }
        return false;

    }
}
