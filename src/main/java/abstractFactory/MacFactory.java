package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:27
 */
public class MacFactory implements ComputerFactory{
    @Override
    public CPU produceCPU() {
        return new MacCPU();
    }

    @Override
    public RAM produceRAM() {
        return new MacRAM();
    }
}
