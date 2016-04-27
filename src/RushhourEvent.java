/**
 * Created by roels005 on 4/26/16.
 */
public class RushhourEvent implements Event {
    public RushhourEvent(){};

    public void run(){
        GreenlineSim.agenda.add(new NormalhourEvent(), 180);
        GreenlineSim.rushHourMultiplier = 1.5;
    }
}
