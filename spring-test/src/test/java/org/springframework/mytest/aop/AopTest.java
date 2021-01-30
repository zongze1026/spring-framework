package org.springframework.mytest.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create By xzz on 2020/5/20
 */
public class AopTest {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Person person = (Person) context.getBean("student");
		System.out.println(person.sayName());


	}




}
