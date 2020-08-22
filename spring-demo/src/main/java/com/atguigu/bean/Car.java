package com.atguigu.bean;

import org.springframework.beans.factory.InitializingBean;

public class Car   {

	public Car() {
		System.out.println("Car constructor.");
	}



	public  void init(){
		System.out.println("car  init ");
	}

	public  void destory(){
		System.out.println("car  destory");
	}


}
