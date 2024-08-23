package com.shan.lease.web.admin.custom.interceptor;

import com.shan.lease.common.exception.LeaseException;
import com.shan.lease.common.login.LoginUser;
import com.shan.lease.common.login.LoginUserHolder;
import com.shan.lease.common.result.ResultCodeEnum;
import com.shan.lease.common.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.rmi.dgc.Lease;

/**
 * @Author: Steven
 * @Date: 2024/8/23
 * @Time: 下午3:58
 * @Description:
 */
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("access-token");
        Claims claims = JwtUtil.parseToken(token);
        Long userId = claims.get("userId", Long.class);
        String username = claims.get("username", String.class);
        LoginUserHolder.setLoginUser(new LoginUser(userId, username));

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LoginUserHolder.clear();
    }
}
