package model;

public class IncrementalBackup extends BackupJob {

    public IncrementalBackup(int jobId, String source, String destination, String time) {
        super(jobId, source, destination, time);
    }

    @Override
    public void execute() {
        System.out.println("Performing INCREMENTAL backup (changed files only)");
    }
}
