package com.shan.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Steven
 * @Date: 2024/8/20
 * @Time: 下午6:51
 * @Description:
 */
@Configuration
@MapperScan("com.shan.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
