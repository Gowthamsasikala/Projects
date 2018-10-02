package com;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class Registrar {
	static int id = 0,count=0,count1=0;
	static TreeSet<String> tset = new TreeSet<>();
	
	private Registrar() {
		
	}
	
	public static Registrar getRegistrar() {
		
		return new Registrar();
	}
	
	public String registerStudent(Student student) throws RegistrationException,IOException {
		
		FileOutputStream fos = new FileOutputStream("src/StudentDetails"+count1+".txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Validator vali = Validator.getValidator();
		count1++;
		 boolean b = vali.validateStudentDetails(student);
		 
		if(b)
		{   
			tset.add(student.getName());
			//System.out.println(tset);
			oos.writeObject(student);
			oos.flush();
			String str = "A00"+ (++id);
			return str;
		}
		return null;
	}
	//static List<String> list = new ArrayList<>(tset);
	
	public static void displayStuDetails() {
		System.out.println("The Students are Listed Below :");
		System.out.println("--------------------------------------------------");
		for(String stu:tset) {
			count++;
			System.out.println(count+" : "+stu);
		}
		
	}
	
	
}
