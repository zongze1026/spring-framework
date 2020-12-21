package org.springframework.mytest.anntotationScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.mytest.scan.Coder;

@Configuration
@ComponentScan
@Import(Coder.class)
public class MyConfigClass {
}
