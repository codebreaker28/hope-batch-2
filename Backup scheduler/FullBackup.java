package model;

public class FullBackup extends BackupJob {

    public FullBackup(int jobId, String source, String destination, String time) {
        super(jobId, source, destination, time);
    }

    @Override
    public void execute() {
        System.out.println("Performing FULL backup from " + source + " to " + destination);
    }
}
