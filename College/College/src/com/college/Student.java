package com.college;

import java.util.HashMap;
import java.util.List;

public class Student {

	private String id;
	
	private String name;
	
	private String dept;
	
	private int yoj;
	
	private HashMap<Integer, List<Subject>> yearToSubjectMap;
	
	public Student(String id, String name, String dept, int yoj, HashMap<Integer, List<Subject>> yearToSubjectMap) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.yoj = yoj;
		this.yearToSubjectMap = yearToSubjectMap;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public HashMap<Integer, List<Subject>> getYearToSubjectMap() {
		return yearToSubjectMap;
	}

	public void setYearToSubjectMap(HashMap<Integer, List<Subject>> yearToSubjectMap) {
		this.yearToSubjectMap = yearToSubjectMap;
	}
	
}
