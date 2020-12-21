package org.springframework.mytest.metaAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.AnnotatedElement;
import java.util.Map;
import java.util.Set;

@MyComponent
@Configuration
@RestController
public class MyServiceTest {


	public static void main(String[] args) {

//		getAllAnnotations();
//		getAttributes();
		AnnotatedElement annotatedElement = MyComponent.class;
		AnnotationAttributes attributes = AnnotatedElementUtils.getMergedAnnotationAttributes(annotatedElement, Service.class);
		System.out.println(attributes.toString());

	}

	//获取所有注解的属性
	private static void getAttributes() {
		StandardAnnotationMetadata metadata = new StandardAnnotationMetadata(MyServiceTest.class);
		Set<String> annotationTypes = metadata.getAnnotationTypes();
		annotationTypes.stream().forEach(annotation->{
			Map<String, Object> attributes = metadata.getAnnotationAttributes(annotation);
			attributes.entrySet().stream().forEach(entry->{
				System.out.println(entry.getKey()+" = "+entry.getValue());
			});
		});
	}

	//获取类上所有的注解
	private static void getAllAnnotations() {
		StandardAnnotationMetadata metadata = new StandardAnnotationMetadata(MyServiceTest.class);
		Set<String> annotationTypes = metadata.getAnnotationTypes();
		annotationTypes.stream().forEach(annotationType-> System.out.println(annotationType));
	}


}
