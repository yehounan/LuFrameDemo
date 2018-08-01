package com.yezi.jylframe.quartz;

import com.yezi.jylframe.core.JDate;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

/**
 * created by yezi on 2018/7/31
 */
public class JdbcJob implements Job {

    private static final Logger log = LoggerFactory.getLogger(JdbcJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("JDBCJob开始了===================");

        log.info("Hello quartz :  " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(JDate.now()));

        log.info("JDBCJob结束了===================");
    }
}
