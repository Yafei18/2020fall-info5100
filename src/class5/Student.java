package class5;

public class Student {
	private String name;

	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " is speaking");
	}

	public static void main(String args[]) {
		Student anjali = new Student("Anjali");
		anjali.speak();

		Student yidan = new Student("Yidan");
		yidan.speak();

		Student tina = new Student("Tina");

		// anjali.name = "Tina";

		anjali.speak();

		Professor siva = new Professor();
		siva.makeStudentSpeak(tina);
		siva.makeStudentSpeak(tina);
		siva.makeStudentSpeak(yidan);
		siva.makeStudentSpeak(yidan);
	}
}

class Professor {
	void makeStudentSpeak(Student student) {
		System.out.println("Professor is asking " + student.getName() + " to speak");
		student.speak();
		//student.name = "Deepika";
	}
}
