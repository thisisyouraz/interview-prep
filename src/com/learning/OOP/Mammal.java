package com.learning.OOP;

public interface Mammal
{
	public void eat();

	default void feed(){
		System.out.println("Mammal feeding");
	}
}
