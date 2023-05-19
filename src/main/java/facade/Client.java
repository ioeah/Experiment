package facade;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:55
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        Mainframe mainframe = new Mainframe();
        try {
            mainframe.on();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
