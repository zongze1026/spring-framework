package org.springframework.mytest.anntotationScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create By xzz on 2020/5/18
 */
@Configuration
@ComponentScan(value = "org.springframework.mytest.entity.beanLifeCycle")
public class SubConfigClass {
}
