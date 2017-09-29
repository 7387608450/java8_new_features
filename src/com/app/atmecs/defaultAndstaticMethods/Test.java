package com.app.atmecs.defaultAndstaticMethods;

public class Test {
	public static void main(String[] args) {
		
		Employee e = new DeveloperEmployee();
		e.address();
		e.name();
		e.salary();
		Employee.locationOfCompany();
	}

}
