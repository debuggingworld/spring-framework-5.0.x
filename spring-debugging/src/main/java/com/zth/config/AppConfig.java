package com.zth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 猫和少年
 * @create 2022-05-04 10:25
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
@Configuration
@ComponentScan("com.zth")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {

}
