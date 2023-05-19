package adapter;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:06
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        Cat cat;
        Dog dog;
        Adapter adapter = new Adapter();
        adapter.setCat(new ConcreteCat());
        adapter.setDog(new ConcreteDog());
        cat = adapter;
        dog = adapter;
        cat.cry();
        System.out.println("-------------------------------");
        dog.action();
    }
}
