package com.app.atmecs.lambdaAndFunctional;

public class CDACStudent {
	
	public static void main(String[] args) {
		
		Student s = new Student() {
			
			@Override
			public void lazy() {
				System.out.println("Students are lazy");
				
			}
		};
		s.lazy();
		
		Student student = ()->System.out.println("Student are lazy");
		student.lazy();
	}

}
