package com.atguigu.spring.service;

import java.util.List;

public interface WelcomeService {
	public void sayHello(String name);
	public int getLength(String str);
	public List<Student> getStudents(int n);
}
