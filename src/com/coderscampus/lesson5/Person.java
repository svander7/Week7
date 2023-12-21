package com.coderscampus.lesson5;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
	
	static final long serialVersionUID = 1L;
	
	private String name;
	private Integer height;
	
	public Person (String name, Integer height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person that) {
		if (this.height.compareTo(that.height) == 0) {
			return this.name.compareTo(that.name);  // this will sort names in asc order.
		} else {
			return that.height.compareTo(this.height);  // this will sort height in desc order.
		}
		
		// This is another way to solve the sorting problem,
		//   but it's just more code.  But you have to have
		//   a type that is sortable (Integer is, int is NOT).
		
//		if (this.height > that.height) {
//			return -1;
//		} else if (this.height.equals(that.height)) {
//			return this.name.compareTo(that.name);
//		} else {
//			return 1;
//	}	
	}
}
