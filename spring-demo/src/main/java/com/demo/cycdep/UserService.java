package com.demo.cycdep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	IndexService indexService;
	public void hello(){
		System.out.println("hello");
	}

}
