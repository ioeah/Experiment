package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:31
 */
public class Person {

    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.travel();
    }
}
