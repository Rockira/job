package com.roc.job.service;

/**
 * @author Administrator
 * @date 2019/12/2
 */
import com.roc.job.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}