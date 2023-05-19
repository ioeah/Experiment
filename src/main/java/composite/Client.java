package composite;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:37
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-姚逸钊-2020007751");
        try {
            AbstractFile obj1, obj2, obj3, obj4, obj5, obj6;
            obj1 = new ImageFile("apple");
            obj2 = new VideoFile("猫叫");
            obj3 = new TextFile("剑来");
            obj4 = new TextFile("雪中悍刀行");
            obj5 = new Folder("纯文本文件");
            obj5.add(obj3);
            obj5.add(obj4);
            obj6 = new Folder("文件夹文件");
            obj6.add(obj1);
            obj6.add(obj2);
            obj6.add(obj3);
            obj6.remove(obj3);
            obj6.add(obj5);

            obj6.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
