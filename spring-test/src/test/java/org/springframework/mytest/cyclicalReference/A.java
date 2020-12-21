package org.springframework.mytest.cyclicalReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/7/1
 */
@Component
public class A {

	private String name;
	@Autowired
	private B  b;

	public void callB(){
		b.call();
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
