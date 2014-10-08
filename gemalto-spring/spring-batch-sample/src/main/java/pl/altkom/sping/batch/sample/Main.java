/*
 * Copyright 2014-09-16 the original author or authors.
 */

package pl.altkom.sping.batch.sample;


import javax.xml.bind.Marshaller;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
public class Main {
    
    public static void main(String[] args) {
        
        String[] springConfig  = 
		{	
			"batch-task_customer_to_db.xml" 
		};
 
	ApplicationContext context = 
			new ClassPathXmlApplicationContext(springConfig);
        
        //runTask(context);
        
 
	System.out.println("task scheduler started");
        
        
    }

    private static void runTask(ApplicationContext context) throws BeansException {
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("importCustomers");
        
        try {
            
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Exit Status : " + execution.getStatus());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
