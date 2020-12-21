package org.springframework.mytest.enable;

import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/5/14
 */
public class Student implements Person {
	@Override
	public String sayName() {
		return "i am student";
	}
}
