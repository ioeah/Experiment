package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:31
 */
public class RealPlayerList implements PlayerList{

    private RealPlayerAPI realPlayerAPI;

    public RealPlayerList() {
        realPlayerAPI = new RealPlayerAPI();
    }

    @Override
    public void list() {
        realPlayerAPI.display();
    }
}
