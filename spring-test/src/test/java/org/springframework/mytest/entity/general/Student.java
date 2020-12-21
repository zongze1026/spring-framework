package org.springframework.mytest.entity.general;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mytest.entity.general.MyApplicationContext;
import org.springframework.mytest.entity.general.MyBeanName;
import org.springframework.mytest.entity.general.Person;
import org.springframework.stereotype.Service;

/**
 * Create By xzz on 2020/4/30
 */
@Service
public class Student implements Person {

	@Autowired
	MyApplicationContext applicationContext;
	@Autowired
	MyBeanName myBeanName;

	public MyApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(MyApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public MyBeanName getMyBeanName() {
		return myBeanName;
	}

	public void setMyBeanName(MyBeanName myBeanName) {
		this.myBeanName = myBeanName;
	}

	private String name;

	public Student() {
		this.name = "toms";
	}

	public Student(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	@Override
	public String name() {
		return name;
	}
}
