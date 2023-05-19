package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:59
 */
public class Desktop extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("RAM");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("HDD");
    }

    @Override
    public void buildHost() {
        computer.setHost("Host");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("台式机包含显示器");
    }
}
