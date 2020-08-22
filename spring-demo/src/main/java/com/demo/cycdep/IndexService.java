package com.demo.cycdep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

	@Autowired
	UserService userService;

	public void world(){
		System.out.println("world");
	}


}
