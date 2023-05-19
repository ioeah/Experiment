package composite;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/22 17:24
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract void display();
}
