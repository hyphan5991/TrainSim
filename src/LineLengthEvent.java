import java.io.File;
import java.io.PrintWriter;

/**
 * Created by snyde692 on 4/26/16.
 */
public class LineLengthEvent implements Event {

    @Override
    public void run() {
        for (int j = 0; j < Stop.stopArray.length; j++) {
            int east = Stop.stopArray[j][0].length();
            int west = Stop.stopArray[j][1].length();
            GreenlineSim.lineLengthData.add(east);
            GreenlineSim.lineLengthData.add(west);
        }

        GreenlineSim.agenda.add(this, 60);
    }


}
