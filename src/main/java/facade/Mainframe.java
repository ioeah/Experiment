package facade;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:49
 */
public class Mainframe {

    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }

    public void on() {

        try {
            memory.check();
            cpu.run();
            hardDisk.read();
            os.load();
            System.out.println("启动成功");
        } catch (Exception e) {
            System.out.println("启动失败");
        }
    }
}
