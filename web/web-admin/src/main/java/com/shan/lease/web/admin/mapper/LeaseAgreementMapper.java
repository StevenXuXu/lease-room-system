package com.shan.lease.web.admin.mapper;

import com.shan.lease.model.entity.LeaseAgreement;
import com.shan.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.shan.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.shan.lease.model.LeaseAgreement
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    IPage<AgreementVo> getAgreementVoPage(IPage<AgreementVo> page, AgreementQueryVo queryVo);
}




