package com;
import java.util.*;
public class Registrar {
	static int id = 0,count=0;
	static TreeSet<String> tset = new TreeSet<>();
	
	private Registrar() {
		
	}
	
	public static Registrar getRegistrar() {
		
		return new Registrar();
	}
	
	public String registerStudent(Student student) throws RegistrationException {
		Validator vali = Validator.getValidator();
		 boolean b = vali.validateStudentDetails(student);
		 
		if(b)
		{   
			tset.add(student.getName());
			//System.out.println(tset);
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
