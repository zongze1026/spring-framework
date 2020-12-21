package org.springframework.mytest.enable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Create By xzz on 2020/5/22
 */
public class EnableAnnotationTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnableConfig.class);
		Map<String, Person> beans = context.getBeansOfType(Person.class);
		beans.entrySet().stream().forEach(entry->{
			System.out.println(entry.getValue().sayName());
		});

	}



}
