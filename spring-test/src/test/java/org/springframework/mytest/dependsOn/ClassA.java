package org.springframework.mytest.dependsOn;

/**
 * @Date 2021/1/30 17:12
 * @Created by xiezz
 */
public class ClassA {


	private ClassB classB;

	public ClassA(ClassB classB) {
		this.classB = classB;
	}
}
