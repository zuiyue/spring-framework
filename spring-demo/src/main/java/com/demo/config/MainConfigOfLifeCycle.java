package com.demo.config;


import com.demo.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.demo")
public class MainConfigOfLifeCycle {

	@Bean(initMethod = "init",destroyMethod = "destory")
	@Scope("prototype")
	public Car car(){

		return new Car();
	}

}
