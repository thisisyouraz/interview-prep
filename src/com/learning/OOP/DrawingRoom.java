package com.learning.OOP;

public class DrawingRoom extends Room
{
	public int noOfAC = 3;

	public static void staticMethod()
	{
		System.out.println("staticMethod in DrawingRoom");
	}

	private void privateMethod()
	{
		System.out.println("privateMethod in DrawingRoom");
	}
}
