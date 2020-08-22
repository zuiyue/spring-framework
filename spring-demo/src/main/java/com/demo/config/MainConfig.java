package com.demo.config;

import com.demo.bean.Person;
import org.springframework.context.annotation.*;

@Configuration  //告诉spring 这是一个配置类

@ComponentScans(value = {
		@ComponentScan(value = "com.demo",includeFilters = {
				/*@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
				@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),*/
				@ComponentScan.Filter(type= FilterType.CUSTOM,classes = {MyTypeFilter.class})
		},useDefaultFilters = false)

})
public class MainConfig {

	@Bean("person")
	public Person person01(){

		return  new Person("lisi",20);
	}

}
