package observer;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 10:51
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        Stock stock = new Stock();
        Investor investor = new ConcreteInvestor();
        stock.setName("huawei");
        stock.setPrice(234.5);
        stock.attach(investor);

        stock.notifyInvestor();
    }
}
