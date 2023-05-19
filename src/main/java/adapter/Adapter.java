package adapter;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 16:59
 */
public class Adapter implements Dog, Cat {
    private Dog dog;
    private Cat cat;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void cry() {
        System.out.println("学狗叫");
        dog.wang();
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        System.out.println("狗学抓老鼠");
        cat.catchMouse();
    }
}
