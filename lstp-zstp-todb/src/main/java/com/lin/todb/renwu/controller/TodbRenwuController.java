package com.lin.todb.renwu.controller;

import com.lin.common.result.R;
import com.lin.todb.renwu.openfeign.RenwuOpenfeignService;
import com.lin.todb.renwu.service.impl.RenwuTodbInterfaceService;
import io.swagger.annotations.Api;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 06:36
 */
@RestController
@RequestMapping("/todb/renwu")
@Api(tags = "Todb人物模块控制器")
public class TodbRenwuController {

    @Autowired
    private RenwuOpenfeignService renwuOpenfeignService;

    @Autowired
    private RenwuTodbInterfaceService renwuTodbInterfaceService;


    @GetMapping("/findAllPeople")
    public Map<String,Object> RenWuZongLan(){
        return renwuOpenfeignService.OpenfeignRenWuZongLan();
    }

    @PutMapping("/save")
    public R<String> saveTodb(){
        renwuTodbInterfaceService.FindAllPeoplesSaveTodb();
        return R.ok();
    }

}
