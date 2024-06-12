package com.learning.OOP;

public class ObjectOrientedProgramming
{
	/*
	modeling real word objects to software object is the fundamental part of object-oriented programming.

	setters: method which sets the value for private field of the class.
	getters: methods which access the private field's value of the class and return it.

	purpose of these methods is to control and protect the access to private fields.

	constructor chaining: when from one constructor you call another overloaded constructor explicitly.
	you must use a special statement this() while calling a constructor from another constructor and this must be the first statement in the
	constructor body.

	Class / object / instance / reference.

	Class: is a blueprint for creating objects. It's like a template using which we can instantiate objects.
	Object: object is an instance of a class having specified values to the class's fields.
	Instance: Object and instance are interchangeable terms.
	Reference: is a reference to the object in memory, any operation we want to perform on specific object is being
	done through the references. we can have multiple references to a single object in memory.

	static and instance variables:
			static variables are shared among all instances of the class and are available at class level. To have an
			access to them we don't need to create an object as they are not associated with the object. Any changes
			to the static variable reflected to the every instance of that class bcz all the instances share a single
			copy of the static variable.

	Non - static:
			unlike static variables non-static variables also called instance variables. They are associated with
			the instances of the class and each instance have a separate copy of it. and each instance can have a
			different value for his instance variable.

	Static - methods:
			static methods are available on class level and from static methods we can't access instance variables
			and methods. we can only access the static members of the class out of this method directly (without specifying "this" keyword).

	 this -> represents the current instance of the class.

	 non - static methods:
	 		non - static methods of the class are also called instance methods. they are accessible with the reference
	 		of the object only. We can access the static members directly from instance methods,
	 		using this keyword or by using the specific object reference.
	 */

//	public static void main(String [] arg)
//	{
//		//Customer customer = new Customer("ayaz");
//		//customer.printName(new Customer("haris"));
//
//		MeetingRoom meetingRoom = new MeetingRoom();
//		Room room = new Room();
//		DrawingRoom drawRoom = new DrawingRoom();
//		Room drawRoom1 = new DrawingRoom();
//
//		System.out.println(meetingRoom.noOfAC); // 2
//		System.out.println(MeetingRoom.noOfAC); // 2
//		System.out.println(Room.noOfAC); 		// 1
//
//		System.out.println(room.noOfAC); 		// 1
//		System.out.println(drawRoom.noOfAC);	// 3
//
//		drawRoom.staticMethod();
//		drawRoom1.staticMethod();
//		DrawingRoom.staticMethod();
//		Room.staticMethod();
//
//
//	}

	/*
	Static variables are associated with Class.
	 */

	/*
	POJO: are classes which generally contains only fields and not contain any method other than getters and setters.
	They are generally used while communicating with databases i.e., to get data from the db and save data to the DB.
	They are also called DTO (Data transfer object)

	Inheritance: is a way to arrange classes in a parent-child hierarchy, which lets the child inherit (re-use) variables and methods of the parent class.
	In java child class can only have one direct parent class. (multiple inheritance not allowed). But child class inherit members from parent class's
	parent, and so on.

	super() : is lot like this(), it's calling the constructor of the parent class. super () should be the first line of the constructor.
	if we don't make a call to super explicitly, then java do it for us by calling super class's default constructor. If super class's default constructor
	is not available then we must have to call super in our each child class's constructor.

	Because of the constraint that this() & super() have to be first line of the constructor we don't have this() & super()
	in the same constructor.


	Polymorphism:
		polymorphism is a power feature of OOP which enables an action to perform differently based on the object type
		on runtime. It is achieved through method overriding and it enhances the flexibilty and extentbilty of the code.

		types of polymorphism:
			- Compile-time polymorphism.
			- Run-time polymorphism.

		compile-time is which will determine which method will be involked at compile time. It is achieved through method overloading
		Run-time is which will determine which method to envoke at the runtime based on the object type. It is achieved through
		method overriding.



	Encapsulation:
		Encapsulation is bundling of the data(variables) and method that operate on them in a single class.
		it is achieved by access modifiers. (Set the field as private and provide public getters setters for the private members)

		it is useful in managing the access to sensitive data.

	 */

}



