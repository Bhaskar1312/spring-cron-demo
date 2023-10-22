package com.example.springcrondemo;



import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Configuration
@EnableScheduling
public class Scheduler {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Scheduled(cron = "0 */1 16 * * ?")
    public void someJob() {
        logger.info(LocalDateTime.now().toString());
    }

    @EventListener(ApplicationReadyEvent.class)
    // @Scheduled(cron = "0 */1 * * * *")
    public void isAppReady() {
        logger.info("Just printing Ready stuff");
    }

}
