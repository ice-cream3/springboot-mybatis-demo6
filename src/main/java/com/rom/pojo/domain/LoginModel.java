package com.rom.pojo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @program springboot-mybatis-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/16 14:59
 */
@Data
public class LoginModel implements Serializable {

	private Integer id;

	private String name;

	private String password;

	private String phone;
}
