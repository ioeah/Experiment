package iterator;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/4 9:22
 */
public class TCLIterator implements TVIterator {
    private TCLTelevision tv;

    public TCLIterator(TCLTelevision tv) {
        this.tv = tv;
    }

    private int currentIndex = 0;

    @Override
    public void setChannel(int i) {
        currentIndex = i;
    }

    @Override
    public void next() {
        if (currentIndex < tv.obj.length) {
            currentIndex++;
        }
    }

    @Override
    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
    }

    @Override
    public boolean isLast() {
        return currentIndex == tv.obj.length;
    }

    @Override
    public Object currentChannel() {
        return tv.obj[currentIndex];
    }

    @Override
    public boolean isFirst() {
        return currentIndex == 0;
    }
}
