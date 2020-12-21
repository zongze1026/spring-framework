package org.springframework.mytest.factorybean;
import org.springframework.stereotype.Component;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create By xzz on 2020/5/15
 */
@Component
public class RpcProvider implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method: " + method.getName());
		return "rpc调用成功";
	}
}
