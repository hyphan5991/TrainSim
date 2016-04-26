/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainArray {
    private static Train[][] trainList = new Train[23][2];


    public static void add(Train n){
        int start = n.getStartLocation();
        int vector = n.getDirectionVector();

        if (vector < 0){
            trainList[start][1] = n;
        }
        else trainList[start][0] = n;
    }

    public static boolean move(Train n){
        int current = n.getCurrentLocation();
        int vector = n.getDirectionVector();

        if (current == 0 && vector < 0){
            if (trainList[0][0] != null){
                trainList[0][0] = n;
                n.setDirectionVector(1);
                return true;
            }
        }
        else if (current == 22 && vector > 0){
            if (trainList[22][1] != null){
                trainList[22][1] = n;
                n.setDirectionVector(-1);
                return true;
            }
        }
        else{
            if (vector < 0){
                if (trainList[current - 1][1] != null){
                    trainList[current - 1][1] = n;
                    n.setCurrentLocation(current - 1);
                    return true;
                }
            }
            else {
                if (trainList[current + 1][0] != null){
                    trainList[current + 1][0] = n;
                    n.setCurrentLocation(current + 1);
                    return true;
                }
            }
        }
        return false;

    }
}
