package mediaPlayer;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Audio player settings ");
        Audio firstSong = new Audio("FirstTry", 3);
        firstSong.play();
        firstSong.turnDownVolume();
        System.out.println(firstSong);
        firstSong.play();
        firstSong.turnDownVolume();
        firstSong.play();
        firstSong.turnDownVolume();
        firstSong.play();
        System.out.println(firstSong);
        firstSong.turnDownVolume();
        firstSong.turnDownVolume();
        firstSong.turnDownVolume();
        System.out.println(firstSong);
        firstSong.play();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.play();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.play();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        firstSong.turnUpVolume();
        System.out.println(firstSong);
        firstSong.play();
    }
}