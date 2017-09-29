package com.app.atmecs.streamAPI;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("JAVA");
		arrayList.add("C++");
		arrayList.add(".NET");
		
		arrayList.stream().filter((t)->{
			if(t.contains("java"))
					return true;
		else 
			return false;
	});
	}
	

}
