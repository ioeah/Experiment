package composite;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:24
 */
public class ImageFile extends AbstractFile {
    private String fileName;

    public ImageFile(String fileName) {
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
        System.out.println("展示图片文件：" + fileName);
    }
}
