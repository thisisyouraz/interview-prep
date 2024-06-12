package com.learning.OOP;

public class Cat implements Animal, Mammal
{
	/*
	Interfaces in Java are a powerful tool for defining contracts that classes must follow.
	They enable abstraction, support multiple inheritance, and promote loose coupling and testability.
	By using interfaces, you can build flexible and maintainable code that is easy to extend and modify.
	 */

	public void sound()
	{
		System.out.println("cat sound");
	}

	public void eat()
	{
		System.out.println("cat eat");
	}

	public void feed()
	{
		Animal.super.feed();
	}
}
