package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:34
 */
public class RealPlayerFactory implements PlayerFactory {

    @Override
    public MainWindow createMainWindow() {
        return new RealPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new RealPlayerList();
    }
}
