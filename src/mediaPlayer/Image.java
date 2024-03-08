package mediaPlayer;

import interfaces.Media_ImgVideo;

public class Image extends MediaPlayer implements Media_ImgVideo {


    //    ATTRIBUTES
    private int brightness = 3;


    //    CONSTRUCTOR

    public Image(String title) {
        super(title);
    }


    //    METHODS

    public void show() {
        System.out.println(this.title);
        brightnessNow();
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
        return "Image{" +
                "brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}

