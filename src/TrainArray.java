/**
 * Created by jakesnyder-hansen on 4/25/16.
 */
public class TrainArray {
    private Train[][] trainList;

    public TrainArray(){
        trainList = new Train[22][2];
    }

    public void add(Train n){
        int start = n.getStartLocation();
        int vector = n.getDirectionVector();

        if (vector < 0){
            trainList[start - 1][1] = n;
        }
        else trainList[start - 1][0] = n;
    }

    public void move(Train n){
        int current = n.getCurrentLocation();
    }
}
