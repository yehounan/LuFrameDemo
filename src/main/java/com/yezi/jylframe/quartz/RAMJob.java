package com.yezi.jylframe.quartz;

import com.yezi.jylframe.core.JDate;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * created by yezi on 2018/7/31
 */
public class RAMJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(RAMJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("任务开始执行了：" + JDate.now());
    }
}
