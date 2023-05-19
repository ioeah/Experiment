package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:36
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("软件2031-康伟伟-2020007747");
        PlayerFactory playerFactory;
        MainWindow mainWindow;
        PlayerList playerList;

        playerFactory = (PlayerFactory) XMLUtil.getBean();
        mainWindow = playerFactory.createMainWindow();
        playerList = playerFactory.createPlayerList();

        mainWindow.play();
        playerList.list();
    }
}
