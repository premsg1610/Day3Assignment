package com.masai;

public class Student {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is:" + roll);
		System.out.println("Name is: " + name);
		System.out.println("Marks is: " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 45;
		s1.name = "Prem";
		s1.marks = 85;
		
		Student s2 = s1;
		s2.roll = 37;
		s2.name = "Priyanka";
		s2.marks = 80;
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		
		s1 = null;
//		s2 = null;
		
//		s1.displayStudentDetails();
//		s2.displayStudentDetails();
		
	}
}
