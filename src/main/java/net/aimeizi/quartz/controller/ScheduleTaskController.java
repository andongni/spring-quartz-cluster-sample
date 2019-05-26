package net.aimeizi.quartz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;



/**
 * Created by yuqing on 2019/5/25.
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleTaskController {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTaskController.class);

    @RequestMapping(value = "/install")
    public String install(){
        log.info("定时人执行。。。。");
        System.out.printf("定时人执行。。。。定时人执行。。。。定时人执行。。。。定时人执行。。。。定时人执行。。。。定时人执行。。。。定时人执行。。。。定时人执行。。。。");
        return "success" ;
    }

}
