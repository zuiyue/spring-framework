package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector  implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {


		System.out.println(898989);
		return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
	}
}
