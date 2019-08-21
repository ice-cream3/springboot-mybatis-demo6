package com.rom.controller;

import com.rom.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program springboot-jsp-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/14 17:32
 */
@Slf4j
@Controller
public class BaseController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public String login() {
		//return "/jsp/index.jsp";

		// 配置前缀和后缀后访问地址
		return "/index";
	}

	@RequestMapping("/welcome")
	public String welcome(String name, String age) {
		//return "/jsp/welcome.jsp";
		String loginName = loginService.getLoginName(name);
		log.info("登陆参数:name={},loginName={}", name, loginName);
		// 配置前缀和后缀后访问地址
		return "/welcome";
	}
}
