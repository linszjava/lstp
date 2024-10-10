package com.lin.zstp.renwu.controller;

import com.lin.common.result.R;
import com.lin.zstp.renwu.service.impl.RenwuInterfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 02:19
 */
@RestController
@Api(tags = "人物模块控制器")
@RequestMapping("/renwu")
public class RenWuController {

    @Autowired
    private RenwuInterfaceService renwuInterfaceService;


    @ApiOperation("获取所有人物")
    @GetMapping("/findAllPeople")
    public R<Map<String,Object>> RenWuZongLan(){
        Map<String,Object> result = renwuInterfaceService.renwuZongLan();
        if (result != null) {
            return R.ok(result);
        }else {
            return R.fail("获取失败");
        }


    }

    @ApiOperation("获取所有人物openfeign")
    @GetMapping("/feign/findAllPeople")
    public Map<String,Object> OpenfeignRenWuZongLan(){
        return renwuInterfaceService.renwuZongLan();
    }
}
