package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Use {

	public static void main(String[] args) throws UniversityException, IOException, FileNotFoundException {
		
		
			Student sc = new Student("Gowtham", 28);
			sc.registerStudent();
			//Student sr1 = (Student) ois1.readObject();
			//System.out.println(sr1.getAge() + "-----" + sr1.getName());
			System.out.println("---------------------------------------------------------");
			Student s1 = new Student("Malini", 24);
			s1.registerStudent();
			System.out.println("--------------------------------------------------------");
			Student s2 = new Student("Abbas", 31);
			s2.registerStudent();
			System.out.println("--------------------------------------------------------");
			Student s3 = new Student("Subasree", 24);
			s3.registerStudent();
			System.out.println("--------------------------------------------------------");
			Student s4 = new Student("sowmiya", 25);
			s4.registerStudent();
			System.out.println("--------------------------------------------------------");

			Registrar.displayStuDetails();
			System.out.println("--------------------------------------------------------");
	try {
		for(int i=0;i<5;i++) {
			
			String str = "src/StudentDetails"+i+".txt";
		FileInputStream fileIn = new FileInputStream(str);

		ObjectInputStream ois1 = new ObjectInputStream(fileIn);
		Student sr1 = (Student) ois1.readObject();
		System.out.println("The Student Name is "+sr1.getName()+ " and Age is "+sr1.getAge());
	}
	}
	catch (Exception ex) {
			ex.printStackTrace();
		}

	System.out.println("--------------------------------------------------------");

}
}