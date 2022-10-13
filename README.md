# spring-web

* make mini web page combined DB
* Spring Scheduled annotation을 활용한 기본 예제

# dev env
* #spring-boot #spring-jdbc #postgreSQL #maven #vscode #JDK11


# Scheduled module 특징

 * The Scheduled annotation defines when a particular method runs.
 * -> Scheduled annotation은 특정 메소드가 실행될 때를 정의함.
 * : 특정 메소드 실행시 scheduled annotation 실행.
  
 * This example uses [fixedRate], which specifies the interval
 * btween method invocations, measured from the start time of each invoations,
 * measured from the start time of each invocation.
 * There are other options, such as [fixedDelay], which specifeds the interval
 * between invocations
 * mesured from the completion of the task.
 * You can also use [@Scheduled(cron="...")] expressions
 * for more sophoisticated task scheduling.
