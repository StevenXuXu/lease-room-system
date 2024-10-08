package com.shan.lease.web.admin.mapper;

import com.shan.lease.model.entity.FacilityInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shan.lease.model.enums.ItemType;

import java.util.List;

/**
* @author liubo
* @description 针对表【facility_info(配套信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.shan.lease.model.FacilityInfo
*/
public interface FacilityInfoMapper extends BaseMapper<FacilityInfo> {

    List<FacilityInfo> selectListByItemTypeAndId(ItemType itemType, Long id);

    List<FacilityInfo> selectListByRoomId(Long id);
}




