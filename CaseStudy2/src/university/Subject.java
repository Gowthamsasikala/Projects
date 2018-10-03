package university;

public class Subject {

	int val;
	static String subject;

	// static Student s1;

	public static void Details() {

		System.out.println("---------Subject Details----------");
		System.out.println("Choose your specializations");
		System.out.println("Press 1 for Maths ");
		System.out.println("Press 2 for Physics ");
		System.out.println("Press 3 for Chemistry ");
		System.out.println("Press 4 for Tamil ");
		System.out.println("Press 5 for English ");
		System.out.println("------------------------------------");

	}

	public static void select(int val, Student s1) {

		switch (val) {

		case 1: {
			subject = "Maths";
			s1.setInterested_Subject(subject);
			System.out.println("You have selected Maths");

			break;
		}
		case 2: {
			subject = "Physics";
			s1.setInterested_Subject(subject);
			System.out.println("You have selected Physics");

			break;
		}
		case 3: {
			subject = "Chemistry";
			s1.setInterested_Subject(subject);
			System.out.println("You have selected Chemistry");

			break;
		}
		case 4: {
			subject = "Tamil";
			s1.setInterested_Subject(subject);
			System.out.println("You have selected Tamil");

			break;
		}
		case 5: {
			subject = "English";
			s1.setInterested_Subject(subject);
			System.out.println("You have selected English");

			break;
		}
		default: {
			System.out.println("Please select the Subjects which is listed above");
		}

		}

	}

}
