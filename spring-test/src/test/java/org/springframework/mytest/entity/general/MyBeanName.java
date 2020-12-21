package org.springframework.mytest.entity.general;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class MyBeanName implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}

	public void print(){
		System.out.println("测试自动注入");
	}
}
