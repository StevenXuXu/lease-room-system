package com.shan.lease.web.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shan.lease.model.entity.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shan.lease.web.app.vo.room.RoomDetailVo;
import com.shan.lease.web.app.vo.room.RoomItemVo;
import com.shan.lease.web.app.vo.room.RoomQueryVo;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface RoomInfoService extends IService<RoomInfo> {
    IPage<RoomItemVo> pageItem(IPage<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getDetailById(Long id);

    IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id);
}
