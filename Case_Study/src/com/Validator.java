package com;

public class Validator {

	private Validator() {
		
		
	}
	
	public static Validator getValidator() {
		
		return new Validator();
	}
	
	public boolean validateStudentDetails (Student student) {
		if(student.getName()!=null && student.getName().length()>1)
		{
			return true;
		}
		
		return false;
	}
}
