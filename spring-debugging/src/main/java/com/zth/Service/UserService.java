package com.zth.Service;

import org.springframework.aop.framework.AopContext;

/**
 * @author 猫和少年
 * @create 2022-05-30 23:16
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
public class UserService {

	public void test(){
		Object proxy = AopContext.currentProxy();
	}
}
