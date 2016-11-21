package com.atguigu.spring.service;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 3427027455242574087L;
	private Integer id;
	private String name;
	private boolean married ;

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
