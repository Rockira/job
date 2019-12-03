package com.roc.job.service.impl;

/**
 * @author Administrator
 * @date 2019/12/2
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roc.job.dao.JobAndTriggerMapper;
import com.roc.job.entity.JobAndTrigger;
import com.roc.job.service.IJobAndTriggerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class JobAndTriggerImpl implements IJobAndTriggerService{

    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;

    @Override
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
        PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
        return page;
    }

}
