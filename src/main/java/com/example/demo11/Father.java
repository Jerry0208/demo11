package com.example.demo11;

public class Father {
	protected String name;

	public Father(String name) {
		super();
		this.name = name;
	}

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println(name + " is wlaking");
	}

}
