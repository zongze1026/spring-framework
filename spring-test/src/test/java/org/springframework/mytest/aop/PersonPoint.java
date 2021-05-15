package org.springframework.mytest.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/5/20
 *
 * PersonPoint类在aop中被称为切面
 *
 * 1.aop中要想动态织入通知的话需要注册{@link DefaultAdvisorAutoProxyCreator}该对象，该对象是一个实现了BeanPostProcessor接口
 * 是一个后置处理器对象，其实现方法通过继承父类的方法。只要注册到spring容器中的对象在初始化的时候都会调用后置处理器进行增强处理，也就是说spring的aop代理只是管理注册到
 * spring容器中的对象；没有在容器中的对象是无能为力的。
 * 2.容器启动的时候会把连接点和通知封装成拦截器，在代理对象创建的过程中会匹配相对应的通知和链接点拦截器并封装成advisor对象组成拦截器链chains
 * 3.创建代理对象有两种情况，如果是jdk动态代理的话则根据目标类的所有父类方法生成代理对象，其中invocation的实例是{@link JdkDynamicAopProxy}；否则采用cglib代理。
 * 4.代理对象执行的过程会调用{@link JdkDynamicAopProxy}中的invoke方法，然后会执行之前解析的拦截器链chains完成代理。
 */
@Aspect
@Component
public class PersonPoint {


	/**
	 * 申明连接点
	 */
	@Pointcut("execution(* org.springframework.mytest.aop.Student.*(..))")
	public void point() {
	}

	/**
	 * 申明通知
	 */
	@Before("point()")
	public void before(){
		System.out.println("想想自己叫什么名字");
	}

	@After("point()")
	public void after(){
		System.out.println("名字说完了");
	}


}
