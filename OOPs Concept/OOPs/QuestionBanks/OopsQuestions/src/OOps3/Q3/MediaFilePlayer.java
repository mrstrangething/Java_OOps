package OOps3.Q3;

public class MediaFilePlayer {

    // Todo: Implement a method called playMedia
    // The play media will print the details of the file and then call the play method.
    // that demonstrates run-time polymorphism

    public static void playMedia(MediaFile mediaFile) {// This method accepts a MediaFile object and demonstrates run-time polymorphism
        
        System.out.println(mediaFile.getDetails());// Print the details of the media file

        mediaFile.play();
    }


    public static void main(String[] args) {
        MediaFile audioFile = new AudioFile("Song Title", "Sonu Nigam", "audio.mp3");
        MediaFile videoFile = new VideoFile("Video Title", "video.mp4","30");

        playMedia(audioFile);
        playMedia(videoFile);
    }
}
