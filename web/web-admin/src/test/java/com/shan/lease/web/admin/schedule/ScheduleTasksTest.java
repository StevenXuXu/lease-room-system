package com.shan.lease.web.admin.schedule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Steven
 * @Date: 2024/8/22
 * @Time: 下午9:27
 * @Description:
 */
@SpringBootTest
class ScheduleTasksTest {

    @Autowired
    private ScheduleTasks scheduleTasks;

    @Test
    public void test() {
        scheduleTasks.checkLeaseStatus();
    }
}