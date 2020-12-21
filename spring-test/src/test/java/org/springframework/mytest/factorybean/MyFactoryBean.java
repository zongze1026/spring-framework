package org.springframework.mytest.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.reflect.Proxy;

/**
 * Create By xzz on 2020/5/15
 */
public class MyFactoryBean<T> implements FactoryBean<T> {

	Class<?> clazz;

	/**
	 * 这里之所以能够注入，是因为在扫描器中修改了rpcService的class类型为当前的MyFactoryBean的class
	 * 虽然该类没有被注解注释,就因为改了class类型，相当于容器已经把该类的beanDefinition加载进去了
	 */
	@Autowired
	private RpcProvider rpcProvider;

	@Override
	public T getObject() throws Exception {
		return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, rpcProvider);
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}


}
