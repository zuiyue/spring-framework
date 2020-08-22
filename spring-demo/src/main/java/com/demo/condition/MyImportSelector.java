package com.demo.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector  implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {


		System.out.println(898989);
		return new String[]{"com.demo.bean.Blue","com.demo.bean.Yellow"};
	}
}
