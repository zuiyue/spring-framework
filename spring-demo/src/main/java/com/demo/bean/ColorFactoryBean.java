package com.demo.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color> {

	@Override
	public Color getObject() throws Exception {

		System.out.println("ColorFactoryBean......");
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
