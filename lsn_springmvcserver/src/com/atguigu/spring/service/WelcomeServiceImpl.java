package com.atguigu.spring.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeServiceImpl implements WelcomeService {
	public void sayHello(String name) {
		System.out.println(name);
	}
	
	public int getLength(String str){
		return str.length() ;
	}

	public List<Student> getStudents(int n) {
		List<Student> list = new ArrayList<Student>();
		Student s = null ;
		for(int i = 0 ; i < n ; i ++){
			s = new Student();
			s.setId(i + 1);;
			s.setName("tom" + i);
			list.add(s);
		}
		return list;
	}
	
	
}
