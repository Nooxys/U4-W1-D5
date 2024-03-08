package mediaPlayer;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //        AUDIO ----


//        System.out.println(" Audio player settings ");
//        Audio firstSong = new Audio("FirstTry", 3);
//        firstSong.play();
//        firstSong.turnDownVolume();
//        firstSong.play();
//        System.out.println(firstSong);
//        firstSong.turnUpVolume();
//        firstSong.turnUpVolume();
//        firstSong.turnUpVolume();
//        firstSong.turnUpVolume();
//        firstSong.turnUpVolume();
//        System.out.println(firstSong);
//        firstSong.play();
//        System.out.println(firstSong);

        //        IMAGE ----

//        System.out.println(" image player settings ");
//        Image firstImage = new Image("profile");
//        firstImage.show();
//        firstImage.turnDownBrightness();
//        firstImage.show();
//        System.out.println(firstImage);
//        firstImage.turnUpBrightness();
//        firstImage.turnUpBrightness();
//        firstImage.turnUpBrightness();
//        firstImage.turnUpBrightness();
//        firstImage.turnUpBrightness();
//        System.out.println(firstImage);
//        firstImage.show();
//        System.out.println(firstImage);


        //        VIDEO ----


//        System.out.println(" video player settings ");
//        Video firstVideo = new Video("firstVideotry", 3);
//        firstVideo.play();
//        System.out.println(firstVideo);
//        firstVideo.turnDownVolume();
//        firstVideo.turnDownBrightness();
//        System.out.println(firstVideo);
//        firstVideo.play();
//        firstVideo.turnUpVolume();
//        firstVideo.turnUpBrightness();
//        firstVideo.play();
//        System.out.println(firstVideo);


        //       ARRAY ----


