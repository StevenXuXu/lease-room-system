package com.shan.lease.web.app.service.impl;

import com.shan.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Steven
 * @Date: 2024/8/23
 * @Time: 下午6:30
 * @Description:
 */
@SpringBootTest
class SmsServiceImplTest {

    @Autowired
    private SmsService smsService;

    @Test
    public void sendCode() {
        smsService.sendCode("123", "123");
    }

}