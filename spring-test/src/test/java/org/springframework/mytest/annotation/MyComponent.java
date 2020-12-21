package org.springframework.mytest.annotation;

import java.lang.annotation.*;

/**
 * Create By xzz on 2020/5/15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyComponent {
}