//        System.out.println(" Media player content ");
//        Audio mySong = new Audio("never,forever", 3);
//        Audio mySong2 = new Audio("Sleepwalking", 5);
//        Video myVideo = new Video("my birthday", 7);
//        Video myVideo2 = new Video("epicode journey", 8);
//        Image myImg = new Image("Io");
//
//        MediaPlayer[] multimediaContent = {mySong, mySong2, myVideo, myVideo2, myImg};
//        for (int i = 0; i < multimediaContent.length; i++) {
//            if (multimediaContent[i] instanceof Audio) {
//                ((Audio) multimediaContent[i]).play();
//            }
//            if (multimediaContent[i] instanceof Video) {
//                ((Video) multimediaContent[i]).play();
//            }
//            if (multimediaContent[i] instanceof Image) {
//                ((Image) multimediaContent[i]).show();
//            }
//        }


        //         MEDIAPLAYER ----

        MediaPlayer[] multimediaContent = new MediaPlayer[5];
        Scanner scanner = new Scanner(System.in);


        //      ARRAY CREATION


        System.out.println("Inizializing player..");
        for (int i = 0; i < multimediaContent.length; i++) {
            System.out.println("Enter the number corresponding to the creation of multimedia content: ");

            System.out.println("1 for Audio file");
            System.out.println("2 for Video file");
            System.out.println("3 for Image file");
            int numberType = Integer.parseInt(scanner.nextLine());


            switch (numberType) {
                case 1: {
                    System.out.println("Please enter the title for your  content");
                    String title = scanner.nextLine();
                    System.out.println("new Audio file!");
                    System.out.println("Enter the duration for your soundtrack!");
                    int duration = Integer.parseInt(scanner.nextLine());
                    multimediaContent[i] = new Audio(title, duration);
                    break;
                }

                case 2: {
                    System.out.println("Please enter the title for your  content");
                    String title = scanner.nextLine();
                    System.out.println("new Video file!");
                    System.out.println("Enter the duration for your Video!");
                    int duration = Integer.parseInt(scanner.nextLine());
                    multimediaContent[i] = new Video(title, duration);
                    break;
                }

                case 3: {
                    System.out.println("Please enter the title for your  content");
                    String title = scanner.nextLine();
                    System.out.println("new Image file!");
                    multimediaContent[i] = new Image(title);
                    break;

                }

                default:
                    System.out.println("wrong number! choose an option between 1 and 3");
                    i--;

            }

        }


        //        CONTENT SELECTION

        int value = 10;
        while (value != 0) {
            System.out.println("Choose a file between 1 and 5, or 0 to close the application.");
            value = Integer.parseInt(scanner.nextLine());

            int option = 10;


            if (value > 0 && value <= 5) {
                while (option != 0) {

                    if (multimediaContent[value - 1] instanceof Audio) {
                        System.out.println("Choose an action: ");
                        System.out.println("0 to select another file.");
                        System.out.println("1 to raise the volume");
                        System.out.println("2 to lower the volume");
                        System.out.println("3 to play the soundtrack!");
                        option = Integer.parseInt(scanner.nextLine());

                        switch (option) {
                            case 1: {
                                ((Audio) multimediaContent[value - 1]).turnUpVolume();
                                System.out.println(" +1, volume increased!");
                                break;
                            }
                            case 2: {
                                ((Audio) multimediaContent[value - 1]).turnDownVolume();
                                System.out.println(" -1, volume decreased!");
                                break;
                            }
                            case 3: {
                                ((Audio) multimediaContent[value - 1]).play();
                                System.out.println("Enjoy your soundtrack!");
                                break;
                            }
                            case 0: {
                                break;
                            }

                            default: {
                                System.out.println("wrong option, select a number from 0 to 3");
                            }


                        }
                    }

                    if (multimediaContent[value - 1] instanceof Image) {
                        System.out.println("Choose an action: ");
                        System.out.println("0 to select another file.");
                        System.out.println("1 to raise the brightness");
                        System.out.println("2 to lower the brightness");
                        System.out.println("3 to show the image!");
                        option = Integer.parseInt(scanner.nextLine());

                        switch (option) {
                            case 1: {
                                ((Image) multimediaContent[value - 1]).turnUpBrightness();
                                System.out.println(" +1, brightness increased!");
                                break;
                            }
                            case 2: {
                                ((Image) multimediaContent[value - 1]).turnDownBrightness();
                                System.out.println(" -1, brightness decreased!");
                                break;
                            }
                            case 3: {
                                ((Image) multimediaContent[value - 1]).show();
                                System.out.println(" Enjoy your image!");
                                break;
                            }
                            case 0: {
                                break;
                            }

                            default: {
                                System.out.println("wrong option, select a number from 0 to 3");
                            }


                        }
                    }

                    if (multimediaContent[value - 1] instanceof Video) {
                        System.out.println("Choose an action: ");
                        System.out.println("0 to select another file.");
                        System.out.println("1 to raise the brightness");
                        System.out.println("2 to lower the brightness");
                        System.out.println("3 to raise the volume");
                        System.out.println("4 to lower the volume");
                        System.out.println("5 to play the video!");
                        option = Integer.parseInt(scanner.nextLine());

                        switch (option) {
                            case 1: {
                                ((Video) multimediaContent[value - 1]).turnUpBrightness();
                                System.out.println(" +1, brightness increased!");
                                break;
                            }
                            case 2: {
                                ((Video) multimediaContent[value - 1]).turnDownBrightness();
                                System.out.println(" -1, brightness decreased!");
                                break;
                            }
                            case 3: {
                                ((Video) multimediaContent[value - 1]).turnUpVolume();
                                System.out.println(" +1, volume increased!");
                                break;
                            }
                            case 4: {
                                ((Video) multimediaContent[value - 1]).turnDownVolume();
                                System.out.println(" -1, volume decreased!");
                                break;
                            }
                            case 5: {
                                ((Video) multimediaContent[value - 1]).play();
                                System.out.println("Enjoy your video!");
                                break;
                            }
                            case 0: {
                                break;
                            }

                            default: {
                                System.out.println("wrong option, select a number from 0 to 5");
                            }


                        }
                    }
                }

            } else if (value != 0) {
                System.out.println("wrong input! choose an option between 0 and 5!");
            }
        }
    }
}
