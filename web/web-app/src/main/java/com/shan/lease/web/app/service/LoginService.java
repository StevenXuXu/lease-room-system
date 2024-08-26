package com.shan.lease.web.app.service;

import com.shan.lease.web.app.vo.user.LoginVo;
import com.shan.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {
    void getCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoVoById(Long userId);
}
