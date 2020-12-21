package org.springframework.mytest.factorybean;

import org.springframework.mytest.annotation.MyComponent;

/**
 * Create By xzz on 2020/5/15
 */
@MyComponent
public interface RpcService {

	String rpcCall();


}
