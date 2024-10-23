package com.example.demo11;

import org.junit.jupiter.api.Test;

public class InterfaceTest {

	@Test
	public void test1() {

		Car car = new Car();
		car.run();

		System.out.println("========");

		Human human = new Human();
		human.run();

		System.out.println("========");

		Person person = new Person("¤p©ú");
		person.run();
	}

	@Test
	public void test2() {

		Submarine submarine = new Submarine();

		submarine.diving();

		submarine.move();
	}

}
