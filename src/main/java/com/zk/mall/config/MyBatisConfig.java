package com.zk.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zk.mall.mbg.mapper")
public class MyBatisConfig {

}
