package com.xu.content.service;

import com.xu.base.model.PageParams;
import com.xu.base.model.PageResult;
import com.xu.domain.dto.QueryCourseParamsDto;
import com.xu.domain.po.CourseBase;

/**
 * 课程基本信息管理业务接口
 * @Author xuzb
 * @Date 2024/12/3
 * @Version 1.0
 * @Description:
 */
public interface CourseBaseInfoService {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
