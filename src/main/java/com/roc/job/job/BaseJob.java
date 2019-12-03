package com.roc.job.job;

/**
 * @author Administrator
 * @date 2019/12/2
 */
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public interface BaseJob extends Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException;
}