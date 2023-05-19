package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:31
 */
public class MediaPlayerList implements PlayerList{

    private MediaPlayerAPI mediaPlayerAPI;

    public MediaPlayerList() {
        mediaPlayerAPI = new MediaPlayerAPI();
    }

    @Override
    public void list() {
        mediaPlayerAPI.display();
    }
}
