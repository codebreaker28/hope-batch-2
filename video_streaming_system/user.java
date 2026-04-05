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
