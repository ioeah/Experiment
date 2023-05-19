package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:26
 */
public class PCFactory implements ComputerFactory{
    @Override
    public CPU produceCPU() {
        return new PCCPU();
    }

    @Override
    public RAM produceRAM() {
        return new PCRAM();
    }
}
