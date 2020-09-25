package class6;

public class University {

	public static void main(String[] args) {
		Student[] students = new Student[3];

	}

	void printStudentsNameInReverseOrder(Student[] student) {
		for (Student s : student) {
			String name = s.name;
			/*
			 * String string = name; char c[] = string.toCharArray(); String newString = "";
			 * for (int i = c.length - 1; i >= 0; i--) { newString = newString + c[i]; }
			 * System.out.println(newString);
			 */
			Counters counters = new Counters();
			System.out.println(counters.reverseCharacters(name));
		}
	}

}

class Student {
	String name;
}
