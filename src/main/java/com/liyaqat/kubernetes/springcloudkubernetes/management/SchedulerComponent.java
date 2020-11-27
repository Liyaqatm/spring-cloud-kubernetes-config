package com.liyaqat.kubernetes.springcloudkubernetes.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerComponent {

    @Autowired
    WelcomeConfiguration config;

    @Autowired
    private ServiceConfiguration serviceConfiguration;


    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        System.out.println(config.getMessage());
        System.out.println(serviceConfiguration.getGreet());

    }
}
