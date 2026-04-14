package scheduler;

import java.util.ArrayList;
import model.BackupJob;

public class Scheduler {

    private ArrayList<BackupJob> jobs = new ArrayList<>();

    public void addJob(BackupJob job) {
        jobs.add(job);
        System.out.println("Backup job added!");
    }

    public void showJobs() {
        for (BackupJob job : jobs) {
            System.out.println("\n--- Job Details ---");
            job.display();
        }
    }

    public BackupJob getJob(int index) {
        if (index < jobs.size()) {
            return jobs.get(index);
        }
        return null;
    }
}
