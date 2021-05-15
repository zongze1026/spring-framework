package org.springframework.mytest.aop;

import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/5/14
 */
@Component
public class Student implements Person,Super {
	@Override
	public String sayName() {
		return "i am student";
	}

	@Override
	public Integer sayAge() {
		return 1;
	}

	@Override
	public void convert() {
		System.out.println("变身超人");
	}
}
