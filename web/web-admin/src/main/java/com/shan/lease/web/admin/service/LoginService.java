package com.shan.lease.web.admin.service;

import com.shan.lease.web.admin.vo.login.CaptchaVo;
import com.shan.lease.web.admin.vo.login.LoginVo;
import com.shan.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getUserInfoVoById(Long userId);
}
