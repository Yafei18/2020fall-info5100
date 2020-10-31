package class13.threads;

public class FunctionalTest {

	public static void main(String[] args) {
		Teacher englishTeacher = new EnglishTeacher();
		Teacher mathsTeacher = new MathsTeacher();
		teachToStudents(englishTeacher);
		teachToStudents(mathsTeacher);
		teachToStudents(new Teacher() {

			@Override
			public void teach() {
				System.out.println("Teaching Java");

			}

		});

		class DatabaseTeacher implements Teacher {

			@Override
			public void teach() {
				System.out.println("Teaching Database");

			}

		}
		teachToStudents(new DatabaseTeacher());
		teachToStudents(() -> teachMusic());
		teachToStudents(() -> trainOnTennis());
		teachToStudents(() -> {
			System.out.println("Teach Geography");
		});

	}

	static void teachToStudents(Teacher teacher) {
		teacher.teach();
	}

	static void teachMusic() {
		System.out.println("Teaching music");
	}

	static void trainOnTennis() {
		System.out.println("Teaching Tennis");
	}

}

interface Teacher {
	void teach();

	default void think() {
		System.out.println("Thinking");
	}
}

class EnglishTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teaching English");

	}

}

class MathsTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teaching Maths");

	}

}
