package org.mmpp.springboot.example.task.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledFixedDelayTask {

    private final Logger logger = LoggerFactory.getLogger(ScheduledFixedDelayTask.class);

    /**
     * taskの実行開始時点から指定時間後に次のtaskを実行する. 単位はms.
     */
    @Scheduled(fixedDelay = 3000)
    public void doJob() {
        logger.info("fixedDelay job");
    }
}
