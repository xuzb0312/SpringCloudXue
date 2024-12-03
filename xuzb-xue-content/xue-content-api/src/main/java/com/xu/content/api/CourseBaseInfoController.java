package com.xu.content.api;

import com.xu.base.model.PageParams;
import com.xu.base.model.PageResult;
import com.xu.domain.dto.QueryCourseParamsDto;
import com.xu.domain.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xuzb
 * @Date 2024/11/6
 * @Version 1.0
 * @Description:课程查询
 */
@Api(value = "课程信息管理接口", tags = "课程信息管理接口")
@RestController
public class CourseBaseInfoController {

    @GetMapping("/course/index")
    public String index(){
        return "看到我，你的环境就是没问题的啦";
    }

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return null;
    }
}
