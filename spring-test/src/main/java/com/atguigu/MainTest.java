package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person);*/


		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		/*Person person=(Person)annotationConfigApplicationContext.getBean("person");

		System.out.println(person);*/

		String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
		for (String name:beanNamesForType){
			System.out.println(name);

		}



	}

}
