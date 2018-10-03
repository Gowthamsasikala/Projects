package com;
import java.util.*;
import university.Student;
import university.Subject;

public class Main {
   
	public static void main(String[] args) {
		Subject.Details();
		Scanner sc = new Scanner(System.in);
		
	Student	s = new Student("karthi", "male", 21);
		
		int val = sc.nextInt();
		Subject.select(val, s);
		s.registerStudent();
	}

}
