package com.demo.test;

import com.demo.bean.Person;
import com.demo.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_PropertyValue {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);

	@Test
	public void test01(){

		printBeans(applicationContext);

		Person person = (Person)applicationContext.getBean("person");


		System.out.println(person);
		applicationContext.close();
	}

	private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println(name);
		}
	}

}
