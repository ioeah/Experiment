package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:35
 */
public class WalkStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("步行旅游");
    }
}
