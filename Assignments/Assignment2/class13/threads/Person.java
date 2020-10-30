package class13.threads;

public class Person {
	public void speak() {
		loop("Speaking");
	}

	public static void loop(String action) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". Person is " + action);
			pause(10);
		}
	}

	public static void pause(int i) {
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

	}

	public void think() {
		loop("Thinking");
	}

	public static void main(String args[]) throws Exception {
		System.out.println("Start");
		// thinkAndSpeakSequentially();
		thinkAndSpeakConcurrently();
		Thread.sleep(20000);
		System.out.println("End");
	}

	private static void thinkAndSpeakConcurrently() throws InterruptedException {
		Person anjali = new Person();
		SpeakingThread speaker = new SpeakingThread(anjali);
		ThinkingThread thinker = new ThinkingThread(anjali);

		speaker.start();
		thinker.start();
		speaker.join();
		thinker.join();
		SpeakingThread anotherSpeaker = new SpeakingThread(anjali);
		anotherSpeaker.start();
		// speaker.yield();
		// thinker.yield();
		// speaker.start();

	}

	private static void thinkAndSpeakSequentially() {
		Person yinxing = new Person();
		yinxing.speak();
		yinxing.think();
	}

}

class ThinkingThread extends Thread {
	Person person;

	ThinkingThread(Person p) {
		this.person = p;
	}

	public void run() {
		person.think();
	}
}

class SpeakingThread extends Thread {
	Person person;

	SpeakingThread(Person p) {
		this.person = p;
	}

	public void run() {
		person.speak();
	}
}
