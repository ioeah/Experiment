package iterator;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/4 9:25
 */
public class Client {
    public static void display(Television tv) {
        TVIterator i = tv.createIterator();
        System.out.println("电视机频道：");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reserveDisplay(Television tv) {
        TVIterator i = tv.createIterator();
        i.setChannel(5);
        System.out.println("逆向遍历电视机频道：");
        while (!i.isFirst()) {
            i.previous();
            System.out.println(i.currentChannel().toString());
        }
    }


    public static void main(String[] args) {
        System.out.println("软件2031-康伟伟-2020007747");
        Television tv;
        tv = (Television) XMLUtil.getBean();
        display(tv);
        System.out.println("----------------------------------");
        reserveDisplay(tv);

    }
}
