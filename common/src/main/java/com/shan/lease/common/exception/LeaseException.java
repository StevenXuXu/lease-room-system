package com.shan.lease.common.exception;

import com.shan.lease.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @Author: Steven
 * @Date: 2024/8/22
 * @Time: 下午4:20
 * @Description:
 */
@Data
public class LeaseException extends RuntimeException {

    private Integer code;

    public LeaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public LeaseException(ResultCodeEnum result) {
        super(result.getMessage());
        this.code = result.getCode();
    }
}
