package adapter;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:00
 */
public class ConcreteDog implements Dog{
    @Override
    public void wang() {
        System.out.println("汪汪叫");
    }

    @Override
    public void action() {
        System.out.println("做动作");
    }
}
