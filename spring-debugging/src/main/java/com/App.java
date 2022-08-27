package com;

import com.zth.Service.UserService;
import com.zth.advice.DebugBeforeAdvice;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author 猫和少年
 * @create 2022-05-04 10:27
 * @Slogan 才疏学浅，少年登科；满腹经纶，白发不第
 */
public class App {
	public static void main(String[] args) {
/*
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
*/

		UserService target = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.setOptimize(true);
		proxyFactory.setProxyTargetClass(true);
		proxyFactory.setExposeProxy(true);


		proxyFactory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation invocation) throws Throwable {
				return null;
			}
		});



		proxyFactory.addAdvisor(new PointcutAdvisor() {
			@Override
			public Pointcut getPointcut() {
				return new StaticMethodMatcherPointcut() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().equals("debug");
					}
				};
			}

			@Override
			public Advice getAdvice() {
				return new DebugBeforeAdvice();
			}

			@Override
			public boolean isPerInstance() {
				return false;
			}
		});

		UserService userService = (UserService) proxyFactory.getProxy();

	}





}
