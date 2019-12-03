package com.roc.job.dao;

/**
 * @author Administrator
 * @date 2019/12/2
 */
import com.roc.job.entity.JobAndTrigger;

import java.util.List;

public interface JobAndTriggerMapper {
    public List<JobAndTrigger> getJobAndTriggerDetails();
}