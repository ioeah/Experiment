package iterator;

import java.util.ArrayList;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/4 9:02
 */
public class SkyworthTelevision implements Television{
    protected Object[] obj = {"CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4", "CCTV-5", "CCTV-6", "CCTV-7", "CCTV-8"};

    @Override
    public TVIterator createIterator() {
        return new SkyworthIterator(this);
    }
}
