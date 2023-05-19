package meeting;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 19:40
 */
public class Employee extends MyElement implements MyObserver {

    public Employee(String name) {
        setName(name);
    }

    @Override
    public void receive() {
        System.out.println("员工：" + getName() + "收到了通知");
    }
}
