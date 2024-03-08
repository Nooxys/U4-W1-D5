package mediaPlayer;

import interfaces.Media_AudioVideo;
import interfaces.Media_ImgVideo;

public class Video extends MediaPlayer implements Media_AudioVideo, Media_ImgVideo {

    //    ATTRIBUTES

    private int volume = 3;
    private int brightness = 3;
    private int duration;


    //    CONSTRUCTOR
    public Video(String title, int duration) {
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
        brightnessNow();
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

    @Override
    public void turnUpBrightness() {
        setBrightness(this.brightness + 1);
    }

    @Override
    public void turnDownBrightness() {
        setBrightness(this.brightness - 1);
    }

    @Override
    public void brightnessNow() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println("*");
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

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            System.err.println("Minimum brightness reached. Please turn up the brightness");
        } else if (brightness > 5) {
            System.err.println("Maximum brightness reached. Please turn down the brightness");
        } else {
            this.brightness = brightness;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "volume=" + volume +
                ", brightness=" + brightness +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }
}
