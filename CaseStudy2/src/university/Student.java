package university;

import Examination.Exam;
import Examination.ExamRegistrar;
import Examination.Paper;
import Registration.Registrar;

public class Student {

	private String Name;
	private String Marital_Status;
	private int Age;
	private String Sex;
	private String Date_of_Birth;
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
    public Student(){
    	
    }
	public Student(String name,String sex,int age) {

		this.Name = name;
		this.Sex = sex;
		this.Age = age;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}
    
	public String getInterested_Subject() {
		return Interested_Subject;
	}

	public void setInterested_Subject(String interested_Subject) {
		Interested_Subject = interested_Subject;
	}

	public void registerStudent() {

		Registrar r = Registrar.getRegistrar();
		admissionId = r.registerStudent(this);
		// System.out.println("register"+admissionId);
		if (admissionId != null && getName().length() > 1) {

			System.out.println("AdmissionID is : " + admissionId);
			System.out.println("subject "+this.getInterested_Subject());
			registerForExam();
		} else {
			System.out.println("One of the Student feild is Empty ");
		}
	}

	public void registerForExam() {
		if (!(admissionId).equals(null)) {
			ExamRegistrar e = ExamRegistrar.getExamRegistrar();

			exam = e.registeringStudentForExamination(this);

			appearForExam();
		}

	}

	public void appearForExam() {

		Paper paper = exam.getPaper();

		String result = paper.submit();

		System.out.println("The student " + getName() + " result is " + result);
		
	}

}
