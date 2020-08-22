package com.demo.condition;

import com.demo.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


		boolean red= registry.containsBeanDefinition("com.atguigu.bean.Red");
		boolean blue= registry.containsBeanDefinition("com.atguigu.bean.Blue");

		if(red && blue){

			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
			registry.registerBeanDefinition("rainBow",rootBeanDefinition);
		}


	}
}
