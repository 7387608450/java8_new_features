package com.app.atmecs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ForEachMethod {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> listOfTechnologies = new ArrayList<>();
		
		listOfTechnologies.add("JAVA");
		listOfTechnologies.add("C++");
		listOfTechnologies.add(".NET");
		
		//Below code snipped throws java.util.ConcurrentModificationException..
		/*Iterator<String> iterator = listOfTechnologies.iterator();
		listOfTechnologies.add("C");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		
		/*//for each is a default method present in a Iterable<I>
		listOfTechnologies.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		} );*/
		System.out.println(listOfTechnologies);
	
	listOfTechnologies.forEach((t)->System.out.println(t));
	
	}

}
