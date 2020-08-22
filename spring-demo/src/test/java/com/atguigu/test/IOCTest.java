package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {

	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


	@Test
	public  void testImport(){

		printBeans(annotationConfigApplicationContext);

		Object colorFactoryBean = annotationConfigApplicationContext.getBean("colorFactoryBean");
		Object colorFactoryBean1 = annotationConfigApplicationContext.getBean("colorFactoryBean");


		Object colorFactoryBean2 = annotationConfigApplicationContext.getBean("&colorFactoryBean");

		System.out.println("---->"+colorFactoryBean.getClass());

		System.out.println("---->colorFactoryBean2===>"+colorFactoryBean2.getClass());

		System.out.println(colorFactoryBean==colorFactoryBean1);
	}

	private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println(name);
		}
	}


	@Test
	public  void test03(){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

		ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();

		String property = environment.getProperty("os.name");

		System.out.println(property);


		for(String name:beanDefinitionNames){
			System.out.println(name);
		}

		Map<String, Person> persons = annotationConfigApplicationContext.getBeansOfType(Person.class);

		System.out.println(persons);


	}




	@Test
	public  void test01(){
		//AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


	/*	Object person = annotationConfigApplicationContext.getBean("person");
		Object person1 = annotationConfigApplicationContext.getBean("person");
*/
		//	System.out.println("-->"+(person==person1));
		annotationConfigApplicationContext.close();

	}

}
