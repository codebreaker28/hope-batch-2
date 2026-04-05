public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Ananth");
        Video video = new Video(101, "Java Tutorial", "videos/java.mp4");

        VideoService videoService = new VideoService();
        StreamingService streamingService = new StreamingService();
        Player player = new Player();

        videoService.uploadVideo(video);
        streamingService.stream(video);

        user.watchVideo(video, player);
    }
}
