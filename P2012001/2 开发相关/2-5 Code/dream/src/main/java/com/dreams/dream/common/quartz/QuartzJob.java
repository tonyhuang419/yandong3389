package com.dreams.dream.common.quartz;

import java.util.Date;

import org.springframework.stereotype.Controller;

/**
 * 任务调度实现类
 * @version 2012-05-20
 * @author Lawliet
 *
 */
@Controller
public class QuartzJob {

    /**
     * 任务调度
     */
    public void quartzStart() {
        System.out.println("任务开始"+new Date().getTime());
    }

}
