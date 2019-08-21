package com.rom.service.impl;

import com.rom.dao.LoginDao;
import com.rom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program springboot-mybatis-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/21 20:43
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	@Override
	public String getLoginName(String name) {
		return loginDao.getLoginName(name);
	}
}
