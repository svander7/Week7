package com.coderscampus.lesson5;

import java.util.Arrays;

public class SortingApplication {

	public static void main(String[] args) {
		
		String[] names = new String[4];
		
		names[0] = "Josh Allen";
		names[1] = "Trevor Page";
		names[2] = "Elon Musk";
		names[3] = "Jordan Bellfast";
		
		System.out.println("Pre-sorting");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("- - - - - -");
		Arrays.sort(names);
		System.out.println("Post-sorting");
		for (String name : names) {
			System.out.println(name);
		}
		
		Person[] people = new Person[5];
		
		people[0] = new Person("Josh Allen", 72);
		people[1] = new Person("Trevor Page", 70);
		people[2] = new Person("Elon Musk", 74);
		people[3] = new Person("Jordan Bellfast", 71);
		people[4] = new Person("Jane Doe", 70);
		
		Arrays.sort(people);
		
		System.out.println("- - - - - -");
		for (Person person : people) {
			System.out.println(person.getName());
		}
		
		
	}

}
