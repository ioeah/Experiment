package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:24
 */
public interface ComputerFactory {

    public CPU produceCPU();
    public RAM produceRAM();
}
