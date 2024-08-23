package com.shan.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Steven
 * @Date: 2024/8/23
 * @Time: 下午4:45
 * @Description:
 */
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;
    private String username;
}
