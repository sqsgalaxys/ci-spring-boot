package xyz.sydns.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 如何使用 lombok 的日志注解:
 * https://stackoverflow.com/questions/43901810/spring-boot-logging-with-lombok
 * Slf4j :
 * Simple Logging Facade for Java
 * Facade(面,正面,表面)
 * logback Slf4j
 * SpringBoot 如何定时执行任务:
 * https://stackoverflow.com/questions/36541857/spring-boot-infinite-loop-service
 *
 * @author sqsgalaxys
 */
@Service
@Slf4j
public class AlwaysLogger {


    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 4000)
    public void outLogger() {
        log.error("logging....");
    }

}