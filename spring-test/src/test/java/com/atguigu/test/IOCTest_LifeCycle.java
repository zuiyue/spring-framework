package com.atguigu.test;

import com.atguigu.config.MainConfig2;
import com.atguigu.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {


	@Test
	public void test01(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

		 Object car = annotationConfigApplicationContext.getBean("car");
		System.out.println("容器创建完成....");



		annotationConfigApplicationContext.close();
	}
}
