package strategy;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 11:35
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");

        Person person = new Person();

        TravelStrategy strategy;
        strategy = (TravelStrategy) XMLUtil.getBean();

        person.setStrategy(strategy);
        person.travel();
    }
}
