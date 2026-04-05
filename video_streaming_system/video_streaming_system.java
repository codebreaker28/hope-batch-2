import java.util.ArrayList;
class Video {
    private int videoId;
    private String title;
    private String filePath;

    public Video(int videoId, String title, String filePath) {
        this.videoId = videoId;
        this.title = title;
        this.filePath = filePath;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getFilePath() {
        return filePath;
    }
}
class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void watchVideo(Video video, Player player) {
        player.play(video);
    }
}
class Player {
    public void play(Video video) {
        System.out.println("Playing video: " + video.getTitle());
    }

    public void pause() {
        System.out.println("Video paused");
    }
}
class VideoService {
    private ArrayList<Video> videos = new ArrayList<>();

    public void uploadVideo(Video video) {
        videos.add(video);
        System.out.println("Video uploaded: " + video.getTitle());
    }

    public Video getVideo(int index) {
        if (index >= 0 && index < videos.size()) {
            return videos.get(index);
        }
        System.out.println("Invalid video index!");
        return null;
    }
}
class StreamingService {

    public void stream(Video video) {
        System.out.println("Streaming video from: " + video.getFilePath());
        System.out.println("Streaming in chunks...");
    }
}
public class Main {
    public static void main(String[] args) {

        // Create objects
        User user = new User(1, "Ananth");
        Video video = new Video(101, "Java Tutorial", "videos/java.mp4");

        VideoService videoService = new VideoService();
        StreamingService streamingService = new StreamingService();
        Player player = new Player();

        // Upload video
        videoService.uploadVideo(video);

        // Stream video
        streamingService.stream(video);

        // User watches video
        user.watchVideo(video, player);
    }
}
