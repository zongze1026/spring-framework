package org.springframework.mytest.dependsOn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2021/1/30 17:15
 * @Created by xiezz
 *
 * 测试ClassA实例化需要依赖ClassB
 *
 */
public class DependsOnTest {


	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInitConfig.class);
		ClassA classA = (ClassA) context.getBean("classA");
		context.registerAlias("classA", "a");
		context.registerAlias("classA", "b");
		context.registerAlias("a", "b");
		context.getAliases("classA");



	}




}
