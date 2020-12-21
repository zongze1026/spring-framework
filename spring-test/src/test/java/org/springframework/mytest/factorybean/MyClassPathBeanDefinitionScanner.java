package org.springframework.mytest.factorybean;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.mytest.annotation.MyComponent;
import java.util.Set;

/**
 * Create By xzz on 2020/5/15
 * 自定义扫描器
 */
public class MyClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

	private MyFactoryBean factoryBean = new MyFactoryBean();

	public MyClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		addFilter();
		Set<BeanDefinitionHolder> beanDefinitions = super.doScan(basePackages);
		if (!beanDefinitions.isEmpty()) {
			beanDefinitions.stream().forEach(beanDefinitionHolder -> {
				GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionHolder.getBeanDefinition();
				//这里设置一个返回对象的类型
				beanDefinition.getPropertyValues().addPropertyValue("clazz", beanDefinition.getBeanClassName());
				//这里是关键点，将beanClass修改成MyFactoryBean的class
				//getBean也是生产的MyFactoryBean实例，然后通过getObject方法返回代理对象
				beanDefinition.setBeanClass(factoryBean.getClass());
			});
		}
		return beanDefinitions;
	}

	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().isIndependent();
	}

	/**
	 * 注册自己的注解过滤器
	 */
	private void addFilter() {
		super.addIncludeFilter(new AnnotationTypeFilter(MyComponent.class));
	}


}
