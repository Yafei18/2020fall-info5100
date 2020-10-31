package class13.threads;

public class University {

	public static void main(String args[]) {
		// askAndEat();
		onlyAsk();
	}

	private static void onlyAsk() {
		Student ZJ = new Student("ZJ");
		Student deepika = new Student("Deepika");
		Thread deepikaAskThread = new Thread(() -> {
			deepika.askQuestions();
		});
		Thread ZJaskThread = new Thread(() -> {
			ZJ.askQuestions();
		});

		ZJaskThread.start();
		deepikaAskThread.start();

		new Thread(() -> {
			deepika.sum("Deepika", 5, 3);
		}).start();
		;

		new Thread(() -> {
			ZJ.sum("ZJ", 5, 3);
		}).start();

	}

	private static void askAndEat() {
		Student ZJ = new Student("Zhijie");
		ThinkingThread ZJthinker = new ThinkingThread(ZJ);
		Thread ZJask = new Thread(() -> {
			ZJ.askQuestions();
		});
		Thread ZJeat = new Thread(() -> {
			ZJ.eat();
		});
		ZJthinker.start();
		ZJask.start();
		ZJeat.start();

		Student deepika = new Student("Deepika");

		Thread deepikaAskThread = new Thread(() -> {
			deepika.askQuestions();
		});
		Thread deepikaEatThread = new Thread(() -> {
			deepika.eat();
		});

		deepikaAskThread.start();
		deepikaEatThread.start();
		Thread deepikaEatThreadAnother = new Thread(() -> {
			deepika.eat();
		});
		deepikaEatThreadAnother.start();

	}

}

class Student extends Person {
	String name;
	Object LOCK = new Object();

	static Object ASK_LOCK = new Object();

	Student(String name) {
		super();
		this.name = name;
	}

	synchronized static int sum(String n, int a, int b) {
		loop(n + " is adding sum");
		return a + b;
	}

	public synchronized void askQuestions() {
		synchronized (Student.class) {
			loop(name + " -> Ask Question");
		}
	}

	public void eat() {
		System.out.println("Begin");
		synchronized (LOCK) {
			loop(name + " -> is Eating");
		}
		System.out.println("End");
	}

	public synchronized void eatXXX() {
		System.out.println("Begin");
		loop(name + " -> is Eating");
		System.out.println("Done");
	}
}
