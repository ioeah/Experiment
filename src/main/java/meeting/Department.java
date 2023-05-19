package meeting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 19:44
 */
public class Department extends MyElement implements MyObserver {

    private List<MyElement> list = new ArrayList<>();

    public Department(String name) {
        setName(name);
    }

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    @Override
    public void receive() {
        System.out.println("部门：" + getName() + "收到通知，逐个给员工发送");
        for (MyElement element : list) {
            element.receive();
        }
    }
}
