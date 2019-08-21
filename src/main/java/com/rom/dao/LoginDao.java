package com.rom.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @program springboot-mybatis-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/21 20:44
 */
@Mapper
public interface LoginDao {

	String getLoginName(String name);
}
