package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:21
 */
public class PCCPU implements CPU{
    @Override
    public void run() {
        System.out.println("PC电脑的CPU");
    }
}
