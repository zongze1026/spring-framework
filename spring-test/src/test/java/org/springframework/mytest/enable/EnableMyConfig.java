package org.springframework.mytest.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Create By xzz on 2020/5/22
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableMyConfig {
}
