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
			to the instance variable reflected to the every instance of that class bcz all the instances share a single
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
	 		non - static methods of the class are also called instance methods. they are accessed with the reference
	 		of the object only. We can access the static members directly from instance methods and instance members
	 		using this keyword or by using the specific object reference.
	 */

	public static void main(String [] arg)
	{
		Customer customer = new Customer("ayaz");
		customer.printName(new Customer("haris"));
	}

	/*
	POJO: are classes which generally contains only fields and not contain any method other than getters and setters.
	They are generally used while communicating with databases i.e., to get data from the db and save data to the DB.
	They are also called DTO (Data transfer object)
	 */
}
