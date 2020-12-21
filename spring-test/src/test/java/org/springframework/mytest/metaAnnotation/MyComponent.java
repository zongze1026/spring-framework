package org.springframework.mytest.metaAnnotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * Create By xzz on 2020/5/15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service(value = "lucy")
public @interface MyComponent {


	@AliasFor(annotation = Service.class)
	String value() default "toms";

}
