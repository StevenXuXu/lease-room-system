package com.shan.lease.web.admin.mapper;

import com.shan.lease.model.entity.FeeValue;
import com.shan.lease.web.admin.vo.fee.FeeValueVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.shan.lease.model.FeeValue
*/
public interface FeeValueMapper extends BaseMapper<FeeValue> {

    List<FeeValueVo> selectFeeValueVoListByApartmentId(Long id);
}




