package org.mmpp.springboot.example.task.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledInitialDelayTask {
    private final Logger logger = LoggerFactory.getLogger(ScheduledInitialDelayTask.class);

    /**
     * 指定時間後に最初のtaskを開始する. 単位はms. fixedDelay又はfixedRateと組み合わせて使用する.
     */
    @Scheduled(initialDelay = 800, fixedRate = 5000)
    public void doJob() {
        logger.info("initialDelay do");
    }
}
