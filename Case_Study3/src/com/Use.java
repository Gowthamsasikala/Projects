package com;

public class Use {

	public static void main(String[] args) throws UniversityException {
		
		Student sc = new Student("Gowtham",28);
         sc.registerStudent();
        System.out.println("--------------------------------------------");
         Student s = new Student("Malini",24);
         s.registerStudent();
         System.out.println("--------------------------------------------");
	}

}
