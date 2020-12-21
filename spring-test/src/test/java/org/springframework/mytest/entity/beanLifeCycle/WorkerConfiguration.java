package org.springframework.mytest.entity.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mytest.entity.general.Person;

/**
 * Create By xzz on 2020/5/8
 */
@Configuration
public class WorkerConfiguration {

	@Bean(initMethod = "init",destroyMethod = "destory2")
	public Person worker(){
		return new Worker();
	}




}
