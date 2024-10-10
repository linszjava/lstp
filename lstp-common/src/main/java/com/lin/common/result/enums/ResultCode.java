package com.lin.common.result.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/4 22:50
 */
@Getter
@NoArgsConstructor(force = true)
public enum ResultCode {
    SUCCESS(200, "成功"),
    ERROR(500, "失败"),
    PARAM_ERROR(400, "参数错误"),
    NOT_FOUND(404, "资源不存在"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    METHOD_NOT_ALLOWED(405, "请求方法不支持"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    BAD_GATEWAY(502, "网关错误"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),
    GATEWAY_TIMEOUT(504, "网关超时"),
    ;

    private final int code;
    private final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
