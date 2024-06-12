package com.learning.OOP;

public interface Animal
{
	public void sound();

	default void feed()
	{
		System.out.println("Animal feeding");
	}
}
