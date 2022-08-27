package com.zth.advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 猫和少年
 * @create 2022-08-15 22:37
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */

@Component
public class DebugBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before.....");
    }
}
