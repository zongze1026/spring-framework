package org.springframework.mytest.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create By xzz on 2020/5/15
 * factoryBean结合动态代理为RpcService生产代理对象实现调用
 */
public class ApplicationContextLoadTest {


	public static void main(String[] args) {
		String packages = "org.springframework.mytest.factorybean";
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		RpcService rpcService = (RpcService) context.getBean("rpcService");
		String rpcCall = rpcService.rpcCall();
		System.out.println(rpcCall);


	}


}
