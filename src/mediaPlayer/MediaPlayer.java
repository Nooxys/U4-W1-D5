package mediaPlayer;

public abstract class MediaPlayer {

    //    ATTRIBUTES


    protected String title;

    //    CONSTRUCTOR


    public MediaPlayer(String title) {
        this.title = title;
    }


    //    METHODS


    @Override
    public String toString() {
        return "MediaPlayer{" +
                "title='" + title + '\'' +
                '}';
    }
}
