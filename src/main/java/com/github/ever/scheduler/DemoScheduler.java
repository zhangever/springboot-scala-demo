package com.github.ever.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tony on 2017/8/30.
 */
@Component
public class DemoScheduler {

    /**
     * 1.fixedRate是每多次分钟一次,不论业务执行花费了多少时间,都是1分钟执行1次;
     * 2.fixedDelay是当任务执行完毕后1分钟再执行,所以根据实际业务不同,选择不同的方式;
     * 3.cron
     */
    private Logger logger = LoggerFactory.getLogger(DemoScheduler.class);

    @Scheduled(fixedDelay=60 * 1000)
    public void fixedDelayJob(){
        logger.info(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()) + ">>> fixedDelay invoke...");
    }

    @Scheduled(fixedRate=60 * 1000)
    public void fixedRateJob(){
        logger.info(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()) + " >>> fixedRate invoke...");
    }

    @Scheduled(cron="0 15 12 * * ?")
    public void cronJob(){
        logger.info(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()) + " >>> cron invoke....");
    }

}
