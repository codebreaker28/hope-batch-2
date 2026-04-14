package service;

import model.BackupJob;

public class BackupService {

    public void runBackup(BackupJob job) {
        System.out.println("\nStarting backup...");
        job.execute();  
        System.out.println("Backup completed!");
    }
}
