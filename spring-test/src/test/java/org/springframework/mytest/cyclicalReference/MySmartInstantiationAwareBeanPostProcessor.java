package org.springframework.mytest.cyclicalReference;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Create By xzz on 2020/7/1
 * 该处理器可以配合三级缓存来实现bean的增强
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		if(beanName.equals("a")){
			A a = (A) bean;
			a.setName("toms");
		}
		return bean;
	}
}
