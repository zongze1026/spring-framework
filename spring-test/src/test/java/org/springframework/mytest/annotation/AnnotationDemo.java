package org.springframework.mytest.annotation;

import java.lang.annotation.*;

/**
 * Create By xzz on 2020/4/30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationDemo {
	String value() default "";
}
