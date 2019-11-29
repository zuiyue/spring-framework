package com.atguigu.config;


import com.atguigu.bean.Car;
import com.atguigu.bean.Person;
import org.springframework.context.annotation.*;


@PropertySource(value = {"classpath:person.properties"})
@Configuration
public class MainConfigOfPropertyValue {

	@Bean

	public Person person(){

		return new Person();
	}

}
