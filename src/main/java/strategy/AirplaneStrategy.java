package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:34
 */
public class AirplaneStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("坐飞机旅游");
    }
}
