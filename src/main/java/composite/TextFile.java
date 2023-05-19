package composite;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:25
 */
public class TextFile extends AbstractFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        throw new RuntimeException("非文件夹文件" + fileName);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        throw new RuntimeException("非文件夹文件" + fileName);
    }

    @Override
    public void display() {
        System.out.println("展示文本文件：" + fileName);
    }
}
