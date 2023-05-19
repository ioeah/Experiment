package observer;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 10:49
 */
public class ConcreteInvestor implements Investor{
    @Override
    public void upDate() {

        System.out.println("收到了股票价格变动的信息");
    }
}
