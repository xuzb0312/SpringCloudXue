package com.xu.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xuzb
 * @Date 2024/11/5
 * @description 分页查询参数
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    //当前页码
    private Long pageNo = 1L;
    //每页显示多少条数据
    private Long pageSize =10L;

}