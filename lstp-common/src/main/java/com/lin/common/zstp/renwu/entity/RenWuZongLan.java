package com.lin.common.zstp.renwu.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * <p>朝代人物总览</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 03:38
 */
@Data
@ApiModel("人物总览")
public class RenWuZongLan {

    @ApiParam("朝代id")
    private Integer id;

    @ApiParam("朝代名")
    private String name;

    @ApiParam("朝代开始年份")
    private String start;

    @ApiParam("朝代结束年份")
    private String end;

    @ApiParam("该朝代人物数量")
    private Integer count;
}
