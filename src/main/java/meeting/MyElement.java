package meeting;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 19:33
 */
public abstract class MyElement {

    private String name;

    public abstract void receive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
