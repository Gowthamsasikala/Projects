package com;

public class Student {
  
	private String Name ;
	private String Marital_Status;
	private int Age;
	private String Sex;
	private String DOB; 
	private String Address;
	private String Primary_Email_id; 
	private String Secondary_Email_id;
	private String Phone_Number;
	private String Interested_Subject;
	private String Highest_Education_Qualification;
	private String Nationality;
	String admissionId;
	String result;
	Exam exam; 
 
	Student(String Name){
		this.Name = Name;
	}
	
	public void registerStudent() {
		Registrar regis = Registrar.getRegistrar();
		admissionId = regis.registerStudent(this);
		if(Name.length()>1) {
		System.out.println("Name is :"+getName());
		System.out.println("AdmissionID of the student "+getName()+" is :"+admissionId);
		registerForExam();
		}
		else {
			System.out.println("Please enter the Student Name ");
		}
	}
	
	public void registerForExam() {
		if(admissionId!=null) {
		ExamRegistrar examregis =ExamRegistrar.getExamRegistrar();
		exam = examregis.registeringStudentForExamination(this);
		appearForExam();
		}
	}
	
	public void appearForExam() {
		if(admissionId!=null) {
		Paper paper = exam.getPaper();
		result = paper.Submit();
		System.out.println("And the result of the examination is : "+result);
	}
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
	
	
}
