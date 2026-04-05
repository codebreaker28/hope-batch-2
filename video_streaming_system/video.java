class Video {
    private int videoId;
    private String title;
    private String filePath;

    public Video(int videoId, String title, String filePath) {
        this.videoId = videoId;
        this.title = title;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getFilePath() {
        return filePath;
    }
}
