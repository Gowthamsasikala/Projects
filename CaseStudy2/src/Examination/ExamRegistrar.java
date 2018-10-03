package Examination;

import university.Student;

public class ExamRegistrar {

	private ExamRegistrar(){
		
	}
	
	public static ExamRegistrar getExamRegistrar () {
		
		return new ExamRegistrar();
				
	}
	
	
	public Exam registeringStudentForExamination (Student student) {
		
		Paper p = new Paper();
		
		Exam exam = new Exam(p);
		
		return exam;
	}
}
