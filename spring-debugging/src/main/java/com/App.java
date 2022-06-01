package com;

import com.zth.beans.Teacher;
import com.zth.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 猫和少年
 * @create 2022-05-04 10:27
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.refresh();

		Teacher bean = context.getBean(Teacher.class);
		System.out.println(bean);
	}
}
