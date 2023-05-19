package meeting;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 19:49
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        Administrator administrator = new Administrator();
        Employee employee1 = new Employee("FuBai");
        Employee employee2 = new Employee("ioeah");
        Employee employee3 = new Employee("XueBuHui");
        Employee employee4 = new Employee("BigHeaded");
        Employee employee5 = new Employee("LuoSisama");
        Employee employee6 = new Employee("Ranni");

        Department department1 = new Department("Design Pattern");
        department1.add(employee2);
        department1.add(employee4);
        department1.add(employee5);
        department1.add(employee6);

        administrator.attach(employee1);
        administrator.attach(employee3);
        administrator.attach(department1);

        administrator.inform();
    }
}
