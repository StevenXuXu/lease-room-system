package com.shan.lease.web.admin.schedule;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.shan.lease.model.entity.LeaseAgreement;
import com.shan.lease.model.enums.LeaseStatus;
import com.shan.lease.web.admin.service.LeaseAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @Author: Steven
 * @Date: 2024/8/22
 * @Time: 下午9:17
 * @Description:
 */
@Component
public class ScheduleTasks {

//    @Scheduled(cron = "* * * * * *")
//    public void test() {
//        System.out.println(new Date());
//    }

    @Autowired
    private LeaseAgreementService leaseAgreementService;

    @Scheduled(cron = "0 0 0 * * *")  // every day
    public void checkLeaseStatus() {
        LambdaUpdateWrapper<LeaseAgreement> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.in(LeaseAgreement::getStatus, LeaseStatus.SIGNED, LeaseStatus.WITHDRAWING)
                .le(LeaseAgreement::getLeaseEndDate, new Date())
                .set(LeaseAgreement::getStatus, LeaseStatus.EXPIRED);
        leaseAgreementService.update(updateWrapper);
    }
}
