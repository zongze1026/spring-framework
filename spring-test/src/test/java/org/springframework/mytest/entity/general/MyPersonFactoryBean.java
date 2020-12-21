package org.springframework.mytest.entity.general;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/5/6
 */
@Component
public class MyPersonFactoryBean implements FactoryBean<Person> {
	@Override
	public Person getObject() throws Exception {
		return new Student("jery");
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
