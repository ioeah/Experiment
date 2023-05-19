package media;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 16:30
 */
public class MediaPlayerWindow implements MainWindow {

    private MediaPlayerAPI mediaPlayerAPI;

    public MediaPlayerWindow() {
        mediaPlayerAPI = new MediaPlayerAPI();
    }

    @Override
    public void play() {
        mediaPlayerAPI.run();
    }
}
