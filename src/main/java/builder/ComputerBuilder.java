package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:54
 */
public abstract class ComputerBuilder {

    protected Computer computer = new Computer();

    public abstract void buildCPU();

    public abstract void buildRAM();

    public abstract void buildHDD();

    public abstract void buildHost();

    public abstract void buildDisplay();

    public Computer getComputer() {
        return computer;
    }
}
