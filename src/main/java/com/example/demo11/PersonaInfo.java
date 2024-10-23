package com.example.demo11;

public class PersonaInfo extends NameId {
	private int age;

	private String city;

	public PersonaInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaInfo(String name, String id, int age, String city) {
		super(name, id);
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	
	

}
