package com.zth.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 猫和少年
 * @create 2022-05-04 10:24
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
@Component
public class Teacher {
	@Value("debug")
	String name;

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}
}
