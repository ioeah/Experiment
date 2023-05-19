package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:35
 */
public class BicycleStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("骑自行车旅游");
    }
}
