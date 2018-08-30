package com.college;

import java.util.HashMap;
import java.util.List;

public class Department {

	private String name;
	
	private String head;
	
	private HashMap<Integer, String> advisorMap;
	
	private HashMap<Integer, List<Student>> studentsMap;

	public Department(String name, String head, HashMap<Integer, String> advisorMap, HashMap<Integer, List<Student>> studentsMap) {
		this.name = name;
		this.head = head;
		this.advisorMap = advisorMap;
		this.studentsMap = studentsMap;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public HashMap<Integer, String> getAdvisorMap() {
		return advisorMap;
	}

	public void setAdvisorMap(HashMap<Integer, String> advisorMap) {
		this.advisorMap = advisorMap;
	}

	public HashMap<Integer, List<Student>> getStudentsMap() {
		return studentsMap;
	}

	public void setStudentsMap(HashMap<Integer, List<Student>> studentsMap) {
		this.studentsMap = studentsMap;
	}
	
}
