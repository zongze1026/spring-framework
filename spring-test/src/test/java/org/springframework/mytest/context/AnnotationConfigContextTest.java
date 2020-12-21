package org.springframework.mytest.context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.annotation.AnnotationDemo;
import org.springframework.mytest.entity.general.CircleA;
import org.springframework.mytest.entity.general.Person;
import org.springframework.mytest.entity.general.Student;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Map;

/**
 * Create By xzz on 2020/4/30
 */
public class AnnotationConfigContextTest {

	public static void main(String[] args) {

		getBean("org.springframework.mytest.entity.general");
//		beanLifeCycleTest("org.springframework.mytest.entity.beanLifeCycle");
//		getBeansOfType("org.springframework.mytest.entity.general");
//		getBeanNamesForAnnotation("org.springframework.mytest.entity.general");
//		getBeansWithAnnotation("org.springframework.mytest.entity.general");
//		findAnnotationOnBean("org.springframework.mytest.entity.general");
//		circleTest("org.springframework.mytest.entity.general");
//		factoryBeanTest("org.springframework.mytest.entity.general");


	}


	//测试factoryBean
	private static void factoryBeanTest(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		Object o = context.getBean("myPersonFactoryBean");
		System.out.println(o.getClass().getName());
		System.out.println(((Student) o).name());
	}

	//测试循环依赖
	private static void circleTest(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		CircleA circleA = context.getBean(CircleA.class);
	}

	//通过bean的名称获取注解，如果通过指定bean找不到就会循环遍历父类进行查找
	private static void findAnnotationOnBean(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		AnnotationDemo annotation = context.findAnnotationOnBean("Teacher", AnnotationDemo.class);
		System.out.println(annotation.value());
	}

	//通过给定的注解class，获取所有包含该注解的类的实例集合
	private static void getBeansWithAnnotation(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		Map<String, Object> beans = context.getBeansWithAnnotation(Service.class);
		beans.entrySet().stream().forEach(object -> System.out.println(((Person) object.getValue()).name()));
	}

	//通过给定的注解class，获取所有包含该注解的类的实例名称集合
	private static void getBeanNamesForAnnotation(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		String[] beanNames = context.getBeanNamesForAnnotation(Service.class);
		Arrays.asList(beanNames).stream().forEach(beanName -> {
			System.out.println(((Person) context.getBean(beanName)).name());
		});
	}

	//通过给定的class返回所有实例
	private static void getBeansOfType(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		Map<String, Person> beans = context.getBeansOfType(Person.class);
		if (!beans.isEmpty()) {
			beans.entrySet().stream().forEach(b -> System.out.println(b.getValue().name()));
		}
	}

	private static void getBean(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		Student student = (Student) context.getBean("student");
		System.out.println(student.name());
	}

	//spring中bean的生命周期测试
	private static void beanLifeCycleTest(String packages) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(packages);
		Object beanInitializeTest = context.getBean("worker");
		context.destroy();
	}


}
