package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;

public class InterviewPrep
{
	public static final String AM = "AM";
	public static final String PM = "PM";

	public static void main (String [] arg)
	{

		System.out.println("Hello, AYAZ");
		System.out.println();

		String name = "Haris";
		System.out.println(MessageFormat.format("this is {0}",name));

		/*
		java is case-sensitive i.e., 'int' is not have the same meaning as 'Int' (with capital I)
		key-word: keyWord is a word that have pre-defined meaning in java.
		e.g., new , int , short , byte, abstract all of there are keyWords

		Variables:
			variable are a way to store information in computer.
			it's a space occupied in memory(RAM).We can access them by name which we give them while initializing.
		Data-types:
			we have a lot of diff type of data to store in memory. SO, we have diff dataTypes to store them.
			e.g., char,short, byte, int, long,float, double...

			data-types are divided into two.
				1- primitive
				2- non-primitive.
					primitive data types
						whole number :- byte, short, int , long.
						real/decimal numbers :-  float, double.
						single character :- char.
						true/false :- boolean.

			Wrapper class: we have wrapper class for each primitive data type. the purpose of these
			wrapper class are to provide some basic information about the respective primitive data
			type and to perform simple operations on them.

			Expression:
				expression is a code segment which is on the right side of the equals operator. it can be a single
				literal number or can be a complex mathematical equation which will result in a single number.
		*/
		int myFirstNumber = (10 + 5) + (2 * 10); // variables occupied a space in RAM.
		int mySecondNumber = 12;
		int myThirdNumber = 6;

		int total = myFirstNumber + mySecondNumber + myThirdNumber;

		int myFinalOne = 1000 - total;
		System.out.println("Total: " + myFinalOne);


		/*
		primitive dataTypes:
			datatype is simply a placeholder in memory. which allows us to allocate enough space in RAM
			to store particular data. Each dataType has a specified range of values to be stored that means
			each dataType has its min & max value which it can store. We can get the values by using wrapper
			classes, as we are doing below.
		 */

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;

		System.out.println("Integer range : "+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);



		/*
		Overflow :- if we will try to assign a number greater than the MAX_VALUE of any dataType then the
					  overFlow occurs and wrap the value to the (Integer.MIN_VALUE + extraNumberOverMaxValue)

		Underflow :- It's also like overflow but in opposite, like if we try to assign a lesser value than the
					MIN_VALUE then underflow occurs and wrap the value to towards the (MAX_VALUE - extraValueOverMinimumValue)

		 */

		int myMaxValueTest = 2147483647 + 2; // Overflow

		System.out.println("OverFlow int value = " + myMaxValueTest);

		int myMinValueTest = -2147483648 -2;

		System.out.println("UnderFlow int value = "+ myMinValueTest);

		/*
			Int is the default dataType of the whole numbers.
			byte - 8 bits.
			short - 16 bits.
			int  - 32 bits.
			long - 64 bits.

			primitive type challenge below:
		 */

		byte myByteNum = 10;
		short myShortNum = 20;
		int myIntNum = 100;

		long myLongNum = 50_000 + 10 * (myByteNum + myShortNum + myIntNum);
		System.out.println(myLongNum);


		/*
		- default dataType of decimal value is double.
		- default datatype of whole number is int.
		- we can't assign a big dataType's data to a small data-type e.g., we can't assign a double to float, below statement is a compilation error.
		- float f = 2.5;
		 */

		int a = 123;
		long l = 123;



		/*float f = 123.0;  this is not automatically converted into float by java because double has the more precision and higher range than
						  float that's why in case of decimal point values we explicitly cast it into float to avoid precision loss
		 */
		double d = 123.0f;
		short b = 123;

		int numOfPounds = 1;
		double poundsToKgs = numOfPounds * 0.45359237;
		System.out.println(numOfPounds + " pounds = " + poundsToKgs + " kgs");;

		/*
		A class is kind of a custom dataType in java. (BigDecimal - used for more precise calculations)
		char occupy 16 bits in memory.
		 */


		char myChar = '?';
		char myChar1 = '\u003F'; // uni-code representation.
		char myChar2 = 63;       // Decimal representation.

		System.out.println("My values are: " + myChar + ", " + myChar1 + ", " + myChar2);

		/*
		boolean type can store only two values either true/false.
		String unlike char contains a sequence of chars. It is immutable (non-editable) which means if we are concatenating strings. java in the background
		doesn't actually concatenate the strings, infect it's creating a new string and assign that reference to our resultant variable.
		StringBuilder is a mutable class. which we can use if we want to perform operations on string literal e.g., creating a bigger
		String by concatenating small strings.
		 */

		/*
		String represents a sequence of characters. It is used to store textual information. It is one of the commonly used data-type in java bcz of its
		importance in handling the textual information. String class is part of the java standard library and available in java.lang package which is
		by default imported into every java program and don't need to import it explicitly.
		String is immutable which means once string object is initialized that can not be changed. Any operation which seems to modify the String
		is actually creating a new string in the background.
		Due to the immutability of the string performing extensive modification on a string is very in efficient. So in that case we may use
		StringBuffer or StringBuilder class which are mutable so we can perform modification on the string efficiently.
		 */

		/*
		Operators are specific symbols in java (+,-,/,%,*) that perform specific operations on one,two & three operands.
		- Operands is the term used for the objects that are manipulated by the operators.
		- Expression: expression is formed by the combination of operators , operands and literals.
		 */

		char c1 = 'a';
		char c2 = 'b';

		System.out.println(c1 + c2);  // the decimal values for the 'a' & 'b' are adding here.


		/*
		postfix increment/decrement operator.
		a++;
		a--:
		 */

		double result = (2 + 2);
		System.out.println(result);

		//result = result + 2.5;

		result += 2.5;  // this expression is equal to : result = (result datatype) (result + 2.5)


//		int i3 = 2 + 2.0;    this is wrong, as we needed to cast explicity.

//		int i3 = 2;
//		i3 += 2.0;           this is fine, as implicit casting is being done.

		System.out.println(result);

		double d1 = 2;
		System.out.println(d1); // print 2.0


		short s = 1000;

		/*
		 method: method is a collection of statements, which perform a specific operation.
		 main(String []) method is the entry point of any java program. from where the execution of the java application started.

		 keywords: public (optional access modifier), class,

		 */
		double dou = 2.0/8;

		DecimalFormat decimalFormat = new DecimalFormat("#.######");

		System.out.printf("%.6f%n",dou);
		System.out.println(decimalFormat.format(dou));

		/*
		assignment operator:(=) operator is used to assign the expression to the variable which is on the left side of assignment operator.
		equivalent operator: (==) operator is used to compare the two operands. and return a boolean result either true / false.
		if-else control statements.
		code blocks: one or more statements grouped by curly braces {}
		logical AND operator -> && condition will be true if ALL the conditions will be true, and false if ANY of the condition will be false.
		logical OR operator -> || condition will be true if ANY of the condition will be true, and FALSE if ALL the conditions will be false.
		Ternary operator takes 3 operands. e.g.,

		 */

		String myName = "Ayaz";
		Boolean isMe = myName.equals("Ayaz") ? true : false;

		/*
		ternary operator is a shortcut to assigning one of the two values to a variable, depending on a specific condition.
		it's also a shortcut of if-else statement.
		 */
		System.out.println(timeConversion("06:40:03AM"));

		/*
		method is a set of statements which only run when it is called. We can pass data to methods as an argument.
		methods are used to perform certain actions. we use methods to reuse code: define the code once and use it many times.

		Argument : argument is a value passing to method.
		parameter: parameters are variables defined in method signature which are used when we need to pass value to method.

		 */

		displayHighScorePosition("ayaz",calculateHighestScorePosition(1500));
		displayHighScorePosition("haris",calculateHighestScorePosition(1000));
		displayHighScorePosition("abubakr",calculateHighestScorePosition(500));
		displayHighScorePosition("Huzaifa",calculateHighestScorePosition(100));
		displayHighScorePosition("faisal",calculateHighestScorePosition(25));

		System.out.println("Numbers equal = " + areEqualByThreeDecimalPlaces(3.1756,3.175));


		/*
		Method overloading : if we have more than one method with the same name but different signature then we call this mechanism as
		method overloading. method signature is consist of parameters type , order of parameters, number of parameters in conjunction with
		method name.
		method return type is not part of the signature.
		 */

		System.out.println("5 ft, 8 inches = " +convertToCentimeters(5,8) + " cm");

		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65,45));

		/*
		switch case is like if else statement. i.e., we can perform different operations base on the value of a particular variable.
		switch and if-else differences:
		switch is used to check different values of one variable. but in if statement we can check multiple variable and their values all together.

		switch case is not applicable for all data types.  it's only applicable to the following types,
			- byte, short, int, char
			- Byte, Short, Integer, Character
			- String
			- enum

		Break statement is important in switch cases bcz it manages the flow of the code execution. if we forgot to mention break statement then the
		code execution continues which may produce unexpected results.

		looping: looping let us execute a particular code multiple number of times.
		there are three main type of loop statements:
			1 - for loop. (in this we initialise the loop variable and also mention the condition which determine where the loop ends furthermore it also
			contains the iteration step)
			2 - while loop. (in this we need to mention only the condition and the code continue to execute until the specified condition is satisfied)
			3 - do-while loop. (in do while the code must execute at least once then the condition is checked at the end)


		 */

		for (double rate = 7.5; rate <= 10.0; rate+=0.5)
		{
			System.out.println(calculateInterest(100,rate));
		}

		int primeCounter = 0;
		for (int i = 1; primeCounter < 3 && i < 1000; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
				primeCounter ++;
			}
		}

		int counter = 0;
		int sum = 0;
		for (int i = 1; counter < 5 && i <= 1000; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				sum += i;
				System.out.println("number = " + i);
				counter ++;
			}
		}
		System.out.println("Sum of numbers divisible by 3 & 5 = " + sum);
	}

	public static double calculateInterest(double amount, double rate)
	{
		return amount * (rate / 100);
	}

	public static String getDurationString (int seconds)
	{
		int min = 0;

		if (!(seconds < 0))
		{
			min = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(min, seconds);
		}
		return "Invalid parameters";
	}

	public static void switchPractice(char a)
	{
		switch (a)
		{
			case 'A':
				System.out.println(a + " = Able");
				break;
			case 'B':
				System.out.println(a + " = Baker");
				break;
			case 'C':
				System.out.println(a + " = Charlie");
				break;
			case 'D':
				System.out.println(a + " = Dog");
				break;
			case 'E':
				System.out.println(a + " = Easy");
				break;
			default:
				System.out.println(a + " not found");
				break;
		}
	}


	public static String getDurationString (int minutes,int seconds)
	{
		int hour = 0;

		if (!(minutes < 0) && !(seconds < 0) && !(seconds >= 60))
		{
			hour = minutes / 60;
			minutes = minutes % 60;

			return hour + "h " + minutes + "m " + seconds + "s";
		}

		return "Invalid parameters";
	}
	public static double convertToCentimeters(int heightInInches)
	{
		// 1 inch = 2.54 cm
		return (2.54 * heightInInches);
	}

	public static double convertToCentimeters(int heightInFeet, int heightInInches)
	{
		return convertToCentimeters((heightInFeet * 12) + heightInInches);
	}

	public static boolean areEqualByThreeDecimalPlaces (double num1, double num2)
	{

		int num3 = (int) (num1 * 1000.0);
		int num4 = (int) (num2 * 1000.0);

		return num3 == num4;

	}

	public static void displayHighScorePosition(String player, int position)
	{

		System.out.println(player + " managed to get into position " + position + " on the higher score list");
	}

	public static int calculateHighestScorePosition (int score)
	{
		int position = 0;

		if (score >= 1000)
		{
			position = 1;
		}
		else if (score >= 500)
		{
			position = 2;
		}else if (score >= 100)
		{
			position = 3;
		}
		else
		{
			position = 4;
		}
		return position;
	}

	public static void plusMinus(List<Integer> arr) {

		if (Objects.isNull(arr) || arr.isEmpty())
		{
			System.out.print("0.000000\n0.000000\n0.000000");
			return;
		}

		int totalNums = arr.size();
		double positiveCount = 0;
		double negativeCount = 0;
		double zerosCount = 0;

		for (int i : arr)
		{
			if (i > 0)
			{
				positiveCount++;
			}
			else if (i < 0)
			{
				negativeCount++;
			}
			else
			{
				zerosCount++;
			}
		}

		DecimalFormat decimalFormat = new DecimalFormat("#.######");

		System.out.println(decimalFormat.format(positiveCount / totalNums));
		System.out.println(decimalFormat.format(negativeCount / totalNums));
		System.out.println(decimalFormat.format(zerosCount / totalNums));
	}



	public static String timeConversion(String s) {

		StringBuilder sBuilder = new StringBuilder(s);

		int hour =Integer.parseInt(s.substring(0, 2));

		String zone = s.substring(s.length()-2);

		sBuilder.delete(sBuilder.length()-2, sBuilder.length());

		if (zone.equals(AM))
		{
			if (hour == 12)
			{
				return sBuilder.replace(0, 2, "00").toString();
			}
		}
		else if (zone.equals(PM))
		{
			if (hour != 12)
			{
				hour += 12;
				return sBuilder.replace(0, 2, Integer.toString(hour)).toString();
			}

		}

		return sBuilder.toString();
	}

	public static boolean isPrime(int number)
	{
		if (number <= 2)
		{
			if (number == 2)
			{
				return true;
			}
			return false;
		}

		for (int i = 2; i <= number/2; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}


}
