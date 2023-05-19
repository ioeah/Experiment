package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:33
 */
public class MediaPlayerFactory implements PlayerFactory {

    @Override
    public MainWindow createMainWindow() {
        return new MediaPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new MediaPlayerList();
    }
}
