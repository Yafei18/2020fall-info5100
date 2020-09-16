
public class University {

	public static void main(String[] args) {
		Professor siva = new Professor();
		siva.name = "Siva Dosapati";
		Professor john = new Professor();
		john.name = "John Adams";
		siva.teach();
		john.teach();

		Student a1, a2, a3, a4, a5, a40;
		Student student[] = new Student[44];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		student[3] = new Student();

		System.out.println(student.length);
		student[1].askQuestion();
		student[4] = new Student();
		student[4].askQuestion();

		student[0].askQuestion();
		student[1].askQuestion();
		student[2].askQuestion();

		for (Student s : student) {
			s.askQuestion();
		}

		Professor[] professorsInUniversity = new Professor[25];

		professorsInUniversity[0].teach();

		Student dawei = new Student(), anjali = new Student();

		// siva = anjali;
		dawei = anjali;

		student[3] = dawei;
		student[4] = anjali;
		// student[5] = siva;

		Object[] objects = new Object[5];
		objects[0] = siva;
		objects[1] = anjali;
		objects[2] = "North Eastern University";
		objects[3] = 34;

		// objects[0].teach();

	}

}
