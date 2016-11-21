package com.atguigu.spring.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.surveypark.service.StatisticsService;

public class AppSS {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("client.xml");
		StatisticsService ss = (StatisticsService) ac.getBean("ssClient");
		ss.statistics(19);
	}

}
