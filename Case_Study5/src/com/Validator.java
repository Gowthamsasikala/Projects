package com;

public class Validator {

	private Validator() {
		
		
	}
	
	public static Validator getValidator() {
		
		return new Validator();
	}
	
	public boolean validateStudentDetails (Student student) throws ValidatorException{
		if(student.getName()!=null && student.getName().length()>1 && (student.getAge()<35 && student.getAge()>23))
		{
			return true;
		}
		else {
			System.out.println("The Student age should not exceed 35 or lesser than 23 ");
		     return false;
		}
	}
}
