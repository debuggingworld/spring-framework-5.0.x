package com.zth.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

/**
 * @author 猫和少年
 * @create 2022-05-04 10:24
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
@Component
@Indexed
public class Student {
	@Value("zth")
	String name;

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}
}
