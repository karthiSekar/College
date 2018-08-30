package com.college;

import java.util.HashMap;

public class Subject {

	private String name;
	
	private HashMap<Integer, Integer> marks;

	public Subject(String name, HashMap<Integer, Integer> marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<Integer, Integer> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<Integer, Integer> marks) {
		this.marks = marks;
	}
	
}
