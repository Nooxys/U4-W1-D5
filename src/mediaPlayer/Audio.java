package mediaPlayer;

import interfaces.Media_AudioVideo;

public class Audio extends MediaPlayer implements Media_AudioVideo {

    //    ATTRIBUTES

    private int volume = 3;
    private int duration;

    //    CONSTRUCTOR

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
    }


    //    METHODS


    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println(this.title);
        }
        volumeNow();
    }

    @Override
    public void turnUpVolume() {

        setVolume(this.volume + 1);
    }

    @Override
    public void turnDownVolume() {

        setVolume(this.volume - 1);
    }

    @Override
    public void volumeNow() {
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    public void setVolume(int volume) {
        if (this.volume < 0) {
            System.err.println("Minimum volume reached. Please turn up the volume.");
        } else if (volume > 5) {
            System.err.println("Maximum volume reached. Please turn down brightness");
        } else {
            this.volume = volume;
        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }
}

