package com.lin.common.exception;

import cn.hutool.core.util.StrUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 01:29
 */
public class CusException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String msg;

    public CusException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = StrUtil.format("{}", msg);
    }

    public CusException(String msg) {
        super(msg);
        this.code = 500;
        this.msg = StrUtil.format("{}", msg);
    }


}
