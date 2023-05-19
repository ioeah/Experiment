package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:31
 */
public class RealPlayerWindow implements MainWindow {

    private RealPlayerAPI realPlayerAPI;

    public RealPlayerWindow() {
        realPlayerAPI = new RealPlayerAPI();
    }

    @Override
    public void play() {
        realPlayerAPI.run();
    }
}
