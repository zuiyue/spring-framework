package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest {


	public static void main001(String[] args) {
		Resource resource= new ClassPathResource("bean.xml");
		DefaultListableBeanFactory defaultListableBeanFactory= new DefaultListableBeanFactory();
		BeanDefinitionReader beanDefinitionReader= new XmlBeanDefinitionReader(defaultListableBeanFactory);
		beanDefinitionReader.loadBeanDefinitions(resource);

		Person person=(Person) defaultListableBeanFactory.getBean("person");
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}

	public static void main(String[] args) {
	/*	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person);
*/

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		/*Person person=(Person)annotationConfigApplicationContext.getBean("person");

		System.out.println(person);*/

		String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
		for (String name:beanNamesForType){
			System.out.println(name);

		}



	}

}
