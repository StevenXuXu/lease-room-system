package com.shan.lease.web.admin.mapper;

import com.shan.lease.model.entity.LabelInfo;
import com.shan.lease.model.enums.ItemType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author liubo
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.shan.lease.model.LabelInfo
*/
public interface LabelInfoMapper extends BaseMapper<LabelInfo> {

    List<LabelInfo> selectListByItemTypeAndId(ItemType itemType, Long id);

    List<LabelInfo> selectListByRoomId(Long id);
}




