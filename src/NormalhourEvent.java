/**
 * Created by roels005 on 4/26/16.
 */
public class NormalhourEvent implements Event {
    NormalhourEvent(){}
    @Override
    public void run() {
        GreenlineSim.agenda.add(new RushhourEvent(),360);
        GreenlineSim.rushHourMultiplier = 1;
    }
}
