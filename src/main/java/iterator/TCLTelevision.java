package iterator;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/4 9:21
 */
public class TCLTelevision implements Television{
    protected Object[] obj = {"湖南卫视", "北京卫视", "上海卫视", "湖北卫视", "黑龙江卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator(this);
    }
}
