package org.springframework.mytest.entity.beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.mytest.entity.general.Person;

/**
 * Create By xzz on 2020/4/30
 */
public class Worker implements Person, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
	@Override
	public String name() {
		return "worker";
	}

	public Worker() {
		System.out.println(1);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(3);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(2);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(9);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(6);
	}

	public void init(){
		System.out.println(7);
	}

	public void destory2(){
		System.out.println(10);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(4);
	}
}
