package com.lin.common.result;

import com.lin.common.result.enums.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/4 22:12
 */
@ApiModel(value = "R", description = "统一返回结果")
@Data
public class R<T> {

    @ApiParam(value = "返回码", required = true)
    private int code;

    @ApiParam(value = "返回信息", required = true)
    private String msg;

    @ApiParam(value = "返回数据", required = true)
    private T data;


    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static <T> R<T> ok() {
        return new R<>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg(),
                null);
    }

    public static <T> R<T> ok(T data) {
        return new R<>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg(),
                data);
    }

    public static <T> R<T> ok(int code, String msg, T data) {
        return new R<>(code, msg, data);
    }

    public static <T> R<T> fail() {
        return new R<>(ResultCode.ERROR.getCode(),
                ResultCode.ERROR.getMsg(),
                null);
    }

    public static <T> R<T> fail(String msg) {
        return new R<>(ResultCode.ERROR.getCode(),
                msg,
                null);
    }







}
