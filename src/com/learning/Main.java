package com.learning;

import com.learning.OOP.BankAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	private static final String INVALID_VALUE = "INVALID STRING";

	public static void main(String[] args)
	{
		// write your code here
		int primeNoCount = 0;
		double myFirstDoubleVar = 20.00;
		double mySecondDoubleVar = 80.00;

		double doubleRes = (myFirstDoubleVar + mySecondDoubleVar) * 100.00;

		double doubleRemainder = doubleRes % 40.00;

		boolean isRemainderZero = doubleRemainder == 0d;

		if (!isRemainderZero)
			System.out.println("Got some remainder...");


		displayHighScore("ayaz",calculateHighScorePosition(1500));
		displayHighScore("haris",calculateHighScorePosition(900));
		displayHighScore("momin",calculateHighScorePosition(400));
		displayHighScore("zak",calculateHighScorePosition(50));

		System.out.println(calcFeetAndInchesToCentimeter(6,0));

		getDurationString(72,0);
		nameChar('B');
		printDayOfTheWeek(-1);
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);

		System.out.println(1924 % 400);

		for (int i = 8; i > 1; i --)
		{
			System.out.println(i +"% of 10,000 = " + String.format("%.3f",calculateInterest(10000,i)));
		}
		System.out.println("*************************************************\n\n");
		for (int i = 10 ; i < 50 ; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i + " is a prime number");
				primeNoCount ++;
			}

			if (primeNoCount == 3)
				break;
		}

		System.out.println("*************************************************\n\n");

		for (int i = 1 ; i < 10 ; i++)
		{
			System.out.println("square root of "+ i +" = " + Math.sqrt(i));
		}

		sum3and5();

		System.out.println(sumDigits(10));

		System.out.println(-120/10);

		System.out.println(getGreatestCommonDivisor(10,35));

		System.out.println(getDigitCount(11000));

		System.out.println(isPrime(2));


		printSquareStar(20);

		formatDate("2023-08-17T14:53:58.885Z");

		fromLong(1692262808429L);

		BankAccount AyazAccount = new BankAccount();
		AyazAccount.setAccountName("Ayaz");
		AyazAccount.setAccountNumber("091278300007");
		AyazAccount.setEmail("muhammad.iyaz150@gmail.com");
		AyazAccount.setPhone("+923009495789");
		AyazAccount.depositAmount(100000);
		AyazAccount.withDrawAmount(24000);


		BankAccount harisAcc = new BankAccount();
		harisAcc.setAccountName("HARIS");
		harisAcc.setAccountNumber("091278300008");
		harisAcc.setEmail("muhammad.haris@gmail.com");
		harisAcc.setPhone("+923009495788");
		harisAcc.depositAmount(200000);
		harisAcc.withDrawAmount(24000);
		
	}


	//*************************************************


	public static int getDigitCount (int number)
	{
		if (number < 0)
		{
			return -1;
		}

		int DigitsCount = 0;

		while (number != 0)
		{
			number /= 10;
			DigitsCount ++;
		}

		return DigitsCount;
	}

	public static int getGreatestCommonDivisor (int first , int second)
	{
		if (first > 10 && second > 10)
		{
			int greaterNo = second;
			if (first > second)
			{
				greaterNo = first;
			}

			for (int i = greaterNo/2 ; i > 0 ; i--)
			{
				if (first % i == 0 && second % i == 0)
				{
					return i;
				}
			}
			return -1;
		}
		else
		{
			return -1;
		}
	}


	public static int reverseInt(int x) {

		if (x < 10 && x > -10)
		{
			return x;
		}

		long newNum = 0;
		int lastDigit;
		do {
			lastDigit = x % 10;
			x /= 10;
			newNum = (newNum * 10) + lastDigit;

			if (x == 0)
				break;
		}while (x != 0);

		if (newNum <= Integer.MAX_VALUE && newNum >= Integer.MIN_VALUE)
		{
			if (x < 0)
				return (int)-newNum;
			else
				return (int)newNum;
		}
		else
		{
			return 0;
		}
	}



	public static long sumDigits (long num)
	{
		if (num < 10)
		{
			return -1;
		}
		long sum = 0;
		long lastDigit;

		do {
			lastDigit = num % 10;
			num /= 10;
			sum += lastDigit;
		}while (num != 0);

		return sum;
	}


	public static long reverseNum (long num)
	{
		if (num < 10)
		{
			return -1;
		}

		return 0;
	}

	public static boolean isEven (int number)
	{
		return number % 2 ==0;
	}

	public static void sum3and5 ()
	{
		long finalSum = 0;
		int countOfNum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("number " + i + "  is divisible by 3 and 5");
				finalSum += i;
				countOfNum ++;
				if (countOfNum == 5)
				{
					System.out.println("sum of numbers divisible by 3 and 5 = " +finalSum);
					break;
				}
			}
		}
	}

	public static boolean isPrime (int num)
	{
		if (num == 1)
		{
			return false;
		}

		for (int i = 2 ; i <= num /2 ; i ++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static double calculateInterest(double amount , double date)
	{
		return amount * (date / 100);
	}

	public static void displayHighScore (String playerName ,int positionInTable)
	{
		System.out.println( playerName+ " Managed to get into position " +positionInTable + " on the high score table");
	}

	public static int calculateHighScorePosition (int playerScore)
	{
		if (playerScore >= 1000)
			return 1;
		else if (playerScore >= 500)
			return 2;
		else if (playerScore >= 100)
			return 3;
		else
			return 4;
	}

	public static double calcFeetAndInchesToCentimeter (double feet, double inches)
	{
		if (!(feet >=0 && (inches >=0 && inches <=12) ))
		{
			return -1;
		}

		return (feet * 12 + inches) * 2.54;
	}

	public static double calcFeetAndInchesToCentimeter (double inches)
	{
		if (inches < 0)
		{
			return -1;
		}
		double feet = inches / 12;
		double remainingInches = inches % 12;
		return calcFeetAndInchesToCentimeter(feet, remainingInches);
	}

	public static String getDurationString (int min, int sec)
	{
		if (!(min >= 0 && sec >= 0 && sec <= 60))
		{
			return INVALID_VALUE_MESSAGE;
		}

		int noOfHours = min / 60;
		min = min % 60;

		String hourStr = appendLeadingZeroIfRequired(noOfHours);
		String minStr = appendLeadingZeroIfRequired(min);
		String secStr = appendLeadingZeroIfRequired(sec);

		System.out.println(hourStr+"h " +minStr+ "m "+secStr+ "s ");
		return noOfHours+"h " +min+ "m "+sec+ "s ";
	}

	private static String appendLeadingZeroIfRequired (int num)
	{
		if (num < 10)
			return "0"+ num;
		return String.valueOf(num);
	}

	public static String getDurationString (int sec)
	{
		if (sec < 0)
		{
			return INVALID_VALUE_MESSAGE;
		}

		int minutes = sec / 60;
		sec = sec % 60;

		return getDurationString(minutes, sec);
	}

	public static void nameChar (char ch)
	{
		switch (ch)
		{
			case 'A': case 'B': case 'C':case 'D':case 'E':
				getCharMessage(ch);
				break;

			default:
				System.out.println("character didn't match A,B,C,D and E");
				break;
		}
	}

	private static void getCharMessage (char ch)
	{
		System.out.println("character found = "+ch);
	}


	public static void printDayOfTheWeek (int day)
	{
		switch (day)
		{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid number");
				break;
		}
	}

	public static void printDayOfTheWeekUsingIfElse (int day)
	{
		if (day == 0)
			System.out.println("Sunday");
		else if (day == 1)
			System.out.println("Monday");
		else if (day == 2)
			System.out.println("Tuesday");
		else if (day == 3)
			System.out.println("Wednesday");
		else if (day == 4)
			System.out.println("Thursday");
		else if (day == 5)
			System.out.println("Friday");
		else if (day == 6)
			System.out.println("Saturday");
		else
			System.out.println("Invalid number");
	}


	private int printPrimeNumbers (int maxNum)
	{
		return maxNum;
	}

	public static void printSquareStar (int number)
	{
		if (number < 5)
		{
			System.out.println (INVALID_VALUE);
			return;
		}

		for (int i = 0 ; i < number ; i++)
		{
			for (int j = 0; j < number ; j ++)
			{
				if (i == 0 || i == number -1 || j == 0 || j == number - 1 || i == j || j == number - (i+1))
				{
					System.out.print ("*");
				}

				else
				{
					System.out.print (" ");
				}
			}
			System.out.println ();
		}

	}


	public static Date formatDate(String dateInString) {

		SimpleDateFormat dayFormatter = new SimpleDateFormat(DATE_FORMAT);
		Date dateTime=null;
		try{
			dateTime = dayFormatter.parse(dateInString);
		}
		catch (ParseException ignored){

		}


		return dateTime;
	}


	public static void fromLong(long dateInString)
	{
		Date date = new Date(dateInString);
		System.out.println("Date: " + date);

	}
}
