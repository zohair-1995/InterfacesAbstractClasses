import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>(); //T is the 'generic' type

    public abstract void checkTraffic();

    public void checkVehicles(){

        for(Object thing: traffic){
            if(thing instanceof Vehicle){
                ((Vehicle) thing).move();
            }
        }

    }

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }
}
