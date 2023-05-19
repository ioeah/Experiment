package composite;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:24
 */
public class VideoFile extends AbstractFile {
    private String fileName;

    public VideoFile(String fileName) {
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
        System.out.println("展示视频文件：" + fileName);
    }
}
