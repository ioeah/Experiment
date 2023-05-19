package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:59
 */
public class Notebook extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("笔记本的CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("笔记本的RAM");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("笔记本的HDD");
    }

    @Override
    public void buildHost() {
        computer.setHost("笔记本的Host");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("笔记本的Display");
    }
}
