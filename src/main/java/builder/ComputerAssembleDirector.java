package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:57
 */
public class ComputerAssembleDirector {

    private ComputerBuilder cb;

    public void setComputerBuilder(ComputerBuilder cb) {
        this.cb = cb;
    }

    public Computer assemble() {
        cb.buildCPU();
        cb.buildRAM();
        cb.buildHDD();
        cb.buildHost();
        cb.buildDisplay();
        return cb.getComputer();
    }
}
