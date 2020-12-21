package org.springframework.mytest.scan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.mytest.annotation.MyComponent;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.Set;

/**
 * Create By xzz on 2020/5/14
 * 测试ClassPathScanningCandidateComponentProvider扫描器的filter功能
 * spring的注解容器中默认的扫描器ClassPathBeanDefinitionScanner就是继承了ClassPathScanningCandidateComponentProvider
 * 只是初始化ClassPathBeanDefinitionScanner时需要传入beanFactory进行beanDefinition的注册
 *
 */
public class MyClassPathScanningCandidateComponentProvider extends ClassPathScanningCandidateComponentProvider {


	@Override
	public Set<BeanDefinition> findCandidateComponents(String basePackage) {
		return super.findCandidateComponents(basePackage);
	}

	/**
	 * 1.增加对Service类型注解的类进行扫描
	 * 2.增加一个过滤器，针对teacher进行排除
	 * 3.看看component注解是否生效（没有注册该类型的注解过滤器）
	 * 4.测试自定义的注解是否生效
	 */
	private void addFilter(){
		super.addIncludeFilter(new AnnotationTypeFilter(Service.class));
		super.addIncludeFilter(new AnnotationTypeFilter(MyComponent.class));
		super.addExcludeFilter(new TypeFilter() {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
				String className = metadataReader.getClassMetadata().getClassName();
				return  className.equals(Teacher.class.getName());
			}
		});
	}

	public static void main(String[] args) {

		String packages = "org.springframework.mytest.scan";
		MyClassPathScanningCandidateComponentProvider scanner = new MyClassPathScanningCandidateComponentProvider();
		scanner.addFilter();
		Set<BeanDefinition> definitions = scanner.findCandidateComponents(packages);
		definitions.stream().forEach(definition->{
			String beanClassName = definition.getBeanClassName();
			System.out.println(beanClassName);
		});

	}



}
