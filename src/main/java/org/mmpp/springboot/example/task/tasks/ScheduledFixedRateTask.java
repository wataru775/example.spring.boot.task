package org.mmpp.springboot.example.task.tasks;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledFixedRateTask {

    private final Logger logger = LoggerFactory.getLogger(ScheduledFixedRateTask.class);

    /**
     * taskの実行完了時点から指定時間後に次のtaskを実行する. 単位はms.
     */
    @Scheduled(fixedRate = 5000)
    public void doJob() {
        logger.info("fixedRate do");
    }
}
