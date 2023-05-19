package singleton;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 9:27
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        Multiton multiton1, multiton2, multiton3;
        multiton1 = Multiton.getInstance();
        multiton2 = Multiton.getInstance();
        multiton3 = Multiton.getInstance();

        System.out.println(multiton1 == multiton2);
        System.out.println(multiton1 == multiton3);
        System.out.println(multiton2 == multiton3);
    }
}
