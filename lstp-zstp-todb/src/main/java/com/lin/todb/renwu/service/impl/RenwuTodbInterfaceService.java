package com.lin.todb.renwu.service.impl;

import cn.hutool.core.util.ArrayUtil;
import com.lin.common.zstp.renwu.entity.RenWuZongLan;
import com.lin.todb.renwu.openfeign.RenwuOpenfeignService;
import com.lin.todb.renwu.service.RenwuTodbInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 22:34
 */
@Service
@Slf4j
public class RenwuTodbInterfaceService implements RenwuTodbInterface {


    @Autowired
    private RenwuOpenfeignService renwuOpenfeignService;

    /**
     * 实现获取所有朝代的任务到db
     */
    @Override
    public void FindAllPeoplesSaveTodb() {
        //获取不同朝代的不同人物数 map集合
        Map<String, Object> map = renwuOpenfeignService.OpenfeignRenWuZongLan();
        List<Map<String,String>> dynasties = (ArrayList<Map<String,String>>) map.get("Dynasties");
        RenWuZongLan renWuZongLan = new RenWuZongLan();
        for (Map<String, String> dynasty : dynasties) {
//            log.info(dynasty.toString());
            renWuZongLan.setName(dynasty.get("Name"))
                    .setStart(dynasty.get("Start"))
                    .setEnd(dynasty.get("End"))
                    .setCount(Integer.valueOf(dynasty.get("Count")));


        }



    }
}
