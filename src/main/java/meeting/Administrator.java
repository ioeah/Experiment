package meeting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 19:30
 */
public class Administrator implements MySubject {

    private List<MyElement> meetingList = new ArrayList<>();

    public void attach(MyElement element) {
        meetingList.add(element);
        System.out.println(element.getName() + "完成注册");
    }

    public void detach(MyElement element) {
        meetingList.remove(element);
    }

    public void inform() {
        System.out.println("行政管理人员向员工发送消息");

        for (MyElement element : meetingList) {
            element.receive();
        }
    }
}
