package com.learning.OOP;

public class Room
{
	public int length;
	public int width;
	public int height;
	public static int noOfAC = 1;

	public Room()
	{
		System.out.println("Base Constructor");
	}

	public static void staticMethod()
	{
		System.out.println("static method in base class");
	}
}
