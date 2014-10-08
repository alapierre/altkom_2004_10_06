/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.util;

import java.io.File;
import java.nio.file.Files;
import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author admin
 */
public class FileListener {
    
    private Logger logger = Logger.getLogger(getClass());
    
    private File path;
    
    
    @Autowired
    private JobLauncher jobLauncher;
    
    @Autowired
    @Qualifier("importCustomers")
    private Job job;
    
    public boolean checkFilesExist() {
        
        File[] files = path.listFiles();
     
        if(files.length != 0) {
            for(File f : files) {
                System.out.println(f);
            }
            executeTask();
            return true;
        }
        
        return false;
    }

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }
    
    private void executeTask() {
        try {
            
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Exit Status : " + execution.getStatus());
            
        } catch (Exception e) {
            logger.error("błąd wykonywania zadania", e);
        }
    }
    
}
