package com;

public class Use {

	public static void main(String[] args) throws UniversityException {
		
		Student sc = new Student("Gowtham",28);
         sc.registerStudent();
        System.out.println("---------------------------------------------------------");
         Student s1= new Student("Malini",24);
         s1.registerStudent();
         System.out.println("--------------------------------------------------------");
         Student s2 = new Student("Abbas",31);
         s2.registerStudent();
         System.out.println("--------------------------------------------------------");
         Student s3 = new Student("",24);
         s3.registerStudent();
         System.out.println("--------------------------------------------------------");
         Student s4 = new Student("sowmiya",25);
         s4.registerStudent();
         System.out.println("--------------------------------------------------------");
         
         Registrar.displayStuDetails();
	}

}
