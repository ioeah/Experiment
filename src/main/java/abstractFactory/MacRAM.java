package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:22
 */
public class MacRAM implements RAM{
    @Override
    public void start() {
        System.out.println("Mac电脑的RAM");
    }
}
