package com.college;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class Data {

	private Student getStudentDetails() {

		System.out.println("Enter Student name:");
		String name = null;
		
		System.out.println("Enter Student id:");
		String id = null;
		
		System.out.println("Enter Student department (IT/CS):");
		String dep = null;
		
		System.out.println("Enter Student year of joining:");
		int yoj = 0;
		
		int yearOfStudy = getYOS(yoj);
		
		HashMap<Integer, List<Subject>> yearSubjects = getSubjects(yearOfStudy, dep);
		
		return new Student(id, name, dep, yoj, yearSubjects);
	}
	
	private HashMap<Integer, List<Subject>> getSubjects(int yearOfStudy, String dept) {
		HashMap<Integer, List<Subject>> yearSubject = null;
		if(yearOfStudy > 0 && yearOfStudy <= 4) {
			yearSubject = new HashMap<>();
			for(int year = 1; year <= yearOfStudy; year++) {
				int numSubjects = 6;
				List<Subject> subjects = new ArrayList<>();
				if(year == 4) {
					numSubjects = Constants.getNumOfSubjects(dept);
				}
				
				for(int subIndex = 0; subIndex < numSubjects; subIndex++) {
					System.out.println("Enter the subject for the year " + year); 
					Subject sub = getSubjectDetails();
					subjects.add(sub);
				}
				yearSubject.put(year, subjects);
			}
		}
		
		return yearSubject;
	}
	
	private int getYOS(int yoj) {
		
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);
		
		return (currentYear - yoj) + 1;
	}

	private Subject getSubjectDetails() {

		System.out.println("Enter the subject name:");
		String name = ""; //TODO: get from user
		
		HashMap<Integer, Integer> marks = new HashMap<>();
		for(int internal = 1; internal <= 3; internal++) {
			System.out.println("Enter the internal mark:");
			int mark = 0; //TODO: get from user
			marks.put(internal, mark);
		}
		
		return new Subject(name, marks);
	}

	public Department getDepartmentDetails() {

		System.out.println("Enter the dept name:");
		String name = null;
		
		System.out.println("Enter the dept head:");
		String head = null;
		
		HashMap<Integer, String> advisors = new HashMap();
		HashMap<Integer, List<Student>> studentMap = new HashMap(); 
		
		for(int year = 1; year <=4; year++) {
			System.out.println("Enter the CA for year " + year);
			String ca = null;
			advisors.put(year, ca);
		}
		
		for(int year = 1; year <= 4; year++) {
			List<Student> students = new ArrayList<>();
			System.out.println("Enter number of students:"); 
			int numStudents = 0;
			for(int student = 1; student <= numStudents; student++) {
				Student stud = getStudentDetails();
				students.add(stud);
			}
			studentMap.put(year, students);
		}
		
		return new Department(name, head, advisors, studentMap);
	}
}
