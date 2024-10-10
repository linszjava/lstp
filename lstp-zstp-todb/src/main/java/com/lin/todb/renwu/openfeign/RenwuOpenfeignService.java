package com.lin.todb.renwu.openfeign;

import com.lin.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 06:31
 */
@Component
@FeignClient(value = "lstp-zstp-service")
public interface RenwuOpenfeignService {

    @GetMapping("/renwu/feign/findAllPeople")
    public Map<String,Object> OpenfeignRenWuZongLan();
}
