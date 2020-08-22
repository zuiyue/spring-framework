package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyBeanImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowCondition;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.*;

@Configuration
//

@Import(value = {Color.class,com.atguigu.bean.Red.class, MyImportSelector.class, MyBeanImportBeanDefinitionRegistrar.class})
@Conditional(value = WindowCondition.class)
public class MainConfig2 {

	/**
	 * 懒加载
	 *    针对的是单实例对象
	 * @return
	 */
	@Bean("person")
	@Lazy
	//@Scope("prototype")
	public Person person(){

		System.out.println("**********创建对象***************");
		return new Person("张三",25);
	}


	/**
	 * 根据系统的不同注入不同的实例
	 * @return
	 */

	@Bean("bill")
	@Conditional(value = WindowCondition.class)

	public Person person01(){


		return new Person("Bill gates",62);
	}

	@Bean("linus")
	@Conditional(value = LinuxCondition.class)
	public Person person02(){
		return new Person("linus",48);
	}
/**
 * FactoryBean
 */

@Bean
public ColorFactoryBean colorFactoryBean(){


 	return new ColorFactoryBean();
}


}
