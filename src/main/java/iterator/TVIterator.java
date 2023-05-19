package iterator;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/4 8:59
 */
public interface TVIterator {

    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    Object currentChannel();

    boolean isFirst();
}
