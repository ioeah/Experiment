package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:22
 */
public class PCRAM implements RAM{
    @Override
    public void start() {
        System.out.println("PC电脑的RAM");
    }
}
