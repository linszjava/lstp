package com.lin.zstp.renwu.service.impl;

import cn.hutool.json.JSONUtil;
import com.lin.common.utils.HttpClientUtil;
import com.lin.common.zstp.enums.ZstpUrl;
import com.lin.zstp.renwu.service.RenwuInterface;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 02:39
 */
@Service
public class RenwuInterfaceService implements RenwuInterface {

    public Map<String,Object> renwuZongLan() {
        String headUrl = ZstpUrl.SHIWEN.getURL();
        String url = headUrl + "/api/people";
        String resultStr = HttpClientUtil.HttpGetDefault(url);
        return (Map<String,Object>)JSONUtil.toBean(resultStr, Map.class);
    }

    public void anChaodaiLiulan() {

    }

    public void huoquTedingRenwuJiezao() {

    }

    public void peopleMentionship() {

    }
}
