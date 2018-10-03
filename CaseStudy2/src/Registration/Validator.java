package Registration;

import university.Student;

public class Validator {

	private Validator() {

	}

	public static Validator getValidator() {

		return new Validator();
	}

	public static boolean validateStudentDetails(Student student) {
           
		if(!(student.getName().equals(null))){
			return true;
		}else{
			return false;
		}
		
	}
}
