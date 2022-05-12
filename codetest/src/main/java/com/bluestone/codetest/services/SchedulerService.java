package com.bluestone.codetest.services;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
	
	@Scheduled(cron = "5 * * * * *")
	public void scheduledMethod() {
		System.out.println("Corn Scheduler Time :" +new Date());
	}
}
