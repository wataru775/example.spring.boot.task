package org.mmpp.springboot.example.task.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledCronTask {

    private final Logger logger = LoggerFactory.getLogger(ScheduledCronTask.class);

    /**
     * cronで指定した周期でtaskを実行する.(zone : cronの起動時間のタイムゾーンを指定する. 未指定時はデフォルトのtimezoneを使用する.)
     */
    @Scheduled(cron = "0 * * * * *", zone = "Asia/Tokyo")
    public void doSomething() {
        logger.info("cron job");
    }
}
