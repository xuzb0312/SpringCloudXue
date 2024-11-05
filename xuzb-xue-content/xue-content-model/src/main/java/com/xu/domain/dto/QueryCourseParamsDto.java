package com.xu.domain.dto;

import lombok.Data;

/**
 * @Author xuzb
 * @Date 2024/11/5
 * @Version 1.0
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
