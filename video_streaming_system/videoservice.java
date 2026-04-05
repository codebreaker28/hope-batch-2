import java.util.ArrayList;

class VideoService {
    private ArrayList<Video> videos = new ArrayList<>();

    public void uploadVideo(Video video) {
        videos.add(video);
        System.out.println("Video uploaded: " + video.getTitle());
    }

    public Video getVideo(int index) {
        return videos.get(index);
    }
}
