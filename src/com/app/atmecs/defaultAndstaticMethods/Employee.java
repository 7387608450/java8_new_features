package com.app.atmecs.defaultAndstaticMethods;

public interface Employee {
	
	public abstract void name();
	public abstract void address();
	
	public default void salary(){
		System.out.println("We are getting salary");
	
	}
	public static void locationOfCompany()
	{
		System.out.println("We are located in hyderabad");
	}

}
