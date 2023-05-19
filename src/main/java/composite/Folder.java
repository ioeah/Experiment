package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:25
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> fileList = new ArrayList<>();
    private String fileName;

    public Folder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    public void display() {
        System.out.println("展示文件夹文件：" + fileName);
        for (AbstractFile abstractFile : fileList) {
            abstractFile.display();
        }
    }
}
