package main;

import model.*;
import service.*;
import scheduler.*;

public class Main {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();
        BackupService service = new BackupService();

        // Create jobs
        BackupJob job1 = new FullBackup(1, "C:/Data", "D:/Backup", "10:00 AM");
        BackupJob job2 = new IncrementalBackup(2, "C:/Projects", "D:/Backup", "12:00 PM");

        // Add jobs
        scheduler.addJob(job1);
        scheduler.addJob(job2);

        // Display jobs
        scheduler.showJobs();

        // Run backups
        service.runBackup(job1);
        service.runBackup(job2);
    }
}
