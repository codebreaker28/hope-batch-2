import java.util.*;

// ---------------- Base Class ----------------
class BackupJob {
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

// ---------------- Inheritance ----------------
class FullBackup extends BackupJob {

    public FullBackup(int jobId, String source, String destination, String time) {
        super(jobId, source, destination, time);
    }

    @Override
    public void execute() {
        System.out.println("Performing FULL backup from " + source + " to " + destination);
    }
}

class IncrementalBackup extends BackupJob {

    public IncrementalBackup(int jobId, String source, String destination, String time) {
        super(jobId, source, destination, time);
    }

    @Override
    public void execute() {
        System.out.println("Performing INCREMENTAL backup (changed files only)");
    }
}

// ---------------- Service (Abstraction) ----------------
class BackupService {

    public void runBackup(BackupJob job) {
        System.out.println("\nStarting backup...");
        job.execute();   // Polymorphism
        System.out.println("Backup completed!");
    }
}

// ---------------- Scheduler ----------------
class Scheduler {
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

// ---------------- Main Class ----------------
public class BackupScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scheduler scheduler = new Scheduler();
        BackupService service = new BackupService();

        // Create jobs
        BackupJob job1 = new FullBackup(1, "C:/Data", "D:/Backup", "10:00 AM");
        BackupJob job2 = new IncrementalBackup(2, "C:/Projects", "D:/Backup", "12:00 PM");

        // Add jobs
        scheduler.addJob(job1);
        scheduler.addJob(job2);

        // Show jobs
        scheduler.showJobs();

        // Run backups
        service.runBackup(job1);
        service.runBackup(job2);

        sc.close();
    }
}
