class StreamingService {

    public void stream(Video video) {
        System.out.println("Streaming video from: " + video.getFilePath());
        System.out.println("Streaming in chunks...");
    }
}
