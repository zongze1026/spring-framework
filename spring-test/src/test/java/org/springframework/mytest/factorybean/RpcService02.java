package org.springframework.mytest.factorybean;
import org.springframework.mytest.metaAnnotation.MyComponent;

/**
 * @Date 2021/2/4 13:46
 * @Created by xiezz
 */
@MyComponent
public interface RpcService02 {

	String rpcCall(String time);


}
