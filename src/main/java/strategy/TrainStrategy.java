package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:34
 */
public class TrainStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("乘火车旅游");
    }
}
