package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:27
 */
public interface PlayerFactory {

    MainWindow createMainWindow();

    PlayerList createPlayerList();
}
