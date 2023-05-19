package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 9:14
 */
public class Multiton {

    private static List<Multiton> array = new ArrayList<>();

    private Multiton(){}

    public static Multiton getInstance(){
        int index = random();
        if(array.size() == 0 || array.size() == index) {
            System.out.println("所需的该实例对象不存在，进行创建");
            array.add(new Multiton());
        } else {
            System.out.println("该实例对象已存在");
        }
        return array.get(index);
    }

    public static int random(){
        Random random = new Random();
        return random.nextInt(array.size() == 0 ? 1 : array.size() + 1);
    }

}
