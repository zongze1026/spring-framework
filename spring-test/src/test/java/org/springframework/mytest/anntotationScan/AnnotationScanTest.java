package org.springframework.mytest.anntotationScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.scan.Coder;

import java.util.Map;

public class AnnotationScanTest {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Map<String, Person> beans = context.getBeansOfType(Person.class);
		beans.entrySet().stream().forEach(entry->{
			String key = entry.getKey();
			System.out.println(key);
			System.out.println(entry.getValue().name());
		});
		Coder coder = context.getBean(Coder.class);
		System.out.println(coder.sayName());

	}





}
