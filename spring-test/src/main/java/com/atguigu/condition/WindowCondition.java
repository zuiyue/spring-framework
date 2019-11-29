package com.atguigu.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

		ClassLoader classLoader = context.getClassLoader();

		Environment environment = context.getEnvironment();


		BeanDefinitionRegistry registry = context.getRegistry();


		String property = environment.getProperty("os.name");


		if(property.contains("Windows")){
			return true;
		}


		return false;
	}
}
