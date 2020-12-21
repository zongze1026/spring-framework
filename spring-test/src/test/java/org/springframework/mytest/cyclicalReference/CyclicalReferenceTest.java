package org.springframework.mytest.cyclicalReference;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试循环引用，探秘三级缓存如何解决循环引用问题
 * Create By xzz on 2020/7/1
 */
public class CyclicalReferenceTest {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.mytest.cyclicalReference");
		A a = (A) context.getBean("a");
		a.callB();
		System.out.println(a);
		System.out.println(a.getName());

	}


}
