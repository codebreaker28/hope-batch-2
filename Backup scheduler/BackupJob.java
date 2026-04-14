package model;

public class BackupJob {
    protected int jobId;
    protected String source;
    protected String destination;
    protected String time;

    public BackupJob(int jobId, String source, String destination, String time) {
        this.jobId = jobId;
        this.source = source;
        this.destination = destination;
        this.time = time;
    }

    public void execute() {
        System.out.println("Running generic backup...");
    }

    public void display() {
        System.out.println("Job ID: " + jobId);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Time: " + time);
    }
}
