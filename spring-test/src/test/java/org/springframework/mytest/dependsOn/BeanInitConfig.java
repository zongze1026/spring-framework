package org.springframework.mytest.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2021/1/30 17:13
 * @Created by xiezz
 */
@Configuration
public class BeanInitConfig {




	@Bean
	public ClassA classA(ClassB classB){
		return new ClassA(classB);
	}



	@Bean
	public ClassB classB(){
		return new ClassB();
	}





}
