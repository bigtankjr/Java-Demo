import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static List<Car> carList = new ArrayList<>();
    public static void main(String[] args) {
        Car porsche = new Car("Porsche",200,"mph");
        Car nissan = new Car("Nissan",(210/1.609344),"kph");
        Car lunarlander = new Car("Lunar Lander",0,"fps");
/* 5,280 ft in mile

 */
        carList.add(porsche);
        carList.add(nissan);
        carList.add(lunarlander);



    }

    public static Car findMax(List<Car> cList){

        if(cList == null || cList.size()==0)
            return

        return new Car();
    }
}
