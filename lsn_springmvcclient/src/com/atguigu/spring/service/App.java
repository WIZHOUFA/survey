package com.atguigu.spring.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("client.xml");
		WelcomeService ws = (WelcomeService) ac.getBean("wsClient");
		ws.sayHello("tom");
		System.out.println(ws.getLength("kkk"));
		List<Student> list = ws.getStudents(10);
		for(Student s : list){
			System.out.println("" + s.getId() + "." + s.getName() + "." + s.isMarried());
		}
	}

}
