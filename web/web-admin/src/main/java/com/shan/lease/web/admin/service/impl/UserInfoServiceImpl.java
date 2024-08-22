package com.shan.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shan.lease.model.entity.UserInfo;
import com.shan.lease.web.admin.service.UserInfoService;
import com.shan.lease.web.admin.mapper.UserInfoMapper;
import com.shan.lease.web.admin.vo.user.UserInfoQueryVo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* @author liubo
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{
}




