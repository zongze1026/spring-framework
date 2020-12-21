package org.springframework.mytest.scan;

import org.springframework.stereotype.Service;

/**
 * Create By xzz on 2020/5/14
 */
@Service
public class Worker implements Person{

	@Override
	public String sayName() {
		return "i am worker";
	}
}
