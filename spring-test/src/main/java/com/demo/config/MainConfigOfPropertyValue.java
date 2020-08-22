package com.demo.config;


import com.demo.bean.Person;
import org.springframework.context.annotation.*;


@PropertySource(value = {"classpath:person.properties"})
@Configuration
public class MainConfigOfPropertyValue {

	@Bean

	public Person person(){

		return new Person();
	}

}
