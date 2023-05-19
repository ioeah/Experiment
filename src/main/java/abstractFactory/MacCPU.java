package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:22
 */
public class MacCPU implements CPU{
    @Override
    public void run() {
        System.out.println("Mac电脑的CPU");
    }
}
