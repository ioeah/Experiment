package adapter;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:00
 */
public class ConcreteCat implements Cat{
    @Override
    public void cry() {
        System.out.println("喵喵叫");
    }

    @Override
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
