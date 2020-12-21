package org.springframework.mytest.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/5/20
 */
@Aspect
@Component
public class PersonPoint {


	@Pointcut("execution(* org.springframework.mytest.aop.Student.*(..))")
	public void point() {
	}

	@Before("point()")
	public void before(){
		System.out.println("想想自己叫什么名字");
	}

	@After("point()")
	public void after(){
		System.out.println("名字说完了");
	}


}
