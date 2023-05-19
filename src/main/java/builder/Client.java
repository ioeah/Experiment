package builder;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/21 9:04
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        ComputerBuilder cb = (ComputerBuilder) XMLUtil.getBean();
        ComputerAssembleDirector director = new ComputerAssembleDirector();
        director.setComputerBuilder(cb);
        Computer computer = director.assemble();

        System.out.println("电脑组成：");
        System.out.println(computer.getCPU());
        System.out.println(computer.getRAM());
        System.out.println(computer.getHDD());
        System.out.println(computer.getHost());
        System.out.println(computer.getDisplay());
    }
}
