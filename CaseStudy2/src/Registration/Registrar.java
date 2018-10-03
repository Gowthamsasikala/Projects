package Registration;

import university.Student;

public class Registrar {
	static int inc = 1;
	private Registrar() {

	}

	public static Registrar getRegistrar() {

		return new Registrar();

	}

	public static String registerStudent(Student student) {
            Validator v = Validator.getValidator();
            
          boolean val =   v.validateStudentDetails(student);
		   String a = "";
          if(val){
        	   a = "ADM"+inc;
        	   inc++;
        	  return a;
          }else{
        	  return null;
          }
      
	}

}
