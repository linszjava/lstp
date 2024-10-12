package com.lin.common.zstp.renwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lin.common.zstp.entity.basicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>朝代人物总览</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 03:38
 */
@Data
@ApiModel("人物总览")
@Accessors(chain = true)
@TableName(value ="t_renwuzonglan")
public class RenWuZongLan extends basicEntity {

    @ApiParam("朝代id")
    private Integer id;

    @ApiParam("朝代名")
    private String name;

    @ApiParam("朝代开始年份")
    private String start;

    @ApiParam("朝代结束年份")
    private String end;

    @ApiParam("该朝代人物数量")
    private String count;
}
