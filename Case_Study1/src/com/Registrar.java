package com;

public class Registrar {
	static int id = 0;
	private Registrar() {
		
		
		
	}
	
	public static Registrar getRegistrar() {
		
		return new Registrar();
	}
	
	public String registerStudent(Student student) {
		Validator vali = Validator.getValidator();
		 boolean b = vali.validateStudentDetails(student);
		 
		if(b)
		{  
			String str = "A00"+ (++id);
			return str;
		}
		return null;
	}
	
	
}
