package abstractFactory;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 8:30
 */
public class Client {

    public static void main(String[] args) {

        try {
            System.out.println("软件2031-康伟伟-2020007747");
            ComputerFactory factory;
            CPU cpu;
            RAM ram;
            factory = (ComputerFactory) XMLUtil.getBean();
            cpu = factory.produceCPU();
            cpu.run();
            ram = factory.produceRAM();
            ram.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
