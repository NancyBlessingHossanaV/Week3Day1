package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Student name: David");
	}
public void studentDept() {
	// TODO Auto-generated method stub
System.out.println("Student Dep: IT");
}
public void stuId() {
	// TODO Auto-generated method stub
System.out.println("Student Id: 22108205033");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.departmentName();
		s.studentDept();
		s.studentName();
		s.stuId();

	}

}

