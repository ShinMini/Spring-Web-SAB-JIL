package com.springweb.miniWeb;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// 5초마다 server 지정된 method 실행
@Component
public class MiniTasks {

	private static final Logger log = LoggerFactory.getLogger(MiniTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
	}
}

/*
 * Scheduled module 특징
 * The Scheduled annotation defines when a particular method runs.
 * -> Scheduled annotation은 특정 메소드가 실행될 때를 정의함.
 * : 특정 메소드 실행시 scheduled annotation 실행.
 * 
 * This example uses [fixedRate], which specifies the interval
 * btween method invocations, measured from the start time of each invoations,
 * measured from the start time of each invocation.
 * There are other options, such as [fixedDelay], which specifeds the interval
 * between invocations
 * mesured from the completion of the task.
 * You can also use [@Scheduled(cron="...")] expressions
 * for more sophoisticated task scheduling.
 * 
 */