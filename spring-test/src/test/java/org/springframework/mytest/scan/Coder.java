package org.springframework.mytest.scan;

import org.springframework.mytest.annotation.MyComponent;

/**
 * Create By xzz on 2020/5/15
 */
@MyComponent
public class Coder implements Person {
	@Override
	public String sayName() {
		return "i am coder";
	}
}
