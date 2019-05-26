package net.aimeizi.quartz.vo;

import com.dexcoder.commons.pager.Pageable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * author : fengjing
 * createTime : 2016-08-04
 * description : 定时任务模型Vo
 * version : 1.0
 */
@Data
@NoArgsConstructor
public class ScheduleJobVo extends Pageable {

    private static final long  serialVersionUID = -4216107640768329946L;

    /** 任务调度的参数key */
    public static final String JOB_PARAM_KEY    = "jobParam";

    /** 任务id */
    private Long  scheduleJobId;

    /** 任务名称 */
    private String jobName;

    /** 任务别名 */
    private String aliasName;

    /** 任务分组 */
    private String jobGroup;

    /** 触发器 */
    private String jobTrigger;

    /** 任务状态 */
    private String status;

    /** 任务运行时间表达式 */
    private String cronExpression;

    /** 是否异步 */
    private Boolean isSync;

    /** 任务描述 */
    private String description;

    /** 创建时间 */
    private Date gmtCreate;

    private Date previousFireTim;
    private Date nextFireTime;

    /** 修改时间 */
    private Date gmtModify;

    /** 任务执行url */
    private String  url;


}
