package org.springframework.mytest.cyclicalReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/7/1
 */
@Component
public class B {


	@Autowired
	private A a;

	public void call() {
		System.out.println("b is called");
	}
}
