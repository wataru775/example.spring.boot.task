package org.mmpp.springboot.example.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * fixedDelay   : taskの実行完了時点から指定時間後に次のtaskを実行する. 単位はms.
 * fixedRate	: taskの実行開始時点から指定時間後に次のtaskを実行する. 単位はms.
 * initialDelay	: 指定時間後に最初のtaskを開始する. 単位はms. fixedDelay又はfixedRateと組み合わせて使用する.
 * cron	        : cronで指定した周期でtaskを実行する.(zone : cronの起動時間のタイムゾーンを指定する. 未指定時はデフォルトのtimezoneを使用する.)
 *
 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html
 * 
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
