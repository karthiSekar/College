package com.college;

import java.util.HashMap;

public class Constants {

	private static HashMap<String, Integer> deptToSubject = new HashMap<>();
	
	static {
		deptToSubject.put("IT", 3);
		deptToSubject.put("CS", 2);
	}
	
	public static int getNumOfSubjects(String dept) {
		return deptToSubject.get(dept);
	}
}
