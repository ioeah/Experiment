package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 9:00
 */
public class Server extends Desktop{

    @Override
    public void buildDisplay() {
        computer.setDisplay("服务器不包含显示器");
    }
}
